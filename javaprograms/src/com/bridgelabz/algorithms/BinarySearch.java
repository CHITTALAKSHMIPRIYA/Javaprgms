/*************************************************************************************************************
 * 
 * purpose:Read in a list of words from File using binary search
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 19-05-17
 * 
 * **************************************************************************************************/
 
package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class BinarySearch {
   public static void main(String[] args) {
		try {
			Utility u=new Utility();
		u.readFile();

		}
		catch(Exception e)
		{
			System.out.println("exception occured");
		}

	}

}
