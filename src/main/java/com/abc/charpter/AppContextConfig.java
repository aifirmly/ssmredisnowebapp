package com.abc.charpter;

import com.abc.charpter._09IOC.AppBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * Created by lihj on 2019/11/2.
 */
// 使用AnnotationConfigApplicationContext可以不用@Configuration
//@Configuration
@ComponentScan(basePackages = {"com.abc.charpter"})//{}是数组形式
@Import({AppBean.class})//等价于@Configuration
@PropertySource(value = {"classpath:dababase.properties"},ignoreResourceNotFound = true)
public class AppContextConfig {
}
