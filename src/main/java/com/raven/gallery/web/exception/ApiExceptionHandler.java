package com.raven.gallery.web.exception;

import com.raven.gallery.web.ApiRespEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created By Raven on 2020/2/7 14:25
 * API异常处理类
 */
@Slf4j
@RestControllerAdvice("com.raven.gallery.web.*")
public class ApiExceptionHandler {

    /**
     * 捕获所有异常
     *
     * @return 暴露的异常信息
     */
    @ExceptionHandler(Throwable.class)
    public ApiRespEntity exception(Throwable throwable) {
        return ApiRespEntity.failure(throwable.getClass().getName() + ": " + throwable.getMessage());
    }

}
