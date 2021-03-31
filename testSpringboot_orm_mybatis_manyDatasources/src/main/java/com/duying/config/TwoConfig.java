package com.duying.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@MapperScan(basePackages ="com.duying.dao2",sqlSessionFactoryRef = "sqlSessionFactory2")
@Configuration
public class TwoConfig {
    @Autowired
    @Qualifier("db2")
    private DataSource dataSource;
    /**
     * @return sqlSession工厂
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory2() throws Exception {
        SqlSessionFactoryBean factoryBean=new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        return factoryBean.getObject();
    }
    /**
     * @return  SqlSessionTemplate需要sqlSession工厂
     * @throws Exception
     */
    @Bean
    public SqlSessionTemplate sqlSessionTemplate2() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory2());
    }


}
