/*************************************************************************************************************
 * 
 * purpose:Read in Strings and print them using MERGE SORT
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 21-05-17
 * 
 * **************************************************************************************************/

package com.bridgelabz.algorithms;
import com.bridgelabz.util.Utility;

public class MergeSort {
   public static void main(String[] args) {
		System.out.println("enter array size");
		int size=Utility.Int();
		String ar[]=new String[size];
		for(int i=0;i<size;i++)
		{
			ar[i]=Utility.String();
		}
		Utility.printArray(ar);
		Utility.mergeSort(ar, 0, size-1);
		Utility.printArray(ar);
	}

}
