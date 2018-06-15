
package com.bridgelabz.designPatterns.Singleton;


public class BillPughSingleton {
   private BillPughSingleton() {}
   public static class SingletonHelper{
	   private static final BillPughSingleton instance=new BillPughSingleton();
   }
   public static BillPughSingleton getInstance()
   {
	   System.out.println(SingletonHelper.instance.hashCode());
	return SingletonHelper.instance;
	   
   }
	
	public static void main(String[] args) {
		BillPughSingleton b1=new BillPughSingleton();
		b1.getInstance();
		BillPughSingleton b2=new BillPughSingleton();
		b2.getInstance();
	}

}
