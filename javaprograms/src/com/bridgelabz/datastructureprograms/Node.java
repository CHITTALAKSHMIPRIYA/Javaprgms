
package com.bridgelabz.datastructureprograms;
public class Node {
@SuppressWarnings("rawtypes")
public Comparable data;
public Node next;
@SuppressWarnings("rawtypes")
public Node(Comparable data)
{
	this.data=data;
	this.next=null;
}
@SuppressWarnings("rawtypes")
public Node(Comparable data,Node next)
{
	this.data=data;
	this.next=next;
}
}
