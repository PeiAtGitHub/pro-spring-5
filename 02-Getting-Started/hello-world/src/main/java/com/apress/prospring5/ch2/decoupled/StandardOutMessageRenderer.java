package com.apress.prospring5.ch2.decoupled;

import lombok.Getter;
import lombok.Setter;

public class StandardOutMessageRenderer implements MessageRenderer {

    @Getter
    @Setter
	private MessageProvider messageProvider;

	public StandardOutMessageRenderer(){
		System.out.println("StandardOutMessageRenderer Constructor!");
	}

	@Override
	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException("You must set the property messageProvider of class:"
							+ StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}

}
