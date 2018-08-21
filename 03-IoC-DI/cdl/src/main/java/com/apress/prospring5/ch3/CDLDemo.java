package com.apress.prospring5.ch3;

public class CDLDemo {
    public static void main(String... args) {
        
    	ManagedComponent managedComponent = new ContextualizedDependencyLookup();
    	managedComponent.performLookup(new DefaultContainer());

    	System.out.println(managedComponent);
    }
}
