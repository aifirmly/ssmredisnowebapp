package com.abc.charpter._09IOC;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by lihj on 2019/11/2.
 */

@Component(value="juiceMaker")
public class JuiceMaker implements BeanNameAware ,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean{

    private ApplicationContext applicationContext;
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory   >>>>>   "+this.getClass().getSimpleName());
    }

    public void setBeanName(String s) {
        System.out.println("setBeanName   >>>>>   "+this.getClass().getSimpleName());
    }

    public void destroy() throws Exception {
        System.out.println("destroy   >>>>>   "+this.getClass().getSimpleName());
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet   >>>>>   "+this.getClass().getSimpleName());
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
        System.out.println("applicationContext      >>>>>   "+applicationContext);
    }
    @PostConstruct
    public void init(){
        System.out.println("自定义init   >>>>>   "+this.getClass().getSimpleName());
    }
    public void destory(){
        System.out.println("自定义destroy   >>>>>   "+this.getClass().getSimpleName());
    }

    public void eat(String what) {
        System.out.println("正在吃........"+what  +" >>>>>   "+this.getClass().getSimpleName());
    }
}
