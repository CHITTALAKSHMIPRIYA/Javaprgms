
package com.bridgelabz.datastructureprograms;
public class Stack {
  int MAX;
  int top;
  int[] a=new int[MAX];
  boolean isEmpty()
  {
	  return (top<0);
  }
  public Stack()
  {
	  top=-1;
  }
  boolean push(int x)
  {
	  if(top>=MAX)
	  {
		  System.out.println("stack overflow");
		  return false;
	  }
	  else
	  {
		  a[++top]=x;
	  return true;
  }
}
  int pop()
  {
	  if(top<0)
	  {
		  System.out.println("stack underflow");
		  return 0;
	  }
	  else
	  {
		  int x=a[top--];
		  return x;
	  }
  }
  public int peek()
  {
	  if(top==-1)
	  {
		  System.out.println("stack empty");
		  return 0;
	  }
	  return a[top];
  }
}
