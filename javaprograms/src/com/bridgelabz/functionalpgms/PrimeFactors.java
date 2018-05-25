/*************************************************************************************************************
 * 
 * purpose:To find prime factors of a number
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * **************************************************************************************************/
package com.bridgelabz.functionalpgms;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class PrimeFactors {
   public static void main(String[] args) {
    //initialization
      System.out.print("enter number");
      int num=Utility.Int();
    //input data
      System.out.print("The prime factors of " + num +" are ");
      int i=2;
      while(num>1)
      {
    	  if(num%i==0)
    	  {
    	    System.out.print(i+" ");
    		  num=num/i;
    	   }
    	  else
    		  i++;
      }
      System.out.println(" ");
	}
	}

