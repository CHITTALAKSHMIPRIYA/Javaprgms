
package com.bridgelabz.datastructureprograms;
public class Queue{
	public static Node front;
	public static Node rear;
	static int count;
	//create anew empty list
	public static Queue queue()
	{
	return new Queue();
	}
	//adding an item at the front
	public void enqueue(Comparable item)
	{
		Node temp=new Node(item,null);
		if(front==null)
		{
			front=temp;
			count++;
			System.out.println(item+" added sucesfully");
			return;
		}
		rear=front;
		while(rear.next!=null)
		{
			rear=rear.next;
		}
		rear.next=temp;
		rear=temp;
		count++;
		System.out.println(item+" added sucesfully");
	}
	public static Comparable dequeue()
	{
		Comparable res=front.data;
		front=front.next;
		System.out.println("removed from queue");
		return res;
	}
	//to find the size of list
	public static int size()
	{
		return count;
	}
	public static boolean isEmpty()
	{
		if(count==0)
		{
			return true;
		}
		return false;
	}
}
	 