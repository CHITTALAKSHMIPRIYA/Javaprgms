/*************************************************************************************************************
 * 
 * purpose:To generate random number and to process distinct coupon numbers
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * *************************************************************************************************/
package com.bridgelabz.functionalpgms;
import com.bridgelabz.util.Utility;

public class CouponNo {
	public static void main(String[] args) {
		System.out.println("enter numbers");
		int num=Utility.Int();
		int ar[]= new int[num];
		Utility.random(num,ar);
		Utility.distinct(ar);
		}
}