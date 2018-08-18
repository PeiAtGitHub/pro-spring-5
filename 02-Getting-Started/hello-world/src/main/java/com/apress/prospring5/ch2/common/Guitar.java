package com.apress.prospring5.ch2.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Guitar {
    
	private String brand =" Martin";

	public String play(){
		return "G C G C Am D7";
	}

}
