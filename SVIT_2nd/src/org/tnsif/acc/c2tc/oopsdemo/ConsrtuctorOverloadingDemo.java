package org.tnsif.acc.c2tc.oopsdemo;


class Student2
{
	String name;
	int age;
	
	Student2()
	{
		System.out.println("Default Constructor");
	}
	Student2(String name)
	{
		this.name=name;
		System.out.println("Name "+name);
	}
	Student2(String name , int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name "+name + "  Age "+ age);
	}
}
public class ConsrtuctorOverloadingDemo {

	public static void main(String[] args) {
		Student2 s1=new Student2();
		Student2 s2=new Student2("Alice");
		Student2 s3=new Student2("Hema",26);

	}

}
