/*************************************************************************************************************
 * 
 * purpose:Find a prime number anagram or palindrome
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 21-05-17
 * 
 * **************************************************************************************************/

package com.bridgelabz.algorithms;
import com.bridgelabz.util.Utility;

public class findPrimepal {
	public static void main(String[] args) {
	    System.out.println("enter number");
		int num=Utility.Int();
		Utility.primePalAgm(num);
		boolean res=Utility.pal(num);
		System.out.println(res?"palindrome":"not palindrome");
	}
}
