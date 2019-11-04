package com.abc.charpter;


import com.abc.charpter._09IOC.JuiceMaker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * Created by lihj on 2019/11/3.
 */
@RunWith(SpringJUnit4ClassRunner.class) //表示该测试用例是运用junit4进行测试，也可以换成其他测试框架
//@ContextConfiguration就初始化了IOC？ 所以可@Autowired
@ContextConfiguration(classes = {AppContextConfig.class}) //此注解用来加载配置ApplicationContext
public class CharpterTest {
    private Logger logger = LoggerFactory.getLogger(CharpterTest.class);
    @Autowired
    @Qualifier(value = "druid")
    private DataSource druid;  //static 加载时 @Bean的druid还没初始化好 ，为null
    @Value(value = "lhj")
    private  String name;
    @Value(value = "${jdbc.password}")
    private  String password;
    @Autowired
    private JuiceMaker juiceMaker;


    @Test
    public void test(){
        System.out.println(name+"   >>> "+password+"   >>> "+druid);
        logger.error("name:{},password:{},druid:{}",name,password,druid);
        juiceMaker.eat("红烧排骨");
    }
}
