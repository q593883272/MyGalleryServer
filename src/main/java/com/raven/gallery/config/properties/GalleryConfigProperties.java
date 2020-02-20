package com.raven.gallery.config.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created By Raven on 2020/2/8 21:48
 * 画廊相关配置
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Primary
@Component
@ConfigurationProperties(GalleryConfigProperties.CONFIG_PREFIX)
public class GalleryConfigProperties {

    public static final String CONFIG_PREFIX = "com.raven.gallery.config";

    // 画片文件基础路径
    private String PictorialBaseUri;



}
