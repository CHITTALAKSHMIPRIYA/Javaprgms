
package com.bridgelabz.datastructureprograms;
import com.bridgelabz.util.Utility;

public class BalencedParenthesis {
	public static void main(String[] args) {
	boolean res=false;
	System.out.println("enter expression");
    String str=Utility.String();
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
