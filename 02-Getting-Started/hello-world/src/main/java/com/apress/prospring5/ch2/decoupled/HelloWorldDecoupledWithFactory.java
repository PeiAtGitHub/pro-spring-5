package com.apress.prospring5.ch2.decoupled;

public class HelloWorldDecoupledWithFactory {

	public static void main(String... args) {
		MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
		mr.setMessageProvider(MessageSupportFactory.getInstance().getMessageProvider());
		mr.render();
	}
}
