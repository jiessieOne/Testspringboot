package com.duying;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@MapperScan("com.duying")
@SpringBootApplication
public class AppTestManyDatasource {

    public static void main( String[] args ){
        SpringApplication.run(AppTestManyDatasource.class,args);
    }

}
