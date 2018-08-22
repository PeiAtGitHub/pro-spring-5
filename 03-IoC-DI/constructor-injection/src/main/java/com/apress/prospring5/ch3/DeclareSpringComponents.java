package com.apress.prospring5.ch3;

import com.apress.prospring5.ch2.decoupled.MessageProvider;

import pei.java.spring.lab.utils.Utils;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = Utils.getGenericXmlAppCtx("classpath:spring/app-context-annotation.xml");
        System.out.println(ctx.getBean("provider", MessageProvider.class).getMessage());
        ctx.close();
    }
}
