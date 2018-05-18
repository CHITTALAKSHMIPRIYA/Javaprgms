/*************************************************************************************************************
 * 
 * purpose:Power of 2
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * *************************************************************************************************/
package com.bridgelabz.functions;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class Power {
	public static void main(String[] args)
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter num");
int num=sc.nextInt();

Utility.pwr(num);
}
}