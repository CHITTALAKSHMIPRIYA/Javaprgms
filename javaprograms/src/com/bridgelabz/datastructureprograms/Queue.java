
package com.bridgelabz.datastructureprograms;
public class Queue{
   LinkedList l = LinkedList.list();

	// to return an empty queue
	static Queue queue() {
		return new Queue();
	}

	// to add in the queue
	@SuppressWarnings("rawtypes")
	public void enqueue(Comparable item) {
		l.add(item);
	}

	// to display items
	public void display() {
		l.displayln();
	}

	// to remove an element
	@SuppressWarnings("rawtypes")
	public Comparable dequeue() {
		return (l.pop(0));
	}

	// to find the size
	public int size() {
		return l.size();
	}

	// to check whether the queue is empty or not
	boolean isEmpty() {
		return l.isEmpty();
	}
	public void insert(Comparable item,int pos)
	{
		return;
	}

}

	