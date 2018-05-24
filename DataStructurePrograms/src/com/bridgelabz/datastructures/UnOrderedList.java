package com.bridgelabz.datastructures;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class UnOrderedList {
    public static void main(String[] args) {
    	try
    	{
		Scanner sc=new Scanner(System.in);
		//create linked list
		List<String> list=new LinkedList<String>();
           
				//Utility.readDatafromFile(list);
				System.out.println("enter word to search");
				String search=sc.next();
				Utility.readDatafromFile(list);
				Utility.searchWord(list,search);
				Utility.writeDatatoFile(list);
		}
    	catch(Exception e)
    	{
    		System.out.println("exception occured");
    	}
    }
}
