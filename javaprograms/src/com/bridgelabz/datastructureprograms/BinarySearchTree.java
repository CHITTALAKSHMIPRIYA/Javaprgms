
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.Utility;

public class BinarySearchTree {
     public static void main(String[] args) {
		System.out.println("enter num of test cases");
		int testcase=Utility.Int();
		int[] res=new int[testcase];
		for(int i=0;i<testcase;i++)
		{
			System.out.println("enter number of nodes");
			int nodes=Utility.Int();
			res[i]=Utility.treeCount(nodes);
		}
			for(int i=0;i<res.length;i++)
			{
				System.out.println("no of binary trees possible="+ res[i]);
		}

	}

}
