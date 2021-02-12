package com.own.consturctor_Vs_instanceBlock;

public class InstanceBlock {
	static int count1=0;
	static int count=0;
	{
		
		count1=count1+1;
	}
  InstanceBlock()
  {
	  System.out.println("no_arg");
	  count++;
  }
  InstanceBlock(int i)
  {
	  this();
	  System.out.println("int Constructor");
	  count++;
	  
  }
  InstanceBlock(String i)
  { this(25);
	  System.out.println("String Constructor");
	  count++;
  }
  
  public static void main(String[] args) {
	  InstanceBlock a1=new InstanceBlock(25);
	  
	InstanceBlock a=new InstanceBlock();
	
	InstanceBlock a3=new InstanceBlock("AA");
	
	System.out.println(count);
	System.out.println(count1);
	
	}
}
