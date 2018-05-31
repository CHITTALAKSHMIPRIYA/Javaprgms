package com.bridgelabz.ObjectOrientedPrograms;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.util.Utility;

public class RegularExpression {
   static String template="Hello <<name>>, We have your full \n"
		   +"name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.\n"
		   +"Please,let us know in case of any clarification \n Thank you BridgeLabz 01/01/2016.";
  public static String replace(String template,String regex,String replacewith)
  {
	  Pattern pattern=Pattern.compile(regex);
	  Matcher matcher=pattern.matcher(template);
	  return template=matcher.replaceAll(replacewith);
  }
	
	public static void main(String[] args) {
	 System.out.println("enter name");
	 String name=Utility.String();
	 System.out.println("enter full name");
	 String fullname=Utility.String();
	 SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
	 String date=dateFormat.format(new Date());
	 System.out.println("enter your phone number");
	 String phnno=Utility.String();
	 String regex1="<<name>>";
	 String regex2="<<full name>>";
	 String regex3="(01/01/2016)";
	 String regex4="xxxxxxxxxx";
	 template=RegularExpression.replace(template,regex1,name);
	 template=RegularExpression.replace(template,regex2,fullname);
	 template=RegularExpression.replace(template,regex3,date);
	 template=RegularExpression.replace(template,regex4,phnno);
	 System.out.println(template);
			 

	}

}
