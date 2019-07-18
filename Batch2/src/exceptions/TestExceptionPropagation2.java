package exceptions;

import java.io.IOException;

class TestExceptionPropagation2{  
	
	void m() throws IOException{  
		throw new java.io.IOException("device error");//checked exception  
	}  
	void n() throws IOException{  
		//m();  
		m();
	}  
	void p(){  
			try {
				n();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	}  
	public static void main(String args[]){  
		TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
		obj.p();  
		System.out.println("normal flow");  
	}  
}  
