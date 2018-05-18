package com.bridgelabz.util;

import java.io.PrintWriter;
import java.util.Scanner;

public class Utility
{
<<<<<<< HEAD
/**
 * Function to check leap year or not
 *
 * 
 */
=======
	//leap year
>>>>>>> 46deab3c7bb349c3d837f86c0c6412d162af240b
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
<<<<<<< HEAD
/**
 * Function to generate random number
 *
 * @param number the number to generate random number
 */
   public static void random(int n,int ar[])
=======


//to generate random number

    public static void random(int n,int ar[])
>>>>>>> 46deab3c7bb349c3d837f86c0c6412d162af240b
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
<<<<<<< HEAD
 /**
  * Function to eliminate duplicate number and print distinct coupon number
  */
=======
    //to eliminate duplicate number and print distinct coupon number
>>>>>>> 46deab3c7bb349c3d837f86c0c6412d162af240b
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
<<<<<<< HEAD
/**
 * Function for power of 2
 *
 * @param number for power of 2
 */
=======
  //power of 2  
>>>>>>> 46deab3c7bb349c3d837f86c0c6412d162af240b
public static void pwr(int n,int pw)
{
	
int p=1;
	for(int i=0;i<pw;i++)
	{
	 p=p*n;
	
	System.out.println(p);
	}
	
}
<<<<<<< HEAD
/**
 * Function for 2D Array
 *
 * @param number for 2D Array
 */
=======
//methods for Array2D
>>>>>>> 46deab3c7bb349c3d837f86c0c6412d162af240b
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

<<<<<<< HEAD
/**
 * Function to replace String
 *
 * 
 */
=======
    //replace string
>>>>>>> 46deab3c7bb349c3d837f86c0c6412d162af240b
	public static String replace(String input)
	{
		
		String s="Hello username, How are you?";
		String str=s.replaceAll("username",input);
		return str;
	}
<<<<<<< HEAD
/**
 * Function for permutation of a String
 *
 * @param number for permutation
 */
	public static void permutation(String str,int start,int end)
	{
		if(start==end)
			System.out.println(str);
		else
		{
			for(int i=start;i<=end;i++) 
			{
				str=swap(str,start,i);
				permutation(str,start+1,end);
				str=swap(str,start,i);
			}
		}
	}
	public static String swap(String a,int i,int j)
	{
		char[] ch=a.toCharArray();
		char t=ch[i];
		ch[i]=ch[j];
		ch[j]=t;
		return String.valueOf(ch);
	}
=======
	
	
	
	
	
	
>>>>>>> 46deab3c7bb349c3d837f86c0c6412d162af240b
}

