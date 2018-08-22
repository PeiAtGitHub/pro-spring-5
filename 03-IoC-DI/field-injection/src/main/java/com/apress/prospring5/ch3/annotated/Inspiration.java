package com.apress.prospring5.ch3.annotated;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
public class Inspiration {

    @Getter
    @Setter
	private String lyric = "this is the default lyrics";

	public Inspiration(@Value("For all my running, I can understand") String lyric) {
		this.lyric = lyric;
	}

}
