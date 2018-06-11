
package com.bridgelabz.datastructureprograms;
public class Stack {
	private int maxSize;
	@SuppressWarnings("rawtypes")
	private Comparable[] stackAr;
	private int top;

	public Stack(int size) {
		maxSize = size;
		stackAr = new Comparable[maxSize];
		top = -1;
	}

	

	// to create a empty stack
	public static Stack stack(int size) {
		return new Stack(size);
	}

	// to push an element into the stack
	@SuppressWarnings("rawtypes")
	public void push(Comparable value) {
		if (top == maxSize - 1)
			System.out.println("stack overflowed");
		stackAr[++top] = value;
	}

	// to pop an item from the top and remove it
	@SuppressWarnings("rawtypes")
	public Comparable pop() {
		return stackAr[top--];
	}

	// to fetch an item from top without removing it
	@SuppressWarnings("rawtypes")
	public Comparable peek() {
		return stackAr[top];
	}

	// to check whether the stack is empty or not
	public boolean isEmpty() {
		return (top <= -1);
	}

	// to check whether stack is full or not
	public boolean isFull() {
		return (top == maxSize - 1);
	}

	// to find the size of the stack
	public int size() {
		return top;
	}
	public void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(stackAr[i]);
		}
	}
	
}
