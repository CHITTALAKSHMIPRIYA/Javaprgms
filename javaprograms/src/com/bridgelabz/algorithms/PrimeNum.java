/*************************************************************************************************************
 * 
 * purpose:print prime numbers from 0 to 1000
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 19-05-17
 * 
 * **************************************************************************************************/
package com.bridgelabz.algorithms;
import com.bridgelabz.util.Utility;
public class PrimeNum {
   public static void main(String[] args) {
	   System.out.println("enter start");
	   int start=Utility.Int();
	   System.out.println("enter end");
	   int end=Utility.Int();
	   System.out.println("enter count");
	   int count=Utility.Int();
	   Utility.prime(start,end,count);
   }
}


