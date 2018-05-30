
package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.bridgelabz.util.Utility;

public class UnorderedMain {
/*************************************************************************************************************
 * 
 * purpose:Create a Unordered Linked List. The Basic Building Block is the Node Object. Each node object
   must hold at least two pieces of information. One ref to the data field and  second the ref to the 
   next node object.
 * @author Lakshmi Priya
 * @version 1.0
 * @since 25-05-18
 * 
 ***************************************************************************************************/

    public static void main(String[] args) {

    		UnorderedList list=UnorderedList.list();
    		File f = new File("/home/bridgelabz/Downloads/sts-bundle/sts-3.9.2.RELEASE/text2");
    		System.out.println("Enter the word you want to search:");
    		String searchItem = Utility.String();
    		BufferedReader reader = null;
    		try {
    			reader = new BufferedReader(new FileReader(f));
    			String word = reader.readLine();
    			System.out.println(word);
    			while (word != null) {
    				String[] str = word.split(" ");
    				for (int i = 0; i < str.length; i++) {
    					list.add(str[i]);
    				}
    				break;
    			}
    		} catch (Exception e) {
    			e.printStackTrace();
    		}

    		if (list.search(searchItem)) {
    			list.remove(searchItem);
    		} else {
    			list.add(searchItem);
    		}

    		String out = "";
    		while (list.size() > 0) {
    			out = list.pop() + " " + out;
    		}

    		try {
    			BufferedWriter writer = new BufferedWriter(new FileWriter(f));
    			writer.write(out);
    			System.out.println();
    			System.out.println("file written successfully");
    			writer.close();
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    }
}	
