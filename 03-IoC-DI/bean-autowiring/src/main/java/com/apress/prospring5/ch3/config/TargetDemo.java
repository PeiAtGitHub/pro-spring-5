package com.apress.prospring5.ch3.config;

import com.apress.prospring5.ch3.sandbox.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

public class TargetDemo {
    
    public static void main(String[] args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(TargetConfig.class);
        System.out.println(ctx.getBean(TrickyTarget.class).toString());
        ctx.close();
    }

	@Configuration
	static class TargetConfig {

		@Bean
		public Foo fooImplOne() {
			return new FooImplOne();
		}

		@Bean
		public Foo fooImplTwo() {
			return new FooImplTwo();
		}

		@Bean
		public Bar bar() {
			return new Bar();
		}

		@Bean
		public TrickyTarget trickyTarget() {
			return new TrickyTarget();
		}
	}

}
