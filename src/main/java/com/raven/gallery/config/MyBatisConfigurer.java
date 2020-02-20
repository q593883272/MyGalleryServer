package com.raven.gallery.config;

import com.raven.gallery.utils.MyBatisRedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class MyBatisConfigurer {

    @Autowired
    public void redisTemplate(RedisTemplate<Object, Object> redisTemplate) {
        MyBatisRedisCache.initRedisTemplate(redisTemplate);
    }

}


