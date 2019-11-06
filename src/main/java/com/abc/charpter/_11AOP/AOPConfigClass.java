package com.abc.charpter._11AOP;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created on 2019/11/5 in ssmredisnowebapp 项目 .
 */
@EnableAspectJAutoProxy
@Configuration
@ComponentScan("com.abc.charpter._11AOP")
public class AOPConfigClass {
    @Bean
    public  AspectConfig aspectConfig(){
        return  new AspectConfig();
    }
}
