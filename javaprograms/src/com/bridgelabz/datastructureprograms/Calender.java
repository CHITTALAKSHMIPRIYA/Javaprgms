
package com.bridgelabz.datastructureprograms;
import com.bridgelabz.util.Utility;
/*************************************************************************************************************
 * 
 * purpose:Store the Calender using 2D array
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 29-05-18
 * 
 * **************************************************************************************************/
public class Calender
{
	    public static void main(String[] args) 
	    {
	    	int month=Integer.parseInt(args[0]);
	    	int year=Integer.parseInt(args[1]);
	    	String[][] a=new String[6][7];
	    	int day=1;
	        String[] months = {"","January", "February", "March","April", "May", "June",
	            "July", "August", "September","October", "November", "December"};

	        String[] days = {" S"," M"," T"," W","Th"," F"," Sa"};
	        for(int i=0;i<6;i++) {
	        	for(int j=0;j<7;j++)
	        	{
	        		a[i][j]="  ";
	        	}
	        }
	        for(int i=0;i<6;i++) {
	        	for(int j=0;j<7;j++)
	        	{
	        		if(Utility.dateValidator(day,month,year))
	        		{
	        			j=Utility.dayStart(day,month,year);
	        			if(day<10)
	        			{
	        				a[i][j]=" "+day++;
	        			}
	        			else
	        			{
	        				a[i][j]=""+day++;
	        			}
	        		}
	        	}
	        }
	        System.out.println(months[month]+" "+year);
	        System.out.println("");
	        for(int i=0;i<7;i++)
	        {
	        	System.out.print(days[i]+" ");
	        }
	        System.out.println();
	        for(int i=0;i<6;i++)
	        {
	        	for(int j=0;j<7;j++)
	        	{
	        		System.out.print(a[i][j]+" ");
	        	}
	        	System.out.println();
	        }
	    }
}
	        
