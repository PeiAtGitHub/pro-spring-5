package com.apress.prospring5.ch3.xml;

import com.apress.prospring5.ch2.decoupled.MessageProvider;

import lombok.Getter;
import lombok.Setter;

public class ConfigurableMessageProvider implements MessageProvider {
    
    @Getter
    @Setter
	private String message = "Default message";

	public ConfigurableMessageProvider() {
	}

	public ConfigurableMessageProvider(String message) {
		this.message = message;
	}

}
