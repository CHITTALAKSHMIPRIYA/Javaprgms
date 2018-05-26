
package com.bridgelabz.datastructureprograms;
public class LinkedList {
	class Node
	{
		public Object data;
		public Node next;
		public Node(Object data)
		{
			this.data=data;
		}
	}
		public Node head=null;
		public int size=0;
		/**
		 * function to add data in linked list 
		 * @param data
		 */
		public void add(Object data)
		{
			Node n1=new Node(data);
			if(head==null)
			{
				head=n1;
				size++;
				return;
			}
			Node temp=head;
			while (temp.next!=null)
			{
				temp=(Node)temp.next;
			}
			temp.next=n1;
			size++;
			}
		/**
		 * @param data
		 */
		public void addFirst(Object data)
		{
			Node n1=new Node(data);
			n1.next=head;
			head=n1;
			size++;
			}
		/**
		 * 
		 */
		public void display()
		{
			Node temp=head;
			while(temp!=null) {
				System.out.println("data:"+temp.data);		
			temp=temp.next;	
			}
		}
		/**
		 * @param data
		 * @param index
		 */
		public void addAt(Object data,int index)
		{
		if(index==0)
			{
			addFirst(data);
			return;
			}
		Node n1=new Node(data);
		int count=0;
		Node temp=head;
		while(count<index-1)
		{
			temp=temp.next;
			count++;
		}
		n1.next=temp.next;
		temp.next=n1;
		size++;
			}
		/**
		 * @return
		 */
		public int size()
		{
			return size;
		}
		public int isEmpty()
		{
			return size=0;
		}
		/**
		 * @param index
		 * @return
		 */
		public Object removeAt(int index)
		{
			if(index==0)
			{
				Object temp=head.data;
				head=head.next;
				size--;
				return temp;
				}
			Node t=head;
			int count=0;
			while(count<index-1)
			{
				t=(Node)t.next;
				count++;
			}
			Object temp=t.next.data;
			t.next=t.next.next;
					size--;
			return temp;
		}
		/**
		 * @return
		 */
		public Object removeFirst()
		{
			Object temp=head.data;
			head=(Node)head.next;
				size--;
				return temp;
					}
		/**
		 * @param start
		 */
		public void reverse(Node start)
		{
			if(start.next!=null)
			reverse(start.next);
		}
		public void reverse()
		{
			reverse(head);
		}
		public void displayMid()
		{
			Node mid=head;
			int count=0;
			while(count!=size/2)
			{
				mid =mid.next;
				count++;
			}
			System.out.println(mid.data);
		}
		/**
		 * @param data
		 * @return
		 */
		public int search(Object data)
		{
			if(head.data.equals(data))
			{
				return 0;
			}
			Node temp=head;
			int count=0;
			while(temp.next!=null)
			{
				temp=temp.next;
				count++;
				if(temp.data.equals(data))
				{
					System.out.println("word is present at:"+count);
					return count;
			}
			}
return -1;
}
		/**
		 * @param intAr
		 */
		public static int[] sort(int[] intAr)
		{
			for(int i=0;i<intAr.length;i++)
			{
				for(int j=i;j<intAr.length;j++)
				{
			if(intAr[i]>intAr[j])
			{
				int temp=intAr[i];
				intAr[i]=intAr[j];
				intAr[j]=temp;
			}
			}
			}
			return intAr;
		}
			
		}
	

