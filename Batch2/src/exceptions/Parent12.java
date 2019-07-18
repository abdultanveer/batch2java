package exceptions;
import java.io.*;  
class Parent12{  
	void msg(){System.out.println("parent");}  
}  

class TestExceptionChild extends Parent12{  
	void msg()throws ArithmeticException{  
		System.out.println("TestExceptionChild");  
	}  
	public static void main(String args[]){  
		Parent12 p=new TestExceptionChild();  
		p.msg();  
	}  
} 