
package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class OrderedList {
    public static void main(String[] args) {
    	File f=new File("/home/bridgelabz/Downloads/sts-bundle/sts-3.9.2.RELEASE/text2");
		System.out.println("enter the num you want to search");
		String searchItem=Utility.String();
		//OrderedList o1=OrderedList.orderedlist();
		BufferedReader br=null;
		try
		{
			br=new BufferedReader(new FileReader(f));
			String word=br.readLine();
			while(word!=null)
			{
				String [] str=word.split(",");
	
				for(int i=0;i<str.length;i++)
				{
					LinkedList.add(str[i]);
				}
				break;
			}
		}
			catch(Exception e)
			{
			e.printStackTrace();
			}
			if(LinkedList.search(searchItem))
			{
				LinkedList.remove(searchItem);
			}else
			{
				LinkedList.add(searchItem);
			}
			String out="";
			while(LinkedList.size()>0)
			{
				out=LinkedList.pop()+""+out;
			}
			try
			{
				BufferedWriter writer =new BufferedWriter(new FileWriter(f));
				writer.write(out);
				System.out.println("file written successfully");
				writer.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
		}
}

	
	
