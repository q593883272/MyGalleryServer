package com.raven.gallery.web.percolation.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * By Raven 2019/9/29
 * HTTP请求日志拦截类
 */
@Component
public class LoggerInterceptor implements HandlerInterceptor {

    private static final Logger log = LoggerFactory.getLogger(LoggerInterceptor.class);

    private volatile long responseBeginTime = 0L;

    /**
     * 决定拦截
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        responseBeginTime = System.currentTimeMillis();
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 开始日志拦截(HTTP请求拦截) <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        return true;
    }

    /**
     * 处理拦截
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long responseEndTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        sb.append("\n").append("======================== 请求(Request) ========================").append("\n");
        sb.append("客户端IP: ").append(request.getRemoteAddr()).append("\n");
        sb.append("请求URL: ").append(request.getRequestURL().toString()).append("\n");
        sb.append("请求协议: ").append(request.getProtocol()).append("\n");
        sb.append("请求方法: ").append(request.getMethod()).append("\n");
        sb.append("请求时间: ").append((responseEndTime - responseBeginTime)).append("ms").append("\n");
        responseBeginTime = responseEndTime;
        sb.append("======================== 响应(Response) ========================").append("\n");
        sb.append("响应状态: ").append(response.getStatus()).append("\n");
        responseEndTime = System.currentTimeMillis();
        sb.append("响应时间: ").append((responseEndTime - responseBeginTime)).append("ms").append("\n");
        log.info(sb.toString());

    }

    /**
     * 拦截处理之后
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 日志拦截结束(HTTP请求拦截) <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
