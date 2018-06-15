/**
 * 
 */
package com.bridgelabz.designPatterns.VisitorPattern;

/**
 * @author bridgelabz
 *
 */
public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}
