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
import com.bridgelabz.util.Utility;

public class FindNum {
	public static void main(String[] args)
	{
		System.out.println("Enter the value of amount");
		int num = Utility.Int();
		System.out.println("Think of an integer between "+0+" "+(num-1));
		try {
			Thread.sleep(3000);
			}
		catch (InterruptedException e) 
		    {
			e.printStackTrace();
			}
		    Utility.search(0, num-1);
		    }
}
		


	


