/**************************************************************************************
 * 
 * purpose:Replace username with propername
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * *************************************************************************************************/
package com.bridgelabz.functionalpgms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class StringReplace {
	public String replacePattern(String str,String replace)
	{
		Pattern ptn=Pattern.compile("<<[^<<]*>>");
		Matcher mtch=ptn.matcher(str);
		return mtch.replaceAll(replace);
	}
	public static void main(String[] args)
	{
		String str="Hello <<username>>, How are you?";
		StringReplace mpr=new StringReplace();
		System.out.println(mpr.replacePattern(str,"lakshmi"));
	}
}
