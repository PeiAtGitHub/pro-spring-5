package com.apress.prospring5.ch3.config;

import com.apress.prospring5.ch3.common.DemoBean;
import com.apress.prospring5.ch3.common.DisplayUtils;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

public class LookupConfigDemo {

    @Configuration
    @ComponentScan(basePackages = { "com.apress.prospring5.ch3.annotated" })
    public static class LookupConfig {
    }

    public static void main(String... args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(LookupConfig.class);
        for(String beanName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
        System.out.println("===========");

        DisplayUtils.displayInfo("abstractLookupBean", ctx.getBean("abstractLookupBean", DemoBean.class));
        DisplayUtils.displayInfo("standardLookupBean", ctx.getBean("standardLookupBean", DemoBean.class));

        ctx.close();
    }

}
