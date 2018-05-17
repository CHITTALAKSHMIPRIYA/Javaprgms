
/*************************************************************************************************************
 * 
 * purpose:Replace username with propername
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * *************************************************************************************************/
package com.bridgelabz.functions;
import com.bridgelabz.util.*;

import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");;
		String username=sc.nextLine();
		String output=Utility.replace(username);
		System.out.println(output);

	}

}
