package com.abdul.db;
public class A{  
	public A() {
		this(5);
		System.out.println("hello and welcome");
		}

	public A(int i) {
		System.out.println(i);
	}


	void m(){System.out.println("hello m");}  
	void n(){  
		System.out.println("hello n");  
		//m();//same as this.m()  
		m();  
	}  

	public static void main(String args[]){ 

		A a=new A();  
		//a.n();  
	}
}