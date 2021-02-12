package com.own.constructor;

public class Student {

	String name;
	int rollno;
	
	{
		name="AAA";
		rollno=000;
		
		m1();
		
	}
	
	public void m1()
	{
		System.out.println("m1...method");
	}
	public Student(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		
	}
	
	public static void main(String[] args) {
		Student s=new Student("Tanu",111);//aaa,000//tanu,111
		
		Student s1=new Student("Priya",121);
		System.out.println(s.name+"  "+s.rollno);
		System.out.println(s1.name+"  "+s1.rollno);
	}
	
}
