
package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UnorderedList {
    public static void main(String[] args) {
		LinkedList list=new LinkedList();
		int count=0;
		File f=new File("/home/bridgelabz/test.txt");
		FileReader fr=null;
		BufferedReader br=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
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
System.out.println("searching all elements");
		list.display();
		System.out.println(list.size());
		System.out.println("enter word to search in list");
		Scanner sc=new Scanner(System.in);
		String word1=sc.next();
		int value=list.search(word);
		if(value==-1)
		{
			System.out.println("added word");
			list.add(word1);
			System.out.println("name added successfully");
			fw=new FileWriter("/home/bridgelabz/test.txt");
			bw=new BufferedWriter(fw);
			bw.write(word+","+word1);
			bw.flush();
			list.display();
		}
		else
		{
			list.removeAt(value);
			System.out.println("word removed successfully");
			list.display();
		}
}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		finally {
			try
			{
				fw.close();
				fr.close();
				br.close();
				bw.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			}
    }
}
    

		
