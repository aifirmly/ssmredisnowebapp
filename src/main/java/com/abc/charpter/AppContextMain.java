package com.abc.charpter;

import com.abc.charpter._09IOC.AppBean;
import com.abc.charpter._09IOC.JuiceMaker;
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
@ComponentScan(basePackages = {"com.abc.charpter"})
@Import({AppBean.class})
@PropertySource(value = "classpath:dababase.properties")
public class AppContextMain {
    @Autowired
    @Qualifier(value = "druid")
    private static   DataSource druid;  //static 加载时 @Bean的druid还没初始化好 ，为null
    @Value(value = "lhj")
    private static String name;
    @Value(value = "${jdbc.password}")
    private static String password;


    public static void main(String[] args) {
        ApplicationContext appContext=new AnnotationConfigApplicationContext(AppContextMain.class);
        JuiceMaker juiceMaker=(JuiceMaker)appContext.getBean("juiceMaker");
        juiceMaker.eat("apple");
         DataSource druid= (DataSource)appContext.getBean("druid");
        System.out.println(druid);
         String username=  appContext.getEnvironment().getProperty("jdbc.username");
        System.out.println(password+username+"   name    >>>     "+name+"   name    >>>     "+username);
    }
}
