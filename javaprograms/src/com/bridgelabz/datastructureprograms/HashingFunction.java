
package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import com.bridgelabz.util.Utility;
/*************************************************************************************************************
 * 
 * purpose:Firstly store the numbers in the Slot. Since there are 10 Numbers divide each number by 11 and the reminder put in the appropriate 
   slot. Create a Chain for each Slot to avoid Collision. If a number searched is found then pop it or else push it. Use Map of Slot Numbers 
   and Ordered LinkedList to solve the problem. In the Figure Below, you can see number 77/11 reminder is 0 hence sits in the 0 slot
   while 26/11 remainder is 4 hence sits in slot 4
 * @author Lakshmi Priya
 * @version 1.0
 * @since 30-05-18
 * 
 * **************************************************************************************************/
public class HashingFunction {
	static int flag=0;
	static int remainder=0;
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		HashMap map=new HashMap();
		int size=list.size();
		String num="";
		LinkedList[] array=new LinkedList[11];
		for(int i=0;i<array.length;i++)
		{
         array[i]=new LinkedList();
	}
		 File f = new File("/home/bridgelabz/Downloads/sts-bundle/sts-3.9.2.RELEASE/hashmap");
	        FileReader fr = null;
	        FileWriter fw = null;
	        BufferedWriter bw = null;
	        ArrayList a = new ArrayList();
	        BufferedReader br = null;
	        try {
	            fr = new FileReader(f);
	            br= new BufferedReader(fr);
	            num = br.readLine();
	            while (num != null) {
	                String[] str = num.split(",");
	                for (int i = 0; i < str.length; i++) {
	                    flag++;
	                    a.add(str[i]);
	                }
	                break;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        int ar[]=new int[a.size()];
	        for(int i=0;i<a.size();i++)
	        {
	        	ar[i]=Integer.parseInt((String) a.get(i));
	        }
	        for(int i=0;i<ar.length;i++)
	        {
	        	list.add(ar[i]);
	        }
	        list.display();
	        for (int i = 0; i < array.length; i++) {
	            Integer value = list.removeFront();
	            remainder = value % 11;
	            map.put(remainder, value);
	        }
	        System.out.println(map.entrySet());
	        System.out.println("Enter the num to search in the linked list");
	        int number1 = 0;
	        number1 = Utility.Int();
	        if (map.containsValue(number1)) {
	            int key = number1 % 11;
	            map.remove(key);
	            System.out.println("num removed Successfully");
	            System.out.println(map.entrySet());
	        } else {
	            int key1 = number1 % 11;
	            map.put(key1, map.get(key1) + "," + number1);
	            System.out.println(map.entrySet());
	        }
	       /* try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(f));
				writer.write(number1);
				writer.flush();
				System.out.println();
				System.out.println("file written successfully");
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}*/
	    }
}