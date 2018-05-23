/*************************************************************************************************************
 * 
 * purpose:Read in strings and print them using Insertion SORT
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 21-05-17
 * 
 * **************************************************************************************************/




package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		String strAr[]=new String[size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the value at "+i+"value");
			strAr[i]=sc.next();
		}
		
		for(int i=0;i<size;i++)
		{
			Utility.insertionSort(strAr);
			System.out.println(strAr[i]);
		}
		sc.close();
		}}
