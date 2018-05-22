/*************************************************************************************************************
 * 
 * purpose:  Convert decimal to binary by decomposing
 * @author Lakshmi Priya
 * @version 1.0
 * @since 22-05-17
 * 
 * **************************************************************************************************/
package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.util.Utility;
		public class ToBinary
		{	
			public static void main(String args[])
			{
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the number:");
				int num = scan.nextInt();
				
	String res=	Utility.convertBinary(num);
			System.out.println(res);
				scan.close();
			}
	}


