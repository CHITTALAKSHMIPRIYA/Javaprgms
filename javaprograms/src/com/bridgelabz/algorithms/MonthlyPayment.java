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
import com.bridgelabz.util.*;

public class MonthlyPayment {
    public static void main(String[] args) {
		System.out.println("enter principal loan");
		double loan=Utility.Double();
		System.out.println("enter year");
		double year=Utility.Double();
		System.out.println("enter percentage");
		double per=Utility.Double();
		Utility.monthlyPay(loan,year,per);
		}
    }
