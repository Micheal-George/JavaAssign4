package com.dayFour;



public class Student {

	int roll;
	 String name;
	 String address;
	 String collageName;
	 public Student() {
		 
	 }
	public Student(int roll,String name,String address)
	{
		this.name=name;
		this.address=address;
		this.roll=roll;
		this.collageName="NIT";
	}
	 
	public Student(int roll,String name,String address,String collageName)
	{
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName=collageName;
	}
	 public static Student getStudent(boolean isFromNIT)
	 {
	  if(isFromNIT==true)
	  {
		  Student s1=new Student(20,"Micheal","Kerala");
		  s1.collageName="NIT";
		  return s1;
	  }
	  else
	  {
		  Student s2=new Student(20,"Micheal","Kerala","other");
		  return s2;  
	  }
	 }
	 
	 void show()
	 { 
		 System.out.println(roll);
		 System.out.println(name);
		 System.out.println(address);
		 System.out.println(collageName);
	 }
	public static void main(String[] args) {
		
		getStudent(true).show();
		getStudent(false).show();

	}

}
