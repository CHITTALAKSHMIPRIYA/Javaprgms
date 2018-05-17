package com.bridgelabz.util;

import java.io.PrintWriter;
import java.util.Scanner;

public class Utility
{
	//leap year
public  static void leap(int year)
{
if(year%400==0)
System.out.println("it is a leap year");
else if(year%100==0) 
System.out.println("it is not leap year");
else if(year%4==0) 
System.out.println("it is a leap year");
else
System.out.println("it is not leap year");
}


//to generate random number

    public static void random(int n,int ar[])
    {
    	for(int i=0;i<n;i++)
    	{
    		ar[i]=(int)(Math.random()*9999);
    		for(int j=0;j<i;j++)
    		{
    			if(ar[i]==ar[j])
    			{
    				i--;
    				break;
    			}
    		}
    	}
    }
    //to eliminate duplicate number and print distinct coupon number
    public static void distinct(int arr[])
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		boolean found=false;
    		for(int j=0;j<i;j++)
    		
    		if(arr[i]==arr[j])
    		{
    			found=true;
    			break;
    		}
    		if(!found)
    			System.out.print(arr[i]+" ");
    	}
    		System.out.println();;
    }
  //power of 2  
public static void pwr(int n,int pw)
{
	
int p=1;
	for(int i=0;i<pw;i++)
	{
	 p=p*n;
	
	System.out.println(p);
	}
	
}
//methods for Array2D
public static int[][] arInt(int m,int n)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the elements of array");
	int[][] a=new int[m][n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	return a;
}
public static double[][] arDouble(int m,int n)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the elements of array");
	double[][] b=new double[m][n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			b[i][j]=sc.nextInt();
		}
	}
	return b;
}
public static String[][] arStr(int m,int n)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the elements of array");
	String[][] c=new String[m][n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			c[i][j]=sc.next();
		}
	}
	return c;
}
public static void print(int[][] a,double[][] b,String[][] c,int m,int n)
{
PrintWriter pw=new PrintWriter(System.out,true);
//print integers
pw.println("2D array int");
for(int i=0;i<m;i++)
{
	for(int j=0;j<n;j++)
	{
		pw.print(a[i][j]+" ");
	}
}
pw.println();
System.out.println();
//print double
pw.println("2D array double");
for(int i=0;i<m;i++)
{
	for(int j=0;j<n;j++)
	{
		pw.print(b[i][j]+" ");
	}
}
System.out.println();
//print boolean
pw.println("2D array boolean");
for(int i=0;i<m;i++)
{
	for(int j=0;j<n;j++)
	{
		pw.print(c[i][j]+" ");
	}
}

}
//Sum of three integers is 0
public static void sum(int n,int b[])
{
	int count=0;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(b[i]+b[j]+b[k]==0)
					count++;
				int sum=b[i]+b[j]+b[k];
					System.out.println(sum);
					
				}
			}
		}
	System.out.println("sum of integers is 0");
			System.out.println("count="+count);
	}

    //replace string
	public static String replace(String input)
	{
		
		String s="Hello username, How are you?";
		String str=s.replaceAll("username",input);
		return str;
	}
	
	
	
	
	
	
}

