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
<<<<<<< HEAD
   public static void main(String[] args) {
		//command line argument
=======

	public static void main(String[] args) {
		
	//command line argument
>>>>>>> 46deab3c7bb349c3d837f86c0c6412d162af240b
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
<<<<<<< HEAD
    	    System.out.print(i+" ");
=======
    		  System.out.print(i+" ");
    		  
>>>>>>> 46deab3c7bb349c3d837f86c0c6412d162af240b
    		  num=num/i;
    	   }
    	  else
    		  i++;
      }
      System.out.println(" ");
	}
	}

