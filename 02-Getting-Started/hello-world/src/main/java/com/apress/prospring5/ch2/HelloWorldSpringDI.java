package com.apress.prospring5.ch2;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {
    
    public static void main(String... args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context.xml");
        ctx.getBean("renderer", MessageRenderer.class).render(); // Renderer contains Provider
    }
    
}
