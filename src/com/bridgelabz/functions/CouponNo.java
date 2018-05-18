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
<<<<<<< HEAD
import com.bridgelabz.util.Utility;

public class CouponNo {
=======

import com.bridgelabz.util.Utility;
//import com.bridgelabz.util.Utility.*;

public class CouponNo {

>>>>>>> 46deab3c7bb349c3d837f86c0c6412d162af240b
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int num=sc.nextInt();
		int ar[]= new int[num];
		Utility.random(num,ar);
		Utility.distinct(ar);
		

	}
<<<<<<< HEAD
}
=======

}
>>>>>>> 46deab3c7bb349c3d837f86c0c6412d162af240b
