/*************************************************************************************************************
 * 
 * purpose:Array 2D
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * *************************************************************************************************/
package com.bridgelabz.functionalpgms;
import com.bridgelabz.util.*;
public class Array2D {
   public static void main(String[] args) {
		System.out.println("enter row size");
		int row=Utility.Int();
		System.out.println("enter col size");
		int col=Utility.Int();
		System.out.println("enter user choice");
		System.out.println("1.int");
		System.out.println("2.String");
	    System.out.println("3.double");
	    int choice=Utility.Int();
        Utility.input(row,col,choice);
	}
   }