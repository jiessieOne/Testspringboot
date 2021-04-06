//package com.duying.filter;
//
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class FilterConfig {
//    @Bean
//    public MyFilter myFilter(){
//        return new MyFilter();
//    }
//
//    @Bean
//    public FilterRegistrationBean<MyFilter> filterFilterRegistrationBean(){
//        //创建拦截注册器
//        FilterRegistrationBean<MyFilter> registrationBean=new FilterRegistrationBean<>();
//        //添加拦截器
//        registrationBean.setFilter(myFilter());
//        //具体的拦截请求
//        registrationBean.addUrlPatterns("/*");
////        registrationBean.setOrder(0);值越小优先级越高
//        return registrationBean;
//    }
//
//}
