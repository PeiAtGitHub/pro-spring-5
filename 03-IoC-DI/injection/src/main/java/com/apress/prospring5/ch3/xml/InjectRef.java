package com.apress.prospring5.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;
import com.apress.prospring5.ch3.Oracle;

import lombok.Setter;
import pei.java.spring.lab.utils.Utils;

public class InjectRef {
    @Setter
    private Oracle oracle;

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = Utils.getGenericXmlAppCtx("classpath:spring/app-context-xml.xml");
        System.out.println((InjectRef) ctx.getBean("injectRef"));
        ctx.close();
    }

    public String toString() {
        return oracle.defineMeaningOfLife();
    }
}
