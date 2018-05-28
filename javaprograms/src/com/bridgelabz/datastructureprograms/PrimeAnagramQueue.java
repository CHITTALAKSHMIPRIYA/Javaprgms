
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.Utility;

public class PrimeAnagramQueue {
	public static void main(String[] args) {
		Queue primeanagram=new Queue();
		LinkedList prime=new LinkedList();
		for(int i=0;i<1000;i++)
		{
			if(Utility.primePalAgm(i))
			{
				prime(add(i));
		}

	}

}

	/**
	 * @param i
	 * @return
	 */
	