package com.abc.charpter._09IOC;

import com.abc.charpter.AppContextConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
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
@ContextConfiguration(classes = {AppContextConfig.class}) //此注解用来加载配置ApplicationContext
public class CharpterTest {
    @Autowired
    @Qualifier(value = "druid")//报红 不影响 灯泡可去红
    private DataSource druid;  //static 加载时 @Bean的druid还没初始化好 ，为null
    @Value(value = "lhj")
    private  String name;

    @Value(value = "${jdbc.password}")
    private  String password;

    @Test
    public void test(){
        System.out.println(name+"   >>> "+password+"   >>> "+druid);
    }
}
