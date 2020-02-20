package com.raven.gallery.web.api;

import com.raven.gallery.config.properties.GalleryConfigProperties;
import com.raven.gallery.web.ApiRespEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created By Raven on 2020/2/8 22:02
 * 画片文件控制器
 */
@Slf4j
@RestController
@RequestMapping({"/pictorial/file"})
public class PictorialFileController {

    private static final String GET_IMAGE_PATH = "/pictorial/file/get/";

    private final Path path;

    private GalleryConfigProperties galleryConfig;

    @Autowired
    public PictorialFileController(GalleryConfigProperties galleryConfig) {
        this.path = Paths.get(galleryConfig.getPictorialBaseUri());
        this.galleryConfig = galleryConfig;
    }

    /**
     * 获取画片文件(直接获取源文件)
     */
    @GetMapping(value = "/get/**", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_GIF_VALUE, MediaType.IMAGE_PNG_VALUE})
    @ResponseBody
    public ResponseEntity getPictorialFile(HttpServletRequest request) {
        String uri = request.getRequestURI();
        String filePath = uri.substring(GET_IMAGE_PATH.length());
        if (filePath.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Path path = this.path.resolve(filePath);
        if (!path.toFile().exists()) {
            return ResponseEntity.notFound().build();
        }
        log.info("图片路径：{}", filePath);
        try {
            return ResponseEntity.ok(Files.readAllBytes(path));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


    /**
     * 获取画片文件(获取画片URL)
     */
    @GetMapping(value = "/get/**")
    public ApiRespEntity getPictorialFileUrl(HttpServletRequest request) {
        String uri = request.getRequestURI();
        String filePath = uri.substring(GET_IMAGE_PATH.length());
        if (filePath.isEmpty()) {
            return ApiRespEntity.success("画片路径为空!");
        }
        log.info("图片路径：{}", filePath);
        try {
            return ApiRespEntity.success(galleryConfig.getPictorialBaseUri() + filePath);
        } catch (Exception e) {
            return ApiRespEntity.failure("获取画片失败!");
        }
    }


    /**
     * 上传画片文件
     */
    @PostMapping("/upload")
    @ResponseBody
    public ResponseEntity uploadPictorialFile(@RequestParam("image") MultipartFile[] files) {
        if (files == null || files.length == 0) {
            return ResponseEntity.notFound().build();
        }
        try {
            for (MultipartFile file : files) {
                if (!file.isEmpty()) {
                    Files.copy(file.getInputStream(), path.resolve(file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
                }
            }
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


}
