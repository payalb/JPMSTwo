package com.java;

public class Demo1 {

	static{
		System.out.println("static block called!");
	}
	
	{
		System.out.println("instance block called!");
	}
	
	public Demo1(){
		System.out.println("Constructor called!");
	}

	public void print() {
		System.out.println("In com.java.Demo1");
	}
}
