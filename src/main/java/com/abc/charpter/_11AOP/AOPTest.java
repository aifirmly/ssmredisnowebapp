package com.abc.charpter._11AOP;


import com.abc.charpter._11AOP.impl.RoleService;
import com.abc.charpter._11AOP.vo.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created on 2019/11/3 in ssmredisnowebapp 项目 .
 */
@RunWith(SpringJUnit4ClassRunner.class) //表示该测试用例是运用junit4进行测试，也可以换成其他测试框架
//@ContextConfiguration就初始化了IOC？ 所以可@Autowired
@ContextConfiguration(classes = {AOPConfigClass.class}) //此注解用来加载配置ApplicationContext

public class AOPTest {
    private Logger logger = LoggerFactory.getLogger(AOPTest.class);

    @Autowired
    private RoleService roleService;

    @Test
    public void test(){
        Role role= new Role();
        role.setName("出文康");
        roleService.printRole(role);
    }
    @Bean
    public  AspectConfig aspectConfig(){
        return  new AspectConfig();
    }
}
