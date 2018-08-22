package com.apress.prospring5.ch3;

import com.apress.prospring5.ch3.annotated.Singer;
import com.apress.prospring5.ch3.common.DemoBean;

public abstract class AbstractLookupDemoBean implements DemoBean {
    public abstract Singer getMySinger();

    @Override
    public void doSomething() {
        getMySinger().sing();
    }
}
