package org.tnsif.acc.c2tc.oopsdemo;

class Human
{
	int age;
	String name;
}
public class BeforeEncapsulationDemo {

	public static void main(String[] args) {
		Human human=new Human();
		human.age=22;
		human.name="Navin";
		human.age=34;
		human.name="kiran";
		System.out.println("Age "+human.age);
		System.out.println("Name " +human.name);
		
		

	}

}
