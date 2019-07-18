package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URLConnection;

public class JavaExceptionExample{  
  public static void main(String args[]){ 
	  
      PrintWriter pw;  
		try {
			pw = new PrintWriter("jtp.txt");
			
			  pw.println("saved");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    
	  
	  
	  try {
		  
		  int data = 100/0;  
	  }
	  catch (ArithmeticException describewhathappened) {
		  System.out.println("hey abdul i faced this"+ describewhathappened.getMessage());
	  }
   //rest code of the program   
   System.out.println("rest of the code...");  
  }  
}