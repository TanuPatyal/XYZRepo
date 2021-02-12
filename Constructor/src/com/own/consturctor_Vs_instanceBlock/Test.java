package com.own.consturctor_Vs_instanceBlock;

public class Test {

private static final String staticvar="A";
private int i;
private static int j;
private static final int k=10;
private final int l=20;
		public static void main(String[] args) {
			
			Child c = new Child();
			
			Parent p = new Parent();
			//p.Pm1();
		
			System.out.println(c.toString());
			c.Pm1();
		}
		
	}

	class GrandParent {
		private String typeOfMachine;
		
		static {
			System.out.println("GP Static block 1");
		}
		
		{
			System.out.println("GP non static block 1");
		}
		
		public GrandParent() {
			System.out.println("GP Constructor");
		}
	}

	class Parent extends GrandParent {
		
		static {
			System.out.println("P Static block 1");
		}
		
		{
			System.out.println("P non static block 1");
		}
		
		public Parent() {
			System.out.println("P constructor");
		}
		
		public void Pm1() {
			System.out.println("P m1()");
		}
	}


	class Child extends Parent{
		
		static {
			System.out.println("C Static block 1");
		}
		
		{
			System.out.println("C non static block 1");
		}
		
		public Child()	{
			System.out.println("C constructor ");
		}
		
		public void Pm1()	{
			
			System.out.println("C m1()");
			
		}
		
		@Override
		public String toString()
		{
			return null;
		}

	}

