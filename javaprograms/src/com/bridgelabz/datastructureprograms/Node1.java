
package com.bridgelabz.datastructureprograms;


public class Node1<T extends Comparable<T>> {
	public T data;
	public Node1<T> next;
	public Node1(T data)
	{
		this.data=data;
		this.next=null;
	}
	public Node1(T data,Node1<T> next)
	{
		this.data=data;
		this.next=null;
	}
	}


