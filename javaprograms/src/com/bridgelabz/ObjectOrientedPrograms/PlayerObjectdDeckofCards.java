package com.bridgelabz.ObjectOrientedPrograms;



import com.bridgelabz.datastructureprograms.LinkedList;
import com.bridgelabz.util.Utility;

/**
 * Method to Shuffle a Deck of Cards
 * @return the shuffled deck of cards
 */

public class PlayerObjectdDeckofCards {
	public static void main(String[] args) {
		 String[] suit= {"Clubs","Diamonds", "Hearts", "Spades"};
		 String[] rank= {"2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King", "Ace"	};
		 int index=0;
		 LinkedList[] cards=new LinkedList[52];
		 for(int i=0;i<cards.length;i++)
		 {
			 cards[i]=new LinkedList();
		 }
		 for(int i=0;i<suit.length;i++)
		 {
			 for(int j=0;j<rank.length;j++)
			 {
				 cards[index++].add(rank[j]+" "+suit[i]);
			 }
		 }
		 String[][]players=Utility.distributeCards(cards);
			Utility.printingcards(players);
			
			LinkedList[] arrange=Utility.rearrange(players);
	Utility.showBySorted(arrange);
	}
	
}
