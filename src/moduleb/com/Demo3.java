package com;

import com.java.Demo1;
import com.java1.Demo2;
public class Demo3 {

	{
		System.out.println("In instance block of demo3");
	}
	
	public void print() {
		Demo1 obj1= new Demo1();
		obj1.print();
		Demo2 obj2= new Demo2();
		obj2.print();
	}
	
	public static void main(String args[]) {
		Demo3 obj= new Demo3();
		obj.print();
	}
}
