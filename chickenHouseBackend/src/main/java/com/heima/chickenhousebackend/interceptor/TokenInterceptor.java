package com.heima.chickenhousebackend.interceptor;

import com.heima.chickenhousebackend.utils.JwtUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.apachecommons.CommonsLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class TokenInterceptor implements HandlerInterceptor {

    private static final Logger log = LoggerFactory.getLogger(TokenInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //1、获取请求路径
        String uri = request.getRequestURI();

        // 放行静态资源请求
        if (uri.startsWith("/static/") || uri.endsWith(".js") || uri.endsWith(".css") || uri.endsWith(".ico")) {
            return true;
        }

        System.out.println("uri = " + uri);
        //2、判断是否是请求登录，如果路径包含/login，为登录操作，放行
        if(uri.contains("/login")||uri.contains("/uploadVideo")||uri.contains("/uploadVImg")||uri.contains("/uploadTImg")||uri.contains("/pageImgPost")||uri.contains("/userAvatar") ){
            log.info("登录请求，放行");
            return true;
        }

        //3、获取请求头中的token
        String token = request.getHeader("token");
        System.out.println("token = " + token);
        //4、判断token是否存在，如果不存在，说明用户没登陆，返回错误信息
        if(token == null || token.isEmpty()){
            log.info("令牌为空，响应401");
            response.setStatus(401);
            return false;
        }

        //5、如果token存在，校验令牌，如果校验失败，返回错误信息401
        try {
            JwtUtils.parseToken(token);
        }catch (Exception e){
            log.info("令牌为空，响应401");
            response.setStatus(401);
            return false;
        }

        //6、校验通过，放行
        log.info("令牌合法，放行");
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

}
