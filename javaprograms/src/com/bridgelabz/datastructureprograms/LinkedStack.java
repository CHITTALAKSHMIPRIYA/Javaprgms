
package com.bridgelabz.datastructureprograms;

import java.util.NoSuchElementException;

public class LinkedStack {
   protected Node3 top;
   protected int size;
   public LinkedStack()
   {
	   top=null;
	   size=0;
   }
   /*  Function to check if stack is empty */
   public boolean isEmpty()
   {
	   return top==null;
   }
   /*  Function to get the size of the stack */
   public int getSize()
   {
	   return size;
   }
   /*  Function to push an element from the stack */
   public void push(int data)
   {
	   Node3 nptr=new Node3(data,null);
	   if(top==null)
	   {
		   top=nptr;
	   }
	   else
	   {
		   nptr.setLink(top);
		   top=nptr;
	   }
	   size++;
   }
   /*  Function to pop an element from the stack */
   public Object pop()
   {
       if (isEmpty() )

           throw new NoSuchElementException("Underflow Exception") ;
	   Node3 ptr=top;
	   top=ptr.getLink();
	   size--;
	return ptr.getData();
   }
   /*  Function to check the top element of the stack */
   public Object peek1()
   {
   	if(isEmpty())
   		throw new NoSuchElementException("Underflow Exception");
   	return top.getData();
   }
   /*  Function to display the status of the stack */
   @SuppressWarnings("null")
public void display()
   {
	   if(size==0)
	   {
		   System.out.println("empty");
	   }
	   Node3 ptr=top;
	   while(ptr==null)
	   {
		   System.out.println(ptr.getData());
		   ptr=ptr.getLink();
	   }
	   System.out.println();
   }
}