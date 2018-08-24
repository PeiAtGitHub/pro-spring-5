package com.apress.prospring5.ch3;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {

	public static void main(String... args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		new XmlBeanDefinitionReader(factory).loadBeanDefinitions(new ClassPathResource("spring/xml-bean-factory-config.xml"));
		System.out.println(((BookwormOracle) factory.getBean("oracle")).defineMeaningOfLife());
	}
}
