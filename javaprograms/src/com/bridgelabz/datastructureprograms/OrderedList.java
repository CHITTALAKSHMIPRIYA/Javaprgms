
package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class OrderedList {
    public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		int count=0;
		File f=new File("/home/bridgelabz/test3");
		FileReader fr=null;
		BufferedReader br=null;
		FileWriter fwrite=null;
		BufferedWriter bwrite=null;
		String[] str=new String[100];
		try
		{
			fr=new FileReader(f);
			br=new BufferedReader(fr);
			String word=br.readLine();
			while(word!=null)
			{
				 str=word.split(",");
				count++;
				break;
			}
				int[] intAr=new int[str.length];
				for(int i=0;i<intAr.length;i++)
				{
					intAr[i]=Integer.parseInt(str[i]);
				}
				for(int i=0;i<str.length;i++)
				{
					list.BubbleSort(intAr);
					list.add(intAr[i]);
				}
				System.out.println("sorted order is");
				list.display();
				
			}
	
catch(Exception e)
		{
	e.printStackTrace();
		}
		System.out.println("searching following data");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		int res=list.search(num);
		if(res==-1)
		{
			list.add(num);
			System.out.println("added num");
	
			list.display();
			System.out.println("num added successfully");
		}
		else
		{
			list.removeAt(res);
			System.out.println("num removed successfully");
			list.display();
		}
    }
}