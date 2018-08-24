package com.apress.prospring5.ch3.mixed;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringMixed {

	public static void main(String... args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		ctx.getBean("renderer", MessageRenderer.class).render();
	}
}
