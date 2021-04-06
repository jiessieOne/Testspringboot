package com.duying.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    Interceptor interceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器+拦截的请求
        registry.addInterceptor(interceptor).addPathPatterns("/*");
    }

}
