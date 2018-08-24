package com.apress.prospring5.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import lombok.Setter;
import lombok.ToString;
import pei.java.spring.lab.utils.Utils;

@Setter
@ToString
public class InjectSimpleSpel {
    
    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private Long ageInSeconds;

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = Utils.getGenericXmlAppCtx("classpath:spring/app-context-xml.xml");
        System.out.println((InjectSimpleSpel)ctx.getBean("injectSimpleSpel"));
        ctx.close();
    }
    
}
