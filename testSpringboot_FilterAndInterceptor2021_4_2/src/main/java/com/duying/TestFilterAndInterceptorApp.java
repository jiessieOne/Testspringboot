package com.duying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ServletComponentScan
public class TestFilterAndInterceptorApp {
    public static void main( String[] args ){
        SpringApplication.run(TestFilterAndInterceptorApp.class,args);
    }
}
