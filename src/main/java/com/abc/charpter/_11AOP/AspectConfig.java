package com.abc.charpter._11AOP;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created on 2019/11/4 in ssmredisnowebapp 项目 .
 */
@Aspect
public class AspectConfig {

    @Before("pointCut()")
    public  void before(){
        System.out.println("before....");
    }
    @After("pointCut()")
    public  void after(){
        System.out.println("after....");
    }
    @AfterThrowing("pointCut()")
    public void  throwing(){
        System.out.println("throwing....");
    }

    @Pointcut("execution(* com.abc.charpter._11AOP.impl.RoleServiceImpl.printRole(..))")
    public void  pointCut(){
    }

}
