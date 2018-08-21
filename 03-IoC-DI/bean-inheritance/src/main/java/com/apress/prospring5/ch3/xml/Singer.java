package com.apress.prospring5.ch3.xml;

import lombok.Setter;

@Setter
public class Singer {
    
    private String name;
    private int age;

    public String toString() {
        return "\tName: " + name + "\n\t" + "Age: " + age;
    }
    
}
