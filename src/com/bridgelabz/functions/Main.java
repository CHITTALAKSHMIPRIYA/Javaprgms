/*************************************************************************************************************
 * 
 * purpose:LeapYear
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 16-05-17
 * 
 * **************************************************************************************************/
package com.bridgelabz.functions;
import com.bridgelabz.util.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter num");
		int num=sc.nextInt();
		Utility.leap(num);
    }
    }
