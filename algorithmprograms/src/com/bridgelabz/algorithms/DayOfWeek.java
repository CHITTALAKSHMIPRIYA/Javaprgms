/*************************************************************************************************************
 * 
 * purpose:Print the day of week that day falls on
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 16-05-17
 * 
 * **************************************************************************************************/
 
package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class DayOfWeek {

	
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	String ar[]= {"sun","mon","tues","wed","thur","fri","sat"};
	System.out.println("enter month");
	int month=sc.nextInt();
	System.out.println("enter day");
	int day=sc.nextInt();
	System.out.println("enter year");
	int year=sc.nextInt();
    int res=Utility.dayOfWeek(month, day, year);
    System.out.println(ar[res]);
	}

}
