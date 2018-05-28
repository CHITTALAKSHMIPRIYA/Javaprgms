package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.Utility;

public class CalenderQueue {
public static void main(String[] args) {
		LinkedQueue month=new LinkedQueue();
		LinkedQueue day=new LinkedQueue();
		String[] months = {"","January", "February", "March","April", "May", "June",
	            "July", "August", "September","October", "November", "December"};
		for(int i=0;i<months.length;i++)
		{
			month.insert(months[i]);
		}
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i=0;i<days.length;i++)
		{
			day.insert(days[i]);
		}
		month.display();
		int month1 = Utility.Int();
        int year = Utility.Int();
        if (month1 == 2 && Utility.leap(year)) 
        {
        	days[month1] = 29;
        }
   System.out.println("  " + months[month1] + " " + year);
        System.out.println(" S  M Tu  W Th  F  S");
        int d = Utility.dayOfWeek1(month1,1,year);
       for(int i = 0; i < d; i++)
        {
            System.out.print("   ");
        }
        for (int i = 1; i <= days[month1]; i++)
        {
            System.out.printf("%2d ",i);
            if (((i + d) % 7 == 0) || (i == days[month1])) 
            	System.out.println();
        } }

	}


