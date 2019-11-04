package com.abc.charpter._09IOC;

import com.abc.charpter._10.DruidCondition;
import com.alibaba.druid.pool.DruidDataSource;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.sql.DataSource;

/**
 * Created by lihj on 2019/11/2.
 */
//@Configuration

public class AppBean {

    @Bean(value = "druid")
    @Conditional({DruidCondition.class})
    public DataSource  dataSource(){
        return new DruidDataSource();
    }
    //注释了也可以解析占位符 为啥？
    /*@Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }*/


}
