package com.apress.prospring5.ch3;

import com.apress.prospring5.ch3.annotated.Singer;

import pei.java.spring.lab.utils.Utils;

import org.springframework.context.support.GenericXmlApplicationContext;

public class NonSingletonDemo {

    public static void main(String... args) {

        GenericXmlApplicationContext ctx = Utils
                .getGenericXmlApplicationContext("classpath:spring/app-context-annotated.xml");
//        .getGenericXmlApplicationContext("classpath:spring/app-context-xml.xml");

        Singer singer1 = ctx.getBean("nonSingleton", Singer.class);
        Singer singer2 = ctx.getBean("nonSingleton", Singer.class);

        System.out.println("Identity Equal?: " + (singer1 == singer2));
        System.out.println("Value Equal:? " + singer1.equals(singer2));
        System.out.println(singer1);
        System.out.println(singer2);

        ctx.close();
    }
}
