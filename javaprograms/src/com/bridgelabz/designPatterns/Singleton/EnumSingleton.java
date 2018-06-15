
package com.bridgelabz.designPatterns.Singleton;


public enum EnumSingleton {
 INSTANCE;
    
    public static void doSomething(){
    	System.out.println(INSTANCE.hashCode());
    }
    public static void main(String[] args)
    {
    	EnumSingleton.doSomething();
    }
}