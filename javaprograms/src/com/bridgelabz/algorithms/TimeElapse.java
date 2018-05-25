/*************************************************************************************************************
 * 
 * purpose:Print elapsed time for insertion,bubble and binary search
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 21-05-17
 * 
 * **************************************************************************************************/

package com.bridgelabz.algorithms;
import com.bridgelabz.util.Utility;
public class TimeElapse {
   public static void main(String[] args) 
   {
		System.out.println("enter array size");
		int size=Utility.Int();
		Integer intAr[]=new Integer[size];
		String strAr[]=new String[size];
		System.out.println("enter integer type array");
		for(int i=0;i<intAr.length;i++) {
			intAr[i]=Utility.Int();
		}
		System.out.println("enter string type array");
		for(int i=0;i<strAr.length;i++) {
			strAr[i]=Utility.String();
		}
		Utility.printArray(intAr);
		Utility.printArray(strAr);
		System.out.println("enter the number to find");
		long start=0;
		long end=0;
		int key=Utility.Int();
		String key1=Utility.String();
		start=(int)System.currentTimeMillis();	
      Utility.bubbleSort(intAr);
      Utility.binarySearch(intAr,key);
      end=(int)System.currentTimeMillis();	
      System.out.println("time to search integer using binary search:"+(end-start)+ " ms");
      
      System.out.println("enter the word to find");
      String string=Utility.String();
      start=(int)System.currentTimeMillis();	
      Utility.bubbleSort(strAr);
      Utility.binarySearch(strAr,key1);
      end=(int)System.currentTimeMillis();	
      
      System.out.println("time to search char using binary search:"+(end-start)+ " ms");
      System.out.println("=============================================");
         
      start=(int)System.currentTimeMillis();
      Utility.insertionSort(intAr);
      Utility.printArray(intAr);
      end=(int)System.currentTimeMillis();	
      System.out.println("time to sort integer using insertionsort:"+(end-start)+ " ms");
      System.out.println("=============================================");
      
      start=(int)System.currentTimeMillis();
      Utility.insertionSort(strAr);
      Utility.printArray(strAr);
      end=(int)System.currentTimeMillis();	
      System.out.println("time to sort char using insertionsort:"+(end-start)+ " ms");
      
      start=(int)System.currentTimeMillis();
      Utility.bubbleSort(intAr);
      Utility.printArray(intAr);
      end=(int)System.currentTimeMillis();	
      System.out.println("time to sort integer using bubblesort:"+(end-start)+ " ms");
      System.out.println("=============================================");
      
      start=(int)System.currentTimeMillis();
      Utility.bubbleSort(strAr);
      Utility.printArray(strAr);
      end=(int)System.currentTimeMillis();	
      System.out.println("time to sort char using bubblesort:"+(end-start)+ " ms");
      System.out.println("=============================================");
      
}
}