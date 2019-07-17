package mypackage;
class OverloadingCalculation3{  
	void sum(int a,int b){System.out.println("a method invoked");}  
	void sum(long a,long b){System.out.println("b method invoked");}  

	public static void main(String args[]){  
		OverloadingCalculation3 obj=new OverloadingCalculation3();  
		obj.sum(20,20);//now ambiguity  
		
		float pi = 3.14f; //8bytes
		int pie = (int)pi;    //4bytes -- 3
		System.out.println("pi="+pi);
		System.out.println("pie="+pie);

		
	}  
}