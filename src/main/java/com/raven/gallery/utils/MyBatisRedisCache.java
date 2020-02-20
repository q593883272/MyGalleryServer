package com.raven.gallery.utils;

import org.apache.ibatis.cache.Cache;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * MyBatis缓存(Redis)
 */
public class MyBatisRedisCache implements Cache {

    private final String id;
    private final ReadWriteLock readWriteLock;
    private static RedisTemplate<Object, Object> redisTemplate;

    public MyBatisRedisCache(String id) {
        if (id == null)
            throw new IllegalArgumentException("Cache instance requires an ID");
        this.id = id;
        this.readWriteLock = new ReentrantReadWriteLock();
    }

    /**
     * 初始化Redis模板
     */
    public static void initRedisTemplate(RedisTemplate<Object, Object> template) {
        redisTemplate = template;
        JdkSerializationRedisSerializer jdkRedisSerializer = new JdkSerializationRedisSerializer();
        //Key序列化
        template.setKeySerializer(jdkRedisSerializer);
        //Value序列化
        template.setValueSerializer(jdkRedisSerializer);
        //Hash Key序列化
        template.setHashKeySerializer(jdkRedisSerializer);
        //Hash Value序列化
        template.setHashValueSerializer(jdkRedisSerializer);
        //开启事务
        template.setEnableTransactionSupport(true);
    }

    /**
     * 获取缓存Id
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * 添加缓存
     */
    @Override
    public void putObject(Object key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    /**
     * 获取缓存
     */
    @Override
    public Object getObject(Object key) {
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 删除缓存
     */
    @Override
    public Object removeObject(Object key) {
        return redisTemplate.delete(key);
    }

    /**
     * 清空缓存
     */
    @Override
    public void clear() {
        redisTemplate.execute((RedisCallback<Object>) connection -> {
            connection.flushDb();
            connection.flushAll();
            return null;
        });
    }

    /**
     * 缓存的数目(可选项，核心不会调用该方法)
     */
    @Override
    public int getSize() {
        return 0;
    }

    /**
     * 读写锁
     */
    @Override
    public ReadWriteLock getReadWriteLock() {
        return readWriteLock;
    }
}
