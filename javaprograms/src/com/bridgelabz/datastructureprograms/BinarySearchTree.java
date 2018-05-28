
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.Utility;

public class BinarySearchTree {

	
	public static void main(String[] args) {
		System.out.println("enter num of test cases");
		int num=Utility.Int();
		for(int i=1;i<=num;i++)
		{
			System.out.println("enter number of nodes");
			int number=Utility.Int();
			System.out.println("number of binary trees possible"+ Utility.treeCount(number));
		}

	}

}
