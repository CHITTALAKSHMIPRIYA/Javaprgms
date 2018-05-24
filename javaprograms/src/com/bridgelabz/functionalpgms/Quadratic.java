/*************************************************************************************************************
 * 
 * purpose:Quadratic Equation
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * *************************************************************************************************/
package com.bridgelabz.functionalpgms;

import java.util.Scanner;

public class Quadratic {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values of a,b,c");
		double a=sc.nextInt();
		double b=sc.nextInt();
	    double c=sc.nextInt();
		double delta = b*b - 4*a*c;
				double Root1= (-b + sqrt(delta))/(2*a);
				 double Root2 = (-b - sqrt(delta))/(2*a);
				 System.out.println("delta="+delta);
				 System.out.println("root1="+Root1);
				 System.out.println("root2="+Root2);
				 }
	public static double sqrt(double x) {
		double i=1;
		double res=1;
		while(res<=x)
		{
			i++;
			res=i*i;
		}
		return i-1;
	}

}