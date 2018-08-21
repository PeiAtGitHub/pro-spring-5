package com.apress.prospring5.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import lombok.Setter;
import pei.java.spring.lab.utils.Utils;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Setter
public class CollectionInjection {

	private Map<String, Object> map;
	private Properties props;
	private Set set;
	private List list;

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = Utils.getGenericXmlAppCtx("classpath:spring/app-context-xml.xml");
		((CollectionInjection) ctx.getBean("injectCollection")).displayInfo();
		ctx.close();
	}

	public void displayInfo() {
        System.out.println("Map contents:" + map.toString());
        System.out.println("Properties contents:" + props.toString());
        System.out.println("Set contents:" + set.toString());
        System.out.println("List contents:" + list.toString());
    }

}
