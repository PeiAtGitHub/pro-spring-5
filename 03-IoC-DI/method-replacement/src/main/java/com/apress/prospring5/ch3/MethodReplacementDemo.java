package com.apress.prospring5.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

import pei.java.spring.lab.utils.Utils; 

public class MethodReplacementDemo {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = Utils.getGenericXmlAppCtx("classpath:spring/app-context-xml.xml");

        displayInfo((ReplacementTarget) ctx.getBean("standardTarget"));
        displayInfo((ReplacementTarget) ctx.getBean("replacementTarget"));

        ctx.close();
    }

    private static void displayInfo(ReplacementTarget target) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("perfTest");

        System.out.println(target.formatMessage("Thanks for playing!!!"));
        for (int x = 0; x < 1000000; x++) {
            target.formatMessage("Thanks for playing!!!");
        }
        stopWatch.stop();

        System.out.println("1000001 invocations took: " + stopWatch.getTotalTimeMillis() + " ms");
    } 
}
