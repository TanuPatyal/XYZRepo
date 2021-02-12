package com.own.superAndthis;

public class Rules {
	
	public Rules()
	{
		System.out.println("no arg");
		//this(25);----- must be in first line
	}
	
	public Rules(int i) {
		this(15.00);
		System.out.println("int");
	}
	 public Rules (String s)
	 {
		 super();
		 System.out.println("string");
	
	}
	 public Rules (double s)
	 {
		 super();
		// this();----------- cant use both
		 System.out.println("double");
	
	}
	 public static void main(String[] args) {
		 Rules r=new Rules(69);
		 Rules r1=new Rules("AA");
		 Rules r2=new Rules(10.256);
		 Rules r3=new Rules();
		
	}

}
