package exceptions;
public class TestExceptionPropagation1{  
	void m(){ 
		System.out.println("m called");

		int data=50/0;  
	}  
	void n(){  
		System.out.println("n called");

		m();  
	}  
	void p(){
		System.out.println("p called");
			n();  
	}  
	public static void main(String args[]){  
		TestExceptionPropagation1 obj=new TestExceptionPropagation1();  
		obj.p();  
		System.out.println("normal flow...");  
	}  
}  