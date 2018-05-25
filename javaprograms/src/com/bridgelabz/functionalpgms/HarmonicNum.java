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
import com.bridgelabz.util.Utility;

public class HarmonicNum {
	static double NUM= 0;
public static void main(String[] args) {
		// Input data
		System.out.println("enter harmonic");
		int value = Utility.Int();
		for (double i = 1; i <= value; i++) {
			NUM=NUM+ (1 / i);
		}
		System.out.println("harmonic value of" + value + "is" +NUM);
	}
}