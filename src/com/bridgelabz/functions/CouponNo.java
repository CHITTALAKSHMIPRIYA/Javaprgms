/*************************************************************************************************************
 * 
 * purpose:To generate random number and to process distinct coupon numbers
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * *************************************************************************************************/
package com.bridgelabz.functions;

import java.util.Scanner;
import com.bridgelabz.util.Utility;

public class CouponNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int num=sc.nextInt();
		int ar[]= new int[num];
		Utility.random(num,ar);
		Utility.distinct(ar);
		sc.close();

	}
}