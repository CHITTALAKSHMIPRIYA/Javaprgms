
package com.bridgelabz.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Utility {
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean isAnagram(String a,String b)
	{
		a=a.replaceAll("\\s","").toLowerCase();
		b=b.replaceAll("\\s","").toLowerCase();
		boolean f=false;
		char[] c=a.toCharArray();
		Arrays.sort(c);
		char[] d=b.toCharArray();
		Arrays.sort(d);
		String A=new String(c);
		String B=new String(d);
		if(A.equals(B))
		{
			f=true;
		}
		return f;
		}
	
	/**
	 * function to find prime numbers from 0 to 10000 
	 * @param start
	 * @param end
	 * @param count
	 */
	public static void prime(int start,int end, int count)
	{
	for(int i=start;i<end;i++)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				count=0;
				break;
			}
			else 
			  count=1;
		}
		if(count==1)
			System.out.println(i);
		}
	}

//
	public static void primePalAgm(int num)
	{
		int count=0;
		for(int i=0;i<num;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count=0;
					break;
				}
				else
					count=1;
			}
		}
		if(count==1)
			System.out.println("given num is prime"+" "+num);
	}
	public static boolean pal(int num)
	{
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
			return (sum==temp);
					
	
	}
	
	/**
	 * function for bubble sort
	 * @param ar
	 * @return
	 */
	public static int[] bubbleSort(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		return ar;
	}
	
	/**
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 */
	public static int dayOfWeek(int month,int day,int year)
	{
		System.out.println("entered date is"+month+"/"+day+"/"+year);
	int	y0 = year - (14 - month) / 12;
	System.out.println(y0);
	int x = y0 + y0/4 - y0/100 + y0/400;
	System.out.println(x);
int	m0 = month + 12 * ((14 -month) / 12) -2;
System.out.println(m0);
int d0 = (day + x + 31*m0/ 12) % 7;
System.out.println(d0);
return d0;
}
	
	/**
	 * function to calculate fahrenheit
	 * @param cel
	 */
	public static void celTofar(double cel)
	{
		double farh=cel*((double)(9/5))+32;
		System.out.println("Fahrenheit="+farh);
	}
	/**
	 * function to calculate celsius
	 * @param farh
	 */
	public static void farhTocel(double farh)
	{
		double cel=(farh-32)*5/9;
		System.out.println("celsius="+cel);
	}
	
	/**
	 * function to calculate payment
	 * @param p
	 * @param y
	 * @param r
	 */
	public static void monthlyPay(double p,double y, double r)
	{
	  double n=12*y;
	  double rate=r/(12*100);
	  double payment=(p*rate)/(1-Math.pow(1+rate,-n));
	  System.out.println("payment="+payment);
	}

//Binary Search
public void readFile() throws FileNotFoundException 
{
	File file=new File("/home/bridgelabz/Javaprograms/algorithmprograms/src");
	if(file.exists())
	{
		if(file.canRead())
		{
			Scanner sc=new Scanner(file);
			//to read content of file
			String content=sc.useDelimiter(" ").next();	
			//to create array of string to store each word
			String[] ar=content.split(",");
			//to sort the array based on alphabetical order
			for(int i=0;i<ar.length;i++)
			{
				for(int j=i+1;j<ar.length-1;j++)
				{
					if(ar[i].compareTo(ar[j])<0)
					 {
						String temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
						}
				}
			}
			//to print content of array
			for(int i=0;i<ar.length;i++)
			{
				System.out.println(ar[i]+" ");
			}
			//find word in list
			findWord(ar);
		}
		else
			System.out.println("can't read file");
			}else
				System.out.println("file not found");
	}
public static void findWord(String[] ar) {
	System.out.println();
	//search particular word in an array
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string to be search");
	String find=sc.nextLine();
	boolean found=false;
	for(int i=0;i<ar.length;i++)
	{
		if(find.equalsIgnoreCase(ar[i]))
		{
			found=true;
			break;
		}
	}
	if(found==true)
	   System.out.println("word found");
	else
	   System.out.println("word not found");
}


/**
 * function to sort the words in integer array using insertion sort
 * @param intAr
 * @return
 */
public static int[] insertionSort1(int[] intAr)
{
	for(int i=1;i<intAr.length;i++)
	{
		int index=intAr[i];
		int j=i-1;
		while(j>0&&intAr[j]>(index))
		{
			intAr[j+1]=intAr[j];
			j=j-1;
		}
		intAr[j+1]=index;
	}
	return intAr;
}

