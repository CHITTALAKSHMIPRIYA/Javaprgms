
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.Utility;
/*************************************************************************************************************
 * 
 * purpose:Store the Calender in 2D array using stack
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 29-05-18
 * 
 * **************************************************************************************************/
public class CalenderStack {
  public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		StackList first[][] = new StackList[6][];
		for (int i = 0; i < 6; i++) {
			first[i] = new StackList[7];
			for (int j = 0; j < 7; j++) {
				first[i][j] = new StackList();
			}
		}
        StackList a[][] = new StackList[6][];
		for (int i = 0; i < 6; i++) {
			a[i] = new StackList[7];
			for (int j = 0; j < 7; j++) {
				a[i][j] = new StackList();
			}
		}
		int day = 1;
		String[] months = { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		String[] days = { " S", " M", " T", " W", "Th", " F", " S" };
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				first[i][j].push("  ");
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (Utility.dateValidator(day, month, year)) {
					j = Utility.dayStart(day, month, year);
					if (day < 10) {
						first[i][j].push(" " + day);
						day++;
					} else {
						first[i][j].push("" + day);
						day++;
					}
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				a[i][j].push(first[i][j].pop());
			}
		}
		System.out.println(months[month] + " " + year);
		System.out.println();
		for (int i = 0; i < 7; i++) {
			System.out.print(days[i] + "  ");
		}
		System.out.println();
		for (int x1 = 0; x1 < 6; x1++) {
			for (int y1 = 0; y1 < 7; y1++) {
				System.out.print(a[x1][y1].pop() + "  ");
			}
			System.out.println();
		}

	}

}
