package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.Utility;
/*************************************************************************************************************
 * 
 * purpose:Store the Calender in 2D array using Queue
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 29-05-18
 * 
 * **************************************************************************************************/
public class CalenderQueue {
@SuppressWarnings("static-access")
public static void main(String[] args) {
	int month=Integer.parseInt(args[0]);
	int year=Integer.parseInt(args[1]);
  Queue[][] a=new Queue[6][];
	for(int i=0;i<6;i++)
	{
		a[i]=new Queue[7];
		for(int j=0;j<7;j++)
		{
			a[i][j]=new Queue();
		}
	}
	int day=1;
    String[] months = {"","January", "February", "March","April", "May", "June",
        "July", "August", "September","October", "November", "December"};

    String[] days = {" S"," M"," T"," W","Th"," F"," Sa"};
    for(int i=0;i<6;i++) {
    	for(int j=0;j<7;j++)
    	{
    		a[i][j].enqueue("  ");
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
    				a[i][j].dequeue();
    				a[i][j].enqueue(" "+day);
    				day++;
    			}
    			else
    			{
    				a[i][j].dequeue();
    				a[i][j].enqueue(""+day);
    				day++;
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
    		System.out.print(a[i][j].dequeue()+" ");
    	}
    	System.out.println();
    }
}
}
    

	


