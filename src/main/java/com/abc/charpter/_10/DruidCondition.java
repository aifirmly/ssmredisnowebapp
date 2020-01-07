package com.abc.charpter._10;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by lihj on 2019/11/3.
 */

//不需要贴@Component
public class DruidCondition implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env= conditionContext.getEnvironment();
        System.out.println("lhj");
System.out.println("lhj");
        return env.containsProperty("jdbc.driver")
                &&env.containsProperty("jdbc.username")
                &&env.containsProperty("jdbc.password");
    }
}
