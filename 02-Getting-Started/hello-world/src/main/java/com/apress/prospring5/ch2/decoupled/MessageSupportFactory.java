package com.apress.prospring5.ch2.decoupled;

import java.util.Properties;

public class MessageSupportFactory {

	private static MessageSupportFactory instance;
	private Properties props;
	private MessageRenderer renderer;
	private MessageProvider provider;

	private MessageSupportFactory() {
		props = new Properties();
		try {
			props.load(this.getClass().getResourceAsStream("/msf.properties"));
			renderer = (MessageRenderer) Class.forName(props.getProperty("renderer.class")).newInstance();
			provider = (MessageProvider) Class.forName(props.getProperty("provider.class")).newInstance();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	static {
		instance = new MessageSupportFactory();
	}

	public static MessageSupportFactory getInstance() {
		return instance;
	}

	public MessageRenderer getMessageRenderer() {
		return renderer;
	}

	public MessageProvider getMessageProvider() {
		return provider;
	}
}
