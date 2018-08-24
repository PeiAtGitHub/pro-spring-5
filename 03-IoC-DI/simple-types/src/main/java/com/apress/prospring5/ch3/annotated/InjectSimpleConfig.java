package com.apress.prospring5.ch3.annotated;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component("injectSimpleConfig")
public class InjectSimpleConfig {

	private String name = "John Mayer";
	private int age = 40;
	private float height = 1.92f;
	private boolean programmer = false;
	private Long ageInSeconds = 1_241_401_112L;

}
