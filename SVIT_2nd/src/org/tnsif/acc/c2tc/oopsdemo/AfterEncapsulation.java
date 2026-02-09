package org.tnsif.acc.c2tc.oopsdemo;

class Human1
{
	private int age;
	private String name;
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}


public class AfterEncapsulation {

	public static void main(String[] args) {
		Human1 human1=new Human1();
		human1.setAge(23);
		human1.setName("Akash");
		System.out.println(human1.getAge());
		System.out.println(human1.getName());
		
		human1.setAge(67);
		human1.setName("Sushma");
		System.out.println(human1.getAge());
		System.out.println(human1.getName());
	}

}
