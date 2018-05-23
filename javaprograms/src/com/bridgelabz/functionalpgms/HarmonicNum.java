/*************************************************************************************************************
 * 
 * purpose:Print Nth Harmonic Number
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * **************************************************************************************************/
package com.bridgelabz.functionalpgms;

import java.util.Scanner;

public class HarmonicNum {
	public static void main(String[] args) {
		//initialization
		double num=0;
	
		Scanner sc=new Scanner(System.in);
		//Input data
		System.out.println("enter harmonic");
		int value=sc.nextInt();
		for(double i=1;i<=value;i++)
		{
			num=num+(1/i);
		}
		System.out.println("harmonic value of"+value+ "is"+num);
		}
	}