
package com.bridgelabz.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	File file=new File("/home/bridgelabz/Javaprograms/text");
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
				for(int j=i+1;j<ar.length;j++)
				{
					if(ar[i].compareTo(ar[j])>0)
					 {
						String temp=ar[j];
						ar[j]=ar[i];
						ar[i]=temp;
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
		while(j>=0&&intAr[j]>(index))
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
public static <T extends Comparable<T>> T[] insertionSort(T[] strAr)
{
	for(int i=1;i<strAr.length;i++)
	{
		T index=strAr[i];
		int j=i-1;
		while(j>=0&&strAr[j].compareTo((T) index)>0)
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
public static <T extends Comparable<T>> T[] printArray(T[] ar)
{
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]);
	}
	System.out.println();
	return ar;
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
 * @return
 */
public static <T extends Comparable<T>> T[] binarySearch(T ar[],T key1)
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
 * @return
 */
public static <T extends Comparable<T>>  T[] bubbleSort(T ar[])
{
	for(int i=0;i<ar.length;i++)
	{
		for(int j=i;j<ar.length;j++)
		{
			if(ar[i].compareTo(ar[j])>0)
			{
				T temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
	}
	return ar;
	
}


/**
 * function to sort the words in string array using Merge sort
 * @param ar
 * @param low
 * @param high
 * @return 
 * @return
 */
public static <T extends Comparable<T>> T[] mergeSort(T ar[],int low,int high)
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
public static <T extends Comparable<T>> T[]merge(T ar[],int start,int mid,int end)
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
	  ar[start++] = (T)arr[l] ;                          
}
return ar;
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

/**
 * function to compute the square root of non negative number 
 * @param c
 * @param t
 * @param e
 * @return
 */
public static double squareRoot(double c,double t,double e)
{
	while(Math.abs(t-c/t)>e*t)
	{
		t=(c/t+t)/2;
	}
	return t;	
		}


/**
 * function to convert decimal to binary
 * @param num
 * @return
 */
public static String convertBinary(int num)
{
	int pwr=1;
	String str="";
	while(pwr<=num/2)
	{
		pwr=pwr*2;
	}
	while(pwr>0)
	{
		if(num<pwr)
		{
			str=str+0;
		}
		else {
			str=str+1;
			num=num-pwr;
			}
		pwr=pwr/2;
	}
	return str;
}
/**
 * @param notes
 * @param change
 * @param length
 * @return
 */
public static int count(int notes[],int change,int length)
{
	int count=0;
	for(int i=length-1;i>=0;i--)
	{
		while(change>=notes[i])
		{
			change=change-notes[i];
			System.out.println(notes[i]+"");
			count++;
		}
	}
	System.out.println();
	return count;
}
public static void convertBinarySwap(int num)
{
	int pwr=1;
	String str="";
	while(pwr<=num/2)
	{
		pwr=pwr*2;
	}
	while(pwr>0)
	{
		if(num<pwr)
		{
		   str=str+0;
		}
		else {
			str=str+1;
			num=num-pwr;
			}
		pwr=pwr/2;
	}
	System.out.println(str);;
	swap(str);
}
/**
 * @param str
 */
public static void swap(String str)
{
	if(str.length()<8)
	{
		while(str.length()<8)
		{
			str="0"+str;
		}
	}
	
	char ar[]=str.toCharArray();
	for(int i=0;i<(ar.length-1)/2;i++)
	{
		char ch=ar[i];
		ar[i]=ar[i+ar.length/2];
		ar[i+ar.length/2]=ch;
	}
	str=String.valueOf(ar);
	System.out.println("after swapping the string is"+str);
	int num=Integer.parseInt(str);
	int decimal=0;
	int pwr=0;
	while(true)
	{
		if(num==0) {
			break;
		}
		else
		{
			int temp=num%10;
			decimal=(int) (decimal+temp*Math.pow(2, pwr));
			num=num/10;
			pwr++;
		}
	}
	System.out.println(decimal);
	while(decimal%2==0)
	{
		decimal=decimal/2;
	}
	if(decimal==1)
		System.out.println("its a power of 2");
	else
		System.out.println("not powerof 2");
	}


static // functional programs
Scanner sc=new Scanner(System.in);

public final static int Int()
{
	return sc.nextInt();
}
public final static int Int1(int data)
{
	return sc.nextInt();
}
public static double Double()
{
	return sc.nextDouble();
}
public static double Double1(double data)
{
	return sc.nextDouble();
}

public static String String()
{
	return sc.next();
}
public static boolean Boolean()
{
	return sc.nextBoolean();
}
/**
 * Function to check leap year or not
 *@param year
 * 
 */
public  static boolean leap(int year)
{
if(year>1582)
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

public static void input(int row,int col,int choice)
{
	Scanner sc=new Scanner(System.in);
	switch(choice)
	{
	case 1:int[][] intAr=new int[row][col];
	System.out.println("enter the elements of array");
    for(int i=0;i<intAr.length;i++)
	{
		for(int j=0;j<intAr.length;j++)
		{
			intAr[i][j]=sc.nextInt();
		}
	}
	System.out.println("array elements are");
	printArrayElement(intAr);
	break;
	case 2:String [][] strAr=new String[row][col];
	System.out.println("enter the elements of array");
    for(int i=0;i<strAr.length;i++)
	{
		for(int j=0;j<strAr.length;j++)
		{
			strAr[i][j]=sc.next();
		}
	}
	System.out.println("array elements are");
	printArrayElement(strAr);
	break;
	case 3:double[][] doubleAr=new double[row][col];
	System.out.println("enter the elements of array");
    for(int i=0;i<doubleAr.length;i++)
	{
		for(int j=0;j<doubleAr.length;j++)
		{
			doubleAr[i][j]=sc.nextInt();
		}
	}
	System.out.println("array elements are");
	printArrayElement(doubleAr);
	break;
	}
}
public static  void printArrayElement(int[][] ar)
{
	for(int i=0;i<ar.length;i++)
	{
		for(int j=0;j<ar.length;j++)
		{
			System.out.println(ar[i][j]+" ");
		}
		System.out.println();;
	}
}

public static  void printArrayElement(String[][] ar)
{
	for(int i=0;i<ar.length;i++)
	{
		for(int j=0;j<ar.length;j++)
		{
			System.out.println(ar[i][j]+" ");
		}
		System.out.println();;
	}
}
public static  void printArrayElement(double[][] ar)
{
	for(int i=0;i<ar.length;i++)
	{
		for(int j=0;j<ar.length;j++)
		{
			System.out.println(ar[i][j]+" ");
		}
		System.out.println();;
	}
}
//Sum of three integers is 0
public static int sumisZero(int[] a,int length)
{
	int count=0;
	for(int i=0;i<length;i++)
	{
		for(int j=i+1;j<length;j++)
		{
			for(int k=i+1;k<length;k++)
			{
				if(a[i]+a[j]+a[k]==0)
				{
					System.out.println(a[i]+ " "+a[j]+ " "+a[k]);
					count++;
				}
			}
		}
	}
	return count;
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
	
/**
 * @param str
 * @return
 */
	public static boolean expression(String str)
	{
		int count=0;
		Stack s=new Stack();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			{
				s.push(str.charAt(i));
				count++;
			}
			if(str.charAt(i)==')')
			{
				if(s.isEmpty())
				{
					count--;
				}
				else
				{
					s.pop();
					count--;
				}
			}
		}
		if(s.isEmpty()&& count==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//calender
public static int dayOfWeek1(int month,int day,int year)
{
//System.out.println("entered date is"+month+"/"+day+"/"+year);
int	y0 = year - (14 - month) / 12;
//System.out.println(y0);
int x = y0 + y0/4 - y0/100 + y0/400;
//System.out.println(x);
int	m0 = month + 12 * ((14 -month) / 12) -2;
//System.out.println(m0);
int d0 = (day + x + 31*m0/ 12) % 7;
//System.out.println(d0);
return d0;
 }
}
	





