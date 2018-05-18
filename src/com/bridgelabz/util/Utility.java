package com.bridgelabz.util;

import java.io.PrintWriter;
import java.util.Scanner;

public class Utility
{
public static void scanner(int num)
{
	Scanner sc=new Scanner(System.in);
	num =sc.nextInt();
}
public static void scanner(String string)
{
	Scanner sc=new Scanner(System.in);
	string =sc.nextLine();
}
public static void scanner(double num)
{
	Scanner sc=new Scanner(System.in);
	num =sc.nextDouble();
}
public static boolean scanner(boolean num)
{
	Scanner sc=new Scanner(System.in);
	num =sc.nextBoolean();
	return num;
}
/**
 * Function to check leap year or not
 *@param year
 * 
 */

public  static boolean leap(int year)
{
if(year>1000)
{
	if((year%400==0)||(year%4==0&&year%100!=0))
	{
		return true;
	}
}
return false;
}

/**
 * Function to generate random number
 *
 * @param number the number to generate random number
 */

    public static void random(int n,int ar[])

    {
    	for(int i=0;i<n;i++)
    	{
    		ar[i]=(int)(Math.random()*100);
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

 /**
  * Function to eliminate duplicate number and print distinct coupon number
  */

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
/**
 * Function for power of 2
 *
 * @param number for power of 2
 */

public static void pwr(int num)
{
	for(int i=0;i<num;i++)
	{
	System.out.println("power of 2^ "+i+" is "+Math.pow(2,i));
	}
}

/**
 * Function for 2D Array
 *
 * @param number for 2D Array
 */

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

/**
 * Function to replace String
 *
 * 
 */
    

	public static String replace(String input)
	{
		
		String s="Hello <<username>>, How are you?";
		String str=s.replaceAll("<<username>>",input);
		return str;
	}

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
}

