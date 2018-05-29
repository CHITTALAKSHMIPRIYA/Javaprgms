
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.Utility;
/*************************************************************************************************************
 * 
 * purpose:Storing only the prime numbers that are anagrams using 2D array
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 29-05-18
 * 
 * **************************************************************************************************/


public class PrimeAnagram {
	@SuppressWarnings({ "rawtypes", "static-access" })
	public static  void main(String[] args) {
		LinkedList[][] array=new LinkedList[10][];
		for(int i=0;i<10;i++)
		{
			array[i]=new LinkedList[100];
			for(int j=0;j<100;j++)
			{
				array[i][j]=new LinkedList();
			}
		}
		for(int i=0;i<10;i++)
		{
			int k=0;
			for(int j=100*i;j<100*(i+1);j++)
			{
				if(Utility.primePalAgm(j))
				{
					for(int m=j+1;m<100*(i+1);m++)
					{
						if(Utility.isAnagram((""+j),(""+m))==true)
						{
							array[i][k++].add(j);
							System.out.println("["+j+","+m+"]");
							
						}
					}
				}
			}
		
		    System.out.println();
		}
}
}