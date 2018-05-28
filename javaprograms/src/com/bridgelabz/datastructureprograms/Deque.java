
package com.bridgelabz.datastructureprograms;
public class Deque {
public static Node front;
public static Node rear;
static int count;
//create anew empty list
public static Deque deque()
{
return new Deque();
}
//adding an item at the front
@SuppressWarnings("rawtypes")
public void addFront(Comparable item)
{
	Node nodeToInsert=new Node(item,null);
	if(front==null)
	{
		front=nodeToInsert;
		count++;
		System.out.println(item+" added sucesfully");
		return;
	}
	rear=front;
	nodeToInsert.next=front;
	front=nodeToInsert;
	count++;
	System.out.println(item+" added successfully");
	while(rear.next!=null)
	{
		rear=rear.next;
	}
	return;
}
//to add an item at the last
@SuppressWarnings("rawtypes")
public void addRear(Comparable item)
{
	Node temp=new Node(item,null);
	if(front==null)
	{
		front=temp;
		count++;
		System.out.println(item+" added successfully");
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
	System.out.println(item+" added successfully");
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
//to check whether the item is present or not
@SuppressWarnings({ "rawtypes", "unchecked" })
public static boolean search(Comparable item)
{
	Node temp=front;
	if(rear.data.compareTo(item)==0)
		return true;

while(temp.next!=null)
{
	if(temp.data.compareTo(item)==0)
		return true;
	else
	{
		temp=temp.next;
	}
}
return false;
}
//to remove last item and remove it
@SuppressWarnings("rawtypes")
public static Comparable removeFront()
{
	Comparable res=front.data;
	front=front.next;
	return res;
}
//to 
@SuppressWarnings("rawtypes")
public static Comparable removeRear()
{
	Node current=front;
	Node nextNode=current.next;
	if(front.next==null)
	{
		Comparable c=front.data;
		front=null;
		count--;
		return c;
	}
	while(nextNode.next!=null)
	{
		current=current.next;
		nextNode=current.next;
	}
	Comparable c=nextNode.data;
	current.next=null;
	rear=current;
	nextNode=null;
	count--;
	return c;
}
// public static void display()
{
	Node temp=front;
	for(int i=1;i<=size();i++)
	{
		System.out.println(temp.data+" ");
		temp=temp.next;
	}
}
}


