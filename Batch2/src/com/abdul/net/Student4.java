package com.abdul.net;
public class Student4{ 
	
	public static String COLLEGE_NAME;
	
	static { 
		System.out.println("static block invoked");
		COLLEGE_NAME = "IIT";
	}
	
	
	
	
	//------------------ partitions/instance vars
	int id;  
	String name;
	//----------------
	//creating a parameterized constructor  
	Student4(int i,String n){  
		id = i;  
		name = n;  
	}  
	Student4(){}
	
	public static int average(int a, int b, int c) {
		return a+b+c /3;
	}
	
	
	//method to display the values  
	void display(){
		System.out.println(id+" "+name);}  

	public static void main(String args[]){  
		//creating objects and passing values  
		Student4 s1 = new Student4(111,"Karan");  
		Student4 s2 = new Student4(222,"Aryan");  
		//calling method to display the values of object  
		s1.display();  
		s2.display();  
		System.out.println(Student4.COLLEGE_NAME);
	}  
}  