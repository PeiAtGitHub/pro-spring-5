package com.apress.prospring5.ch2.decoupled;

public class HelloWorldDecoupled {
    
    public static void main(String... args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        mr.setMessageProvider(new HelloWorldMessageProvider());
        mr.render();
    }
    
}
