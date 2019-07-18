package exceptions;
public class Excep6{  
	public static void main(String args[]){  
		try{  
			try{  
				int c = add(10,20);
				System.out.println("going to divide");  
				c= c+20;
				int b =39/0;  
			}catch(ArithmeticException e){
				System.out.println(e);
				}  

			try{  
				int a[]=new int[5];  
				a[5]=4;  
			}catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  

			System.out.println("other statement");  
		}catch(Exception e){System.out.println("handeled");}  

		System.out.println("normal flow..");  
	}

	private static int add(int i, int j) {
		return i+j;
	}  
}  