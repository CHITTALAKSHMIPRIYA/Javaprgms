package com.bridgelabz.util;
public class LeapYear
{
public static void main(int year)
{
if(year%400==0)
System.out.println("it is a leap year");
else if(year%100==0) 
System.out.println("it is not leap year");
else if(year%4==0) 
System.out.println("it is a leap year");
else
System.out.println("it is not leap year");
}
}

