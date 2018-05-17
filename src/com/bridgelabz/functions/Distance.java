/*************************************************************************************************************
 * 
 * purpose:Calculating distance
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * *************************************************************************************************/
package com.bridgelabz.functions;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of x");
		int x=sc.nextInt();
		System.out.println("enter value of y");
		int y=sc.nextInt();
		double dist1=Math.pow(x, 2);
		double dist2=Math.pow(y, 2);
		double dist=Math.sqrt(dist1+dist2);
		System.out.println("distance="+dist);
		

	}

}
