package com.apress.prospring5.ch3.annotated;

import org.springframework.stereotype.Service;

@Service("lyricHolder")
public class LyricHolder {

	@Override 
	public String toString() {
		return "LyricHolder: { blablabla }";
	}
}
