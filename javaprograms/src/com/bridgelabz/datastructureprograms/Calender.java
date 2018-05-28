
package com.bridgelabz.datastructureprograms;
import com.bridgelabz.util.Utility;
public class Calender
{
	    public static void main(String[] args) 
	    {	System.out.println("enter month");
	        System.out.println("enter year");
	        int month = Utility.Int();
	        int year = Utility.Int();
	        String[] months = {"","January", "February", "March","April", "May", "June",
	            "July", "August", "September","October", "November", "December"};

	        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	        if (month == 2 && Utility.leap(year)) 
	        {
	        	days[month] = 29;
	        }
	   System.out.println("  " + months[month] + " " + year);
	        System.out.println(" S  M Tu  W Th  F  S");
	        int d = Utility.dayOfWeek1(month,1,year);
	       for(int i = 0; i < d; i++)
	        {
	            System.out.print("   ");
	        }
	        for (int i = 1; i <= days[month]; i++)
	        {
	            System.out.printf("%2d ",i);
	            if (((i + d) % 7 == 0) || (i == days[month])) 
	            	System.out.println();
	        } }
}
