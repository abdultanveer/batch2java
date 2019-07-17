package inheritance;

public class Son extends Father {
	
	@Override     
	public void eat() {
		super.eat();
		System.out.println("eats abnormally");
	}

}
