package com.apress.prospring5.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;
import com.apress.prospring5.ch3.common.DemoBean;
import com.apress.prospring5.ch3.common.DisplayUtils;

import pei.java.spring.lab.utils.Utils;

public class LookupDemo {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = Utils.getGenericXmlAppCtx("classpath:spring/app-context-xml.xml");

        DisplayUtils.displayInfo("abstractLookupBean", ctx.getBean("abstractLookupBean", DemoBean.class));
        DisplayUtils.displayInfo("standardLookupBean", ctx.getBean("standardLookupBean", DemoBean.class));

        ctx.close();
    }

}
