package com.apress.prospring5.ch3.annotated;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pei.java.spring.lab.utils.Utils;

import org.springframework.context.support.GenericXmlApplicationContext;

import javax.annotation.Resource;

@Service("injectCollection")
public class CollectionInjection {

    /**
     * @Resource(name="map") is equivalent with 
     * @Autowired @Qualifier("map")
     */
    @Autowired
    @Qualifier("map")
    private Map<String, Object> map;

    @Resource(name="props")
    private Properties props;

    @Resource(name="set")
    private Set set;
    
    @Resource(name="list")
    private List list;

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = Utils.getGenericXmlAppCtx("classpath:spring/app-context-annotation.xml");
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
