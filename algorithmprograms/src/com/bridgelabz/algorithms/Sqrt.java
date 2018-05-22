/*************************************************************************************************************
 * 
 * purpose:To compute the square root of a non negative number c
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 22-05-17
 * 
 * **************************************************************************************************/
package com.bridgelabz.algorithms;

import com.bridgelabz.util.Utility;

public class Sqrt {
   public static void main(String[] args) {
	 double c=Double.parseDouble(args[0]);
	 double t=c;
	 double epsilon=1e-15;
double res=Utility.squareRoot(c,t,epsilon);
System.out.println(res);
	}

}
