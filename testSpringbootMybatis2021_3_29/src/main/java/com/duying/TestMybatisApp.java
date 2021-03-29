package com.duying;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.duying.dao")
public class TestMybatisApp {

    public static void main( String[] args ){
        SpringApplication.run(TestMybatisApp.class,args);
    }


}
