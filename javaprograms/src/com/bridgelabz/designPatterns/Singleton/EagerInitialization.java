
package com.bridgelabz.designPatterns.Singleton;


public class EagerInitialization {
private static final EagerInitialization instance = new EagerInitialization();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitialization(){}

    public static EagerInitialization getInstance(){
    	System.out.println(instance);
        return instance;
    }
	
	public static void main(String[] args) {
		EagerInitialization i1=new EagerInitialization();
		i1.getInstance();
		EagerInitialization i2=new EagerInitialization();
		i2.getInstance();
		
	}
	}
