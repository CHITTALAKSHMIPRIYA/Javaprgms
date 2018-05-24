
package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class BalencedParenthesis {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean res=false;
System.out.println("enter expression");
String str=sc.nextLine();
if(str.length()==0)
{
	System.out.println("enter a valid expression");
}
else
{
	res=Utility.expression(str);
	if(res==true) {
		System.out.println("true It's a valid expression");
	}
	else
	{
		System.out.println("false It's not a valid expression");
	}
}
	}

}
