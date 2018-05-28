
package com.bridgelabz.datastructureprograms;
public class LinkedList<T extends Comparable<T>> {
	@SuppressWarnings("rawtypes")
	public static Node1 head;
	@SuppressWarnings("rawtypes")
	public static Node1 tail;
	static int count;
		//to add an item at last
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void add(T item)
	{
		Node1<T> temp=new Node1<T>(item,null);
		if(head==null)
		{
			head=temp;
			count++;
			System.out.println(item+" added successfully");
			return;
		}
		tail=head;
		while(tail.next!=null)
		{
			tail=tail.next;
		}
		tail.next=temp;
		tail=temp;
		count++;
		System.out.println(item+" added successfully");
	}
		//add an item at front
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void addFirst(T item)
	{
		Node1<T> nodeToinsert=new Node1<T>(item,null);
		if(head==null)
		{
			head=nodeToinsert;
			count++;
			System.out.println(item+" added successfully");
			return;
		}
		tail=head;
		while(tail.next!=null)
		{
			tail=tail.next;
		}
		nodeToinsert.next=head;
		head=nodeToinsert;
		count++;
		System.out.println(item+" added successfully");
	}
		//to find the size of list
	public static int size()
		{
			return count;
		}
		//to find list is empty or not
	public static boolean isEmpty()
		{
		  if(count==0)
		  return true;
		  return false;
        }
		//to check whether an item is present or not
		@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> boolean search(T item)
		{
			Node1<T> temp= head;
			if(tail.data.compareTo(item)==0)
				return true;
			while(temp.next!=null) {
				if(temp.data.compareTo(item)==0)
					return true;
				else
				{
					temp=temp.next;
				}
			}return false;
		}
		//to insert an item at given position
		@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void insert(int pos,T item)
		{
			Node1<T> nodeToinsert=new Node1<T>(item);
			if(pos>size())
			{
				System.out.println("position not available");
			
			}
			if(pos==1)
			{
				nodeToinsert.next=head;
				nodeToinsert=head;
				count++;
			}
			else
			{
				int trans=1;
				Node1<T> temp=head;
				while(trans!=pos-1)
				{
					temp=temp.next;
					trans++;
				}
				Node1<T> n=temp.next;
				temp.next=nodeToinsert;
				nodeToinsert.next=n;
				count++;
			}
		}
		//to remove a specified item from list
		@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void remove(T item)
		{
			Node1<T> temp=head,prev=null;
			if(temp!=null&& temp.data.compareTo(item)==0)
			{
				head=temp.next;
				count--;
				System.out.println(item +" remove successfully");
				return;
			}
			while(temp!=null&& temp.data.compareTo(item)!=0)
			{
				prev=temp;
				temp=temp.next;
			}
			if(temp==null)
			{
				System.out.println("element not found");
			}
			else
			{
				prev.next=temp.next;
				count--;
				System.out.println(item+ " removed successfully");
			}
		}
		//to fetch the last item as well as to remove it
		@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> T pop()
		{
			Node1<T> current=head;
			Node1<T> nextNode=current.next;
			if(head.next==null)
			{
				T c=(T)head.data;
				head=null;
				count--;
				return c;
			}
			while(nextNode.next!=null)
			{
				current=current.next;
				nextNode=current.next;
			}
			T c =(T)nextNode.data;
			current.next=null;
			current=tail;
			count--;
			return c;
		}
			
		}	
