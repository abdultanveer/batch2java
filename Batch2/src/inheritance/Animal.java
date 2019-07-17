package inheritance;
public class Animal{  
	public Animal() {
		System.out.println("animal created");
	}
	void eat(){System.out.println("eating...");
	}  
	
	
	public static void main(String args[]){  
		Dog d=new Dog();  
		//d.work();  
	}
}  
class Dog extends Animal{ 
	public Dog() {
		super();
		System.out.println("dog created");
	}
	void eat(){System.out.println("eating bread...");}  
	void bark(){System.out.println("barking...");}  
	void work(){  
		eat();  
		bark();  
	}  

	
}