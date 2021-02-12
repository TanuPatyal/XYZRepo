package com.owm.Abstract_Class_Constructor;

class Parent {
	
	Parent()	
	{
		System.out.println(this.hashCode());
	}
}


class child extends Parent{
	
	public child() {
		// TODO Auto-generated constructor stub
		System.out.println(this.hashCode());
	}
	
}


public class Test {
	
	public static void main(String[] args) {
		System.out.println("----------Child Refrence-------------");
		child c=new child();
		System.out.println(c.hashCode());
		System.out.println("----------Parent Refrence-------------");
		Parent p= new child();
		System.out.println(p.hashCode());
	}

}
