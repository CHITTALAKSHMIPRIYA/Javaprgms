/*************************************************************************************************************
 * 
 * purpose:To calculate temperature in celsius and farhenheit
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 22-05-17
 * 
 * **************************************************************************************************/
 package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class Swapnibbles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		Utility.convertBinarySwap(number);
		}
	}
