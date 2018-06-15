
package com.bridgelabz.designPatterns.Singleton;


public class ThreadSafeSingleton {
  private static ThreadSafeSingleton instance;
  private ThreadSafeSingleton() {}
   public static synchronized ThreadSafeSingleton getInstance()
   {
	   if(instance==null)
	   {
		   instance=new ThreadSafeSingleton();
	   }
	   System.out.println(instance);
	return instance;
   }
	
	public static void main(String[] args) {
		ThreadSafeSingleton t1=new ThreadSafeSingleton();
		t1.getInstance();
		ThreadSafeSingleton t2=new ThreadSafeSingleton();
		t2.getInstance();

	}

}
