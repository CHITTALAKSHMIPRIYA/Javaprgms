
package com.bridgelabz.datastructureprograms;
public class OrderedList {
	 LinkedList l=new LinkedList();

		// to create a new empty list
		public  static OrderedList orderedlist() {
			return new OrderedList();
		}

		// to add an item to the list
		@SuppressWarnings("rawtypes")
		public void add(Comparable item) {
			l.addSort(item);
		}

		// to find the size of the list
		public int size() {
			return l.size();
		}

		// to find a a list empty or not
		public boolean isEmpty() {
			return l.isEmpty();
		}

		// to return a index of a particular value
		@SuppressWarnings("rawtypes")
		public  int index(Comparable item) {
			return l.index(item);
		}

		// to check whether the item is present or not
		@SuppressWarnings("rawtypes")
		public  boolean search(Comparable item) {

			return l.search(item);
		}

		// to remove a specified item from the list
		@SuppressWarnings("rawtypes")
		public void remove(Comparable item) {
			l.remove(item);
		}

		// to fetch the last item as well as to remove it
		@SuppressWarnings("rawtypes")
		public Comparable pop() {

			return l.pop();
		}

		public void display() {
			l.display();
		}

		// to fetch an item from specified position and to remove it
		@SuppressWarnings("rawtypes")
		public Comparable pop(int pos) {

			return l.pop(pos);
		}

}
