/*************************************************************************************************************
 * 
 * purpose:Read in integers and print them using BUBBLE SORT
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 21-05-17
 * 
 * **************************************************************************************************/

package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class Bubblesort {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		Integer[] ar=new Integer[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the value at "+i+"value");
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			Utility.bubbleSort(ar);
			System.out.println(ar[i]);
		}
sc.close();
	}

}
