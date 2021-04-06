package com.duying.customError;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class CustomErrorPage {
    /**
     * 生成错误页定制器
     * @return
     */
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> getCustomizer(){
       return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                //声明具体错误页的浏览器状态码和具体的处理路径(不能写具体的处理只能转发到控制层处理)
                ErrorPage errorPage=new ErrorPage(HttpStatus.NOT_FOUND,"/customErrorPage");
                //把错误页添加到定制器工厂生成具体的定制器
                factory.addErrorPages(errorPage);
            }
        };
    }

}



