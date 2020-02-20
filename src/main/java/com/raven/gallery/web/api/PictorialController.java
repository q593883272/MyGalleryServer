package com.raven.gallery.web.api;

import com.raven.gallery.data.nosql.po.pictorial.PictorialInfo;
import com.raven.gallery.web.ApiRespEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;

/**
 * Created By Raven on 2020/2/8 15:59
 * 画片控制器
 */
@Slf4j
@RestController
@RequestMapping({"/pictorial"})
public class PictorialController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping({"", "/", "/info"})
    public ApiRespEntity findInfoAll() {
        return ApiRespEntity.success(mongoTemplate.query(PictorialInfo.class).all());
    }


}
