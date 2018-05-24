
package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class UnorderedList {
    public static void main(String[] args) {
		LinkedList list=new LinkedList();
		int count=0;
		File f=new File("/home/bridgelabz/test1.txt");
		FileReader fr=null;
		BufferedReader br=null;
		try
		{
			fr=new FileReader(f);
			br=new BufferedReader(fr);
			String word=br.readLine();
			while(word!=null)
			{
				String [] str=word.split(",");
				count++;
				for(int i=0;i<str.length;i++)
				{
					list.add(str[i]);
				}
				break;
			}
	}
catch(Exception e)
		{
	e.printStackTrace();
		}
		list.display();
		System.out.println(list.size());
		System.out.println("enter word to search in list");
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
		int value=list.search(word);
		if(value==-1)
		{
			list.add(word);
			System.out.println("added word");
	//list.add(word);
			System.out.println("name added successfully");
		}
		else
		{
			list.removeAt(value);
			System.out.println("word removed successfully");
			list.display();
		}
}
}