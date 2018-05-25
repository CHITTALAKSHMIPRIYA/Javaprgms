/*************************************************************************************************************
 * 
 * purpose:Print the day of week that day falls on
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 19-05-17
 * 
 * **************************************************************************************************/
 
package com.bridgelabz.algorithms;
import com.bridgelabz.util.Utility;

public class DayOfWeek {
	public static void main(String[] args) {
	String ar[]= {"sun","mon","tues","wed","thur","fri","sat"};
	System.out.println("enter month");
	int month=Utility.Int();
	System.out.println("enter day");
	int day=Utility.Int();
	System.out.println("enter year");
	int year=Utility.Int();
    int res=Utility.dayOfWeek(month, day, year);
    System.out.println(ar[res]);
	}

}
