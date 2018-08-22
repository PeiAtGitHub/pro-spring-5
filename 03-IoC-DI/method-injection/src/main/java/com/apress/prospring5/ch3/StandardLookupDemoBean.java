package com.apress.prospring5.ch3;

import com.apress.prospring5.ch3.annotated.Singer;
import com.apress.prospring5.ch3.common.DemoBean;

import lombok.Getter;
import lombok.Setter;

public class StandardLookupDemoBean implements DemoBean {

    @Getter
    @Setter
	private Singer mySinger;

	@Override
	public void doSomething() {
		mySinger.sing();
	}
}
