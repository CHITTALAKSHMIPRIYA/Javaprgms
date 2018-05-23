/*************************************************************************************************************
 * 
 * purpose:To calculate temperature in celsius and farhenheit
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 19-05-17
 * 
 * **************************************************************************************************/
 
package com.bridgelabz.algorithms;

import java.util.Scanner;
import com.bridgelabz.util.*;
public class TemperatureConversion {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter celsius");
		double celsius=sc.nextDouble();
		System.out.println("enter farenheit");
		double farhenheit=sc.nextDouble();
          Utility.celTofar(celsius);
          Utility.farhTocel(farhenheit);
          sc.close();
	}

}
