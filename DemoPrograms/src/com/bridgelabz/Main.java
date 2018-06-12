
package com.bridgelabz;
class Main
{
public static void main(String[] args) {
	Dog d=new Dog();
	System.out.println();
	d.sound();
	Animal a=new Animal();
	d.noise();
	//Dog d1= new Animal();
	Animal a1=new Dog();
	Animal a2=(Animal)d;
    Dog d2=(Dog)a2;
}

}
