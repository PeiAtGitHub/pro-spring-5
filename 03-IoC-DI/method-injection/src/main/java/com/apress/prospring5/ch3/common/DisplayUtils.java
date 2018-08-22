package com.apress.prospring5.ch3.common;

import org.springframework.util.StopWatch;

import com.apress.prospring5.ch3.annotated.Singer;

public class DisplayUtils {

    public static void displayInfo(String beanName, DemoBean bean) {
        System.out.println(
                "[" + beanName + "]: Singer Instances the Same?  " + (bean.getMySinger() == bean.getMySinger()));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookupDemo");
        for (int x = 0; x < 10000; x++) {
            bean.getMySinger();
        }
        stopWatch.stop();
        System.out.println("10000 'getMySinger()' took " + stopWatch.getTotalTimeMillis() + " ms");
    }

}
