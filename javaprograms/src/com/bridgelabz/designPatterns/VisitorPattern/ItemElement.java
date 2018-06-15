/**
 * 
 */
package com.bridgelabz.designPatterns.VisitorPattern;

/**
 * @author bridgelabz
 *
 */
public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}
