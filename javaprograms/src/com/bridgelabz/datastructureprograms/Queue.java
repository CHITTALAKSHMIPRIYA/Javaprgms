
package com.bridgelabz.datastructureprograms;
public class Queue<T> {
	 
	 int capacity;
	 int front=-1;
	 int rear=-1;
	int array[];
	 Queue(int capacity)
	{
		this.capacity=capacity;
		array=new int[capacity];
	}
	public int enqueue(T data)
	{
		if(rear==capacity-1)
		{
			System.out.println("queue is full");
			return -1;
		}
		if(front==-1&& rear==-1)
		{
			front++;
		}
		return array[++rear]=(int) data;
		
	}
	public int dequeue()
	{
		if(front==capacity-1)
		{
			System.out.println("queue is empty");
			return -1;
		}
		if(front>rear)
		{
			front=rear=-1;
			System.out.println("queue is empty");
			return -1;
		}
		return array[front++];
	}
	public int  isEmpty(Queue queue)
	{
		if(front==capacity-1)
		{
			System.out.println("queue is empty");
			return -1;
		}
		front++;
		return array[front];
	}
	public void display()
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.println(array[i]);
		}
	}
	
	/**
	 * @return
	 */
	public int capacity() {
		this.capacity=capacity;
		return capacity;
	}
	
	
}
