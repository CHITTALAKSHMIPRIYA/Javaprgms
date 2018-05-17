/*************************************************************************************************************
 * 
 * purpose:To find prime factors of a number
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * **************************************************************************************************/
package com.bridgelabz.functions;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		
	//command line argument
      Scanner sc=new Scanner(System.in); 
    //initialization
      System.out.print("enter number");
      int num=sc.nextInt();
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

