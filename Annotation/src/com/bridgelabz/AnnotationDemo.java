
package com.bridgelabz;

import java.util.ArrayList;

/**
 * @author bridgelabz
 *
 */
@FunctionalInterface
interface Abc
{
	void show();
}
class A
{
	public void show()
	{
		System.out.println("class A");
	}
}
class B extends A
{
	@Deprecated
	public void run()
	{
	
	}
	@SuppressWarnings({ "rawtypes", "unused" })
	@Override
	public void show()
	{
		ArrayList obj=new ArrayList();
		System.out.println("class B");
	}
}
public class AnnotationDemo {

	
	public static void main(String[] args) {
		B obj=new B();
		obj.show();
		obj.run();

	}

}
