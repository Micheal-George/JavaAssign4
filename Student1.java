package com.dayFour;

public class Student1 {

	private int roll;
	private String name;
	private int age;
	private int marks;
	
	public Student1() {
		
	}
	
	public Student1(int roll,String name,int age,int marks){
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.marks=marks;
		}
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public int getRoll() {
		return roll; 
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String setName() {
		return name; 
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age; 
	}
	
	public void setMark(int marks) {
		this.marks=marks;
	}
	public int getMark() {
		return marks; 
	}
	
	
	
	void showDetails() {
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Name is :"+age);
		System.out.println("Marks is :"+marks);
	}
	public static void main(String[] args) {
		
		int x=15;
		int m=200;
		
		if((x>18&&x<60)&&(m>0&&m<500))
		{
		Student1 s1=new Student1(20,"Micheal",x,m);	
		System.out.println("Show details of student 1");
		s1.showDetails();
		System.out.println("========================");
		Student1 s2=new Student1();
		s2.setAge(x);
		s2.setMark(m);
		s2.setName("Micheal");
		s2.setRoll(25);
		System.out.println("Show details of student 2");
		s2.showDetails();
		}
		else
		{
			System.out.println("Not Validate");
		}
		
		
		

	}

}
