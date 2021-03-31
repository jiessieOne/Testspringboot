package com.duying.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;


@Configuration
public class DBConfig {

    /*配置第一个数据源*/
    @Bean(name = "db1")
    @ConfigurationProperties( "spring.datasource.db1")
    public DataSource dataSources(){
        return (DataSource) DataSourceBuilder.create().build();
    }

    /*配置第二个数据源*/
    @Bean(name = "db2")
    @ConfigurationProperties("spring.datasource.db2")
    public DataSource dataSources2(){
        return (DataSource) DataSourceBuilder.create().build();
    }
}
