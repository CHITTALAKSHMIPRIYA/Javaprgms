/*************************************************************************************************************
 * 
 * purpose:Guess the number with n questions
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 21-05-17
 * 
 * **************************************************************************************************/

package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class FindNum {

	
		    public static void main(String[] args) 
		    {
		    Scanner s = new Scanner(System.in);
		        System.out.println("Enter the value of N");
		    	int n = s.nextInt();
		        System.out.println("Think of an integer between "+0+" "+(n-1));
		    	try {
					Thread.sleep(3000);
				} catch (InterruptedException e) 
		    	{
					e.printStackTrace();
				}
		        Utility.search(0, n-1);
		    }
		


	}


