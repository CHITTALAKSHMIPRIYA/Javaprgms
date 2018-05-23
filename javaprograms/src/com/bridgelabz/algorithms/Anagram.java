/*************************************************************************************************************
 * 
 * purpose:To find whether given string is anagram or not
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * **************************************************************************************************/

package com.bridgelabz.algorithms;
import com.bridgelabz.util.*;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String a=sc.nextLine();
		System.out.println("enter second string");
		String b=sc.nextLine();
	boolean res=	Utility.isAnagram(a,b);
	System.out.println(res?"anagram":"not anagram");
sc.close();
	}

}
