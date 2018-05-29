
package com.bridgelabz.datastructureprograms;
import com.bridgelabz.util.Utility;
/*************************************************************************************************************
 * 
 * purpose:Use deque and find whether given string is palindrome or not
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 27-05-18
 * 
 * **************************************************************************************************/

public class PalindromeCheck {@SuppressWarnings({ "unchecked", "static-access" })
public static void main(String[] args) {
		Deque deque=new Deque();
		System.out.println("enter string to check its palindrome or not");
		String str=Utility.String();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			deque.addRear(ch[i]);
		}
		int count=0;
		if(str.length()%2==0)
		{
			while(deque.size()>2)
			{
				if(deque.removeFront().compareTo(deque.removeRear())!=0)
				{
					 count=1;
					break;
				}
			}
		}
	
		if(count==0)
		{
			System.out.println("string is palindrome");
		}
		if(count==1)
		{
			System.out.println("string is not palindrome");
		}
	}

}
