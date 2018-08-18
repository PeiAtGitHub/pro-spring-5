package com.apress.prospring5.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class BeanCrazyNaming {

	public static void main(String... args) {
	    
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-03.xml");
		ctx.refresh();
		
		Map<String, String> beans = ctx.getBeansOfType(String.class);
		beans.entrySet().stream().forEach(b ->
				{
                    String id = b.getKey();
                    System.out.println("id: " + id + "\n aliases: " + Arrays.toString(ctx.getAliases(id)));
                }
		);
		
		ctx.close();
		
	}
}
