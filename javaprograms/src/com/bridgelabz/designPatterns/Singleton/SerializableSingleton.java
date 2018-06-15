
package com.bridgelabz.designPatterns.Singleton;

import com.bridgelabz.designPatterns.Singleton.BillPughSingleton.SingletonHelper;

public class SerializableSingleton {
	 private static final long serialVersionUID = -7604766932017737115L;

	    private SerializableSingleton(){}
	    
	    private static class SingletonHelper{
	        private static final SerializableSingleton instance = new SerializableSingleton();
	    }
	    
	    public static SerializableSingleton getInstance(){
	    	 System.out.println(SingletonHelper.instance.hashCode());
	        return SingletonHelper.instance;
	    }
	
	public static void main(String[] args) {
		SerializableSingleton s1=new SerializableSingleton();
		s1.getInstance();
		SerializableSingleton s2=new SerializableSingleton();
		s2.getInstance();

	}

}
