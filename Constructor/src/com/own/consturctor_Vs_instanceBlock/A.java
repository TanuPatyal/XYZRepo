package com.own.consturctor_Vs_instanceBlock;

public class A {
	int rollno;
	String name;
  static
  {
	  System.out.println("static block");
  }
  
  {
	  System.out.println("instance block");
	 name="xyz";
	 rollno=111;
  }
  A(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
  
	public static void main(String[] args) {
		A a=new A("PRIYA",121);
		
		A a1= new A("Yuvi",145);
		
		A a2=new A("MAnni",569);
		System.out.println(a.name+""+a.rollno);
		System.out.println(a1.name+""+a1.rollno);
		System.out.println(a2.name+" "+a2.rollno);
		System.out.println("---------------------------------------");
		
		
		
	}
		
	
}
