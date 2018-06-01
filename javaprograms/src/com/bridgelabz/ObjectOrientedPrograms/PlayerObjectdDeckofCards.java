package com.bridgelabz.ObjectOrientedPrograms;

import java.util.LinkedList;

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
        	for(int j=0;i<rank.length;j++)
        	{
        		cards[index++].add(suit[i]+" "+rank[j]);
        	}
        }
	}

}
