
package com.bridgelabz.designPatterns.Singleton;


public class StaticBlockSingleton {
private static StaticBlockSingleton instance;
    
    private StaticBlockSingleton(){}
    
    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static StaticBlockSingleton getInstance(){
    	System.out.println(instance);
        return instance;
    }

	
	public static void main(String[] args) {
		StaticBlockSingleton s1=new StaticBlockSingleton();
		s1.getInstance();
		StaticBlockSingleton s2=new StaticBlockSingleton();
        s2.getInstance();
	}

}
