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

public class LeapYear {
	public static void main(String[] args) {
	    System.out.println("enter num");
	int num =0;
	Utility.scanner(num);
	boolean res=Utility.leap(num);
		System.out.println(res?"leap year":"not leap year");
    }
    }
