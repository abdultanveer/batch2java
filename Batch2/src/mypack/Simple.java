package mypack;

import mypackage.Country;
import mypackage.Student;

public class Simple{  
	public static String TAG = Simple.class.getSimpleName();
	
	public static void main(String args[]){  
		System.out.println("Welcome to package"); 
		
		
		Student student = new Student("abdul",1000f,123,12,321);
		System.out.println(student.toString());
		
		student = null;
		System.gc();
	}  
}