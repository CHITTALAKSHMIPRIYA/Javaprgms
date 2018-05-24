
package com.bridgelabz.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Utility {
	public static <T> void  readDatafromFile(List<T> list) throws Exception
	{
		try {
			//reading a file
			File file=new File("/home/bridgelabz/Javaprograms/text1");
			try {
				//check whether file exists or not
				if(file.exists())
				{
					//check whether it can read or not
					if(file.canRead())
					{
						Scanner sc=new Scanner(System.in);
						while(sc.hasNext())
						{
							String word=sc.next();
							System.out.println(word+"");
							list.add((T) word);
						}
					}
					else
					{
						System.out.println("can't read file");
					}
				}
					else
					{
						System.out.println("file not exists");
				    }}
				catch(Exception FileNotFoundException)
				{
					System.out.println("file not exists");
				}
		}
		catch(Exception e)
		{
			System.out.println("exception occured");
		}
}
	//search word from file
	public static <T> void searchWord(List<T> list,String search)
	{
		if(list.contains(search))
		{
			System.out.println("word found and removed from list");
			list.remove(search);
			System.out.println(list);
		}
		else
		{
			System.out.println("word found and add to list");
			list.add((T)search);
			System.out.println(list);
		}
	}
	//Writing data to file
	public static <T> void writeDatatoFile(List<T> list) throws IOException
	{
		try
		{
			File file=new File("/home/bridgelabz/Javaprograms/text1");
			if(file.exists())
			{
				if(file.canWrite())
				{
					FileWriter fw=new FileWriter(file);
					BufferedWriter bw=new BufferedWriter(fw);
					String str="";
					for(T ele:list)
					{
						str=str+ele+"";
					}
					bw.write(str);
					bw.flush();
					bw.close();
				}
				else 
				{
					System.out.println("can't edit file");
				}
			}
			else
			{
				System.out.println("file not exists");
			}
		}    
		catch(Exception e)
		{
			System.out.println("exception occured");
		}
	}
	}

