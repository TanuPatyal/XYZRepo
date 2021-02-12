package com.own.consturctor_Vs_instanceBlock;

public class Const_VS_Instance {

	 private static final int k;
	  private  int l;
	  private final int m;
	  static
	  {
		  k=20;
		  System.out.println("Static Block");
	  }
	  {
		  m=45;
		  System.out.println("Instance Block");
	  }
	  
	  public Const_VS_Instance()
	  {
		  System.out.println("constructor");
	  }
	  
	  
	  public static void main(String[] args) {
		Const_VS_Instance cs=new Const_VS_Instance();
		System.out.println(cs.m);
		Const_VS_Instance  cs1=new Const_VS_Instance();
		System.out.println(cs1.l);
		
	}
}
