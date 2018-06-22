
package com.bridgelabz;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author bridgelabz
 *
 */
@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Smartphone
{
	String os() default "Symbian";
	double version() default 1;
}
@Smartphone(os="Android",version=5.1)
class Lenovo
{
	String model;
	int size;
	/**
	 * @param model
	 * @param size
	 */
	public Lenovo(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}
	
}
public class MyAnnotation 
{
	public static void main(String[] args) {
		Lenovo obj=new Lenovo("k4note",5);
		Class c=obj.getClass();
		Annotation an=c.getAnnotation(Smartphone.class);
		Smartphone s=(Smartphone)an;
		System.out.println(s.os());

	}

}
