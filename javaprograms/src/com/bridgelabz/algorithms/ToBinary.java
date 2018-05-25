/*************************************************************************************************************
 * 
 * purpose:  Convert decimal to binary by decomposing
 * @author Lakshmi Priya
 * @version 1.0
 * @since 22-05-17
 * 
 * **************************************************************************************************/
package com.bridgelabz.algorithms;
import com.bridgelabz.util.Utility;
public class ToBinary
{
	public static void main(String args[])
	{
		System.out.println("Enter the number:");
	    int num = Utility.Int();
	    String res=Utility.convertBinary(num);
		System.out.println(res);
		}
	}


