
package com.bridgelabz.datastructureprograms;


public class StackList {
LinkedList li= LinkedList.list();
	
	public void push(Comparable item)
	{
		li.insert(item, 0);
	}
	
	public  Comparable pop()
	{
		return li.pop(0);
	}
	
	public Comparable peek() 
	{
	   return li.peek();
	}
	
	public  boolean isEmpty()
	{
		return li.isEmpty();
	}
	
	public int size()
	{
		return li.size();
	}
	public  int get(int index)
	{
		return ((int)li.get(index));
	}
	//to display the stack
		public void display()
		{
			li.displayln();
		}

}
