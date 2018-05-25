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
import com.bridgelabz.util.*;
public class TemperatureConversion {
     public static void main(String[] args) {
		System.out.println("enter celsius");
		double celsius=Utility.Double();
		System.out.println("enter farenheit");
		double farhenheit=Utility.Double();
          Utility.celTofar(celsius);
          Utility.farhTocel(farhenheit);
	}
}
