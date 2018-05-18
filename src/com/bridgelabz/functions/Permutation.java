/*************************************************************************************************************
 * 
 * purpose:Permutation of a string
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * *************************************************************************************************/


package com.bridgelabz.functions;

import com.bridgelabz.util.Utility;

public class Permutation {

	
	public static void main(String[] args) {
	   String str="lakshmi";
	   int a=str.length();
	   Utility.permutation(str, 0, a-1);

	}

}
