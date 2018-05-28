
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.Utility;

@SuppressWarnings("unused")
public class BankQueue {
    public static void main(String[] args) {
		Queue queue= Queue.queue();
           BankingCashCounter.bankTransaction(queue);
	}

}
