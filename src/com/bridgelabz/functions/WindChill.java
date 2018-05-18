/*************************************************************************************************************
 * 
 * purpose:WindChill
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * *************************************************************************************************/
package com.bridgelabz.functions;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double t=sc.nextDouble();
		double v=sc.nextDouble();
		if(t<50 && (v>3 && v<120))
		{
			double q=Math.pow(v,0.16);
			double w=35.74+(0.6215*t)+(((0.4275*t)-35.75))*q;
			System.out.println("Temp="+t);
			System.out.println("Speed="+v);
			System.out.println("windchill="+w);
		}}
			}