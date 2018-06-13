/**
 * 
 */
package com.bridgelabz.datastructureprograms.NumberChaining;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bridgelabz.util.Utility;


public class NumberChaining {
	 static int totalSlot = 11;
	    static int slotNumber;
	    @SuppressWarnings("unchecked")
		static List<Integer> myList=(List<Integer>) new LinkedList();
	    static List []list=(List[]) new LinkedList[totalSlot];
	    @SuppressWarnings("rawtypes")
		static Map<Integer, List> numberMap = new HashMap<Integer,List>();
	    @SuppressWarnings("unchecked")
		public static void main(String[] args){
	    	File readFile=new File("/home/bridgelabz/Downloads/sts-bundle/sts-3.9.2.RELEASE/hashmap");
	    	myList=UtilityHashing.fileRead(readFile);
	    	
	        System.out.println("Enter the number to search in the map");
	        int numberSearch = Utility.Int();
	        if(myList.contains(numberSearch))
	        {    System.out.println(numberSearch+" found and removed");
	        	myList.remove((Integer)numberSearch);
	        }
	        else {
	        	System.out.println(numberSearch+" not found and added");
	        	myList.add(numberSearch);
	        }
	       
	        for (int i = 0; i < myList.size(); i++) 
	        {
	            if(list[myList.get(i) % 11]==null)
	            {
	            	list[myList.get(i) % 11]=(List) new LinkedList();
	            	numberMap.put(myList.get(i) % 11, list[myList.get(i) % 11]);
	            }
	            list[myList.get(i) % 11].add(myList.get(i));
	          
	        }
	                  
	        System.out.println("Displaying your map" + numberMap);
	       File f=new File("/home/bridgelabz/Downloads/sts-bundle/sts-3.9.2.RELEASE/hashmap/hashmap");
	        UtilityHashing.writetofile(f, numberMap);                
	    }

	}


