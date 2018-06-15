/**
 * 
 */
package com.bridgelabz.designPatterns.VisitorPattern;

/**
 * @author bridgelabz
 *
 */
public class ShopingCartClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[]{
				new Book(50, "234"),new Book(150, "578"),
				new Fruit(15, 2, "Banana"), new Fruit(25, 5, "Apple")};
		
		int total = calculatePrice(items);
		System.out.println("Total Cost = "+total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum=0;
		for(ItemElement item : items){
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

	}


