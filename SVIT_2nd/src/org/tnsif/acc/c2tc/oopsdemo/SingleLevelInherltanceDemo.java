package org.tnsif.acc.c2tc.oopsdemo;

class Course //super class
{
	String coursename="Java Programming";
	
	void showCourse()
	{
		System.out.println("Course : "+ coursename);
	}
			
}

class Student extends Course  //sub class
{
	String studentName="Amit";
	
	void showStudent()
	{
		System.out.println("Student : "+ studentName );
	}
}


public class SingleLevelInherltanceDemo {

	public static void main(String[] args) {
		Student student =new Student();
		student.showStudent();
		student.showCourse();

	}

}
