
package com.bridgelabz.designPatterns.Singleton;


public class LazyInitialization {
private static LazyInitialization instance;
    
    private LazyInitialization(){}
    
    public static LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
        }
        System.out.println(instance);
        return instance;
    }

	
	public static void main(String[] args) {
		LazyInitialization l1=new LazyInitialization();
		l1.getInstance();
		LazyInitialization l2=new LazyInitialization();
		l2.getInstance();

	}

}
