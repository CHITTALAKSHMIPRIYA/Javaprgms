/*************************************************************************************************************
 * 
 * purpose: Find the number of minimum Note needed to give the change and also list of Rs Notes that would given in the Change

 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 22-05-17
 * 
 * **************************************************************************************************/
package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int notes[]= {1,2,5,10,50,100,500,1000};
		System.out.println("enter the amount");
		int change=sc.nextInt();
		int length=notes.length;
		int res=Utility.count(notes,change,length);
		System.out.println(res);
		}
	}


