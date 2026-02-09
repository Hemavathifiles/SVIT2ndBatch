package org.tnsif.acc.c2tc.oopsdemo;

class Employee
{
	void company()
	{
		System.out.println("Company : TNSIF");
	}
}
class Developer extends Employee
{
	void role()
	{
		System.out.println("Role : Software Developer");
	}
}
class Tester extends Employee
{
	void role()
	{
		System.out.println("Role : Test Engg");
	}
}

public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		Developer dev=new Developer();
		Tester tester=new Tester();
		
		dev.company();
		dev.role();
		
		tester.company();
		tester.role();

	}

}
