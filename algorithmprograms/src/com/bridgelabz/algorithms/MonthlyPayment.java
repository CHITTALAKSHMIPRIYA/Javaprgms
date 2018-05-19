/*************************************************************************************************************
 * 
 * purpose:Calculating monthly payment
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 16-05-17
 * 
 * **************************************************************************************************/
 
package com.bridgelabz.algorithms;

import java.util.Scanner;
import com.bridgelabz.util.*;
public class MonthlyPayment {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principal loan");
		double loan=sc.nextDouble();
		System.out.println("enter year");
		double year=sc.nextDouble();
		System.out.println("enter percentage");
		double per=sc.nextDouble();
		Utility.monthlyPay(loan,year,per);

	}

}
