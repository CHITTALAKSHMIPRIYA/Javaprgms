
package com.bridgelabz.datastructureprograms;

import java.util.NoSuchElementException;
public class LinkedQueue {
	protected Node3 front,rear;
	public int size;
public LinkedQueue()
{
	front=null;
	rear=null;
    size=0;
	}
/* function to check if the queue is empty*/
public boolean isEmpty()
{
	return front==null;
}
/* function to get the size of queue*/
public int getSize()
{
	return size;
}
/* function to insert an element to queue*/
public void insert(Object data)
{
	Node3 nptr=new Node3(data,null);
	if(rear==null)
	{
		front=nptr;
		rear=nptr;
	}
	else
	{
		rear.setLink(nptr);
		rear=rear.getLink();
	}
	size++;
}
/* function to remove an element from queue*/
public Object remove()
{
	if(isEmpty())
		throw new NoSuchElementException("Underflow Exception");
	Node3 ptr=front;
	front=ptr.getLink();
	if(front==null)
		rear=null;
	size--;
	return ptr.getData();
}
/* function to check the front element of queue*/
public Object peek()
{
	if(isEmpty())
		throw new NoSuchElementException("Underflow Exception");
	return front.getData();
}
/* function to display the status of queue*/
public void display()
{
	if(size==0)
	{
		System.out.println("empty");
		return;
	}
	Node3 ptr=front;
	while(ptr!=rear.getLink())
	{
		System.out.println(ptr.getData());
		ptr=ptr.getLink();
	}
	System.out.println();
}

}