/**
 *  function to sort the words in string array using insertion sort
 * @param strAr
 * @return
 */
public static String[] insertionSort(String[] strAr)
{
	for(int i=1;i<strAr.length;i++)
	{
		String index=strAr[i];
		int j=i-1;
		while(j>=0&&strAr[j].compareTo(index)>0)
		{
			strAr[j+1]=strAr[j];
			j=j-1;
		}
		strAr[j+1]=index;
	}
	return strAr;
}


/**
 * @param ar
 */
public static void  printArray(int[] ar)
{
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]);
	}
	System.out.println();
}
/**
 * @param ar
 */
public static void  printArray(String[] ar)
{
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]);
	}
	System.out.println();
}
/**
 * @param ar
 * @param key
 * @return
 */
public static int[] binarySearch(int ar[],int key)
{
	int first,last,mid;
	first=0;
	last=ar.length-1;
	boolean flag=false;
	while(first<=last)
	{
		mid=(first+last)/2;
		if(key==(ar[mid]))
		{
          System.out.println("number"+key+"found at position"+(mid+1));
          flag=true;
          break;
		}
		else if(key>(ar[mid]))
		 {
			first=mid+1;
		}
		else
		{
			last=mid-1;
		}
	}
	if(flag==false)
	{
		System.out.println("not found");
	}
	return ar;
	
}
/**
 * @param ar
 * @param key1
 * @return
 */
public static String[] binarySearch(String ar[],String key1)
{
	int first,last,mid;
	first=0;
	last=ar.length-1;
	boolean flag=false;
	while(first<=last)
	{
		mid=(first+last)/2;
		if(key1.compareTo(ar[mid])==0)
		{
          System.out.println("number"+key1+"found at position"+(mid+1));
          flag=true;
          break;
		}
		else if(key1.compareTo(ar[mid])>0)
		 {
			first=mid+1;
		}
		else
		{
			last=mid-1;
		}
	}
	if(flag==false)
	{
		System.out.println("not found");
	}
	return ar;
	
}

/**
 *  function to sort the words in string array using bubble sort
 * @param ar
 * @return
 */
public static String[]  bubbleSort(String ar[])
{
	for(int i=0;i<ar.length;i++)
	{
		for(int j=i;j<ar.length;j++)
		{
			if(ar[i].compareTo(ar[j])>0)
			{
				String temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
	}
	return ar;
	
}


/**
 * @param ar
 * @param low
 * @param high
 * @return
 */
public static String[] mergeSort(String ar[],int low,int high)
{
	if(low<high)
	{
		int mid=(low+high)/2;
		//sort first part of array
		mergeSort(ar,low,mid);
		//sort second part of array
		mergeSort(ar,mid+1,high);
		merge(ar,low,mid,high);
	}
	return ar;
}
/**
 * @param ar
 * @param start
 * @param mid
 * @param end
 */
public static void merge(String ar[],int start,int mid,int end)
{
	int p=start;int q=mid+1;
	Object arr[]=new Object[end-start+1];
	int k=0;
	for(int i=start;i<=end;i++)
	{
	if(p>mid)
	{
		arr[k++]=ar[q++];
		
	}
	else if(q>end)
	{
		arr[k++]=ar[p++];
		
	}
	else if(ar[q].compareTo(ar[p])<0)
	{
		arr[k++]=ar[p++];
		
	}
	else
	{
		arr[k++]=ar[q++];
	}}

for (int l=0 ; l< k ;l++)
{
	  ar[start++] = (String)arr[l] ;                          
}
}
//anagram
public static int[] sort(int[] ar)
{
	for(int i=0;i<ar.length;i++)
	{
		for(int j=i+1;j<ar.length-1;j++)
		{
	if(ar[i]>ar[j])
	{
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
	}
	}
	}
	return ar;
}
/**
 * @param low
 * @param high
 */
public static void search(int low, int high) 
{
	Scanner sc = new Scanner(System.in);
    int mid = low + (high - low) / 2;
    if(low<high)
    {
        System.out.println("Is your number in between " + low +" "+ (mid) );
        System.out.println("Press y for yes or n for no");
		if(sc.next().charAt(0)=='y')
		{
			search(low,mid);
		}
		else
		{
			search(mid+1,high);
		}
    }
    else
    {
    	System.out.println("The number is "+low);
    }
}
}



	





