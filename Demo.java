package com.dayFour;

public class Demo {
	
	
	void Demo()
	{
		System.out.println("constructor function with");
	}
	void Demo(String s) {
		System.out.println("constructor function with "+s);
	}
	void Demo(int i) {
		System.out.println("constructor function with "+i);
	}
	void Demo(float f) {
		System.out.println("constructor function with "+f);
	}
	
	public static void main(String[] args) {
		
		Demo d1=new Demo();
		d1.Demo();
		d1.Demo("string");
		d1.Demo(10);
		d1.Demo(20.03f);

	}

}
