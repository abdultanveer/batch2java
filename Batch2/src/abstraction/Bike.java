package abstraction;
abstract class Bike{  //50% abstraction
	abstract void run();  

	public void startBike() {
		System.out.println("bike started");
	}

}  
class Honda4 extends Bike{ //concrete class 
	void run(){
		System.out.println("running safely");
	}  
	
	@Override
		public void startBike() {
			// TODO Auto-generated method stub
			super.startBike();
		}
	
}	
	
	class splendor extends Honda4{
		@Override
		void run() {
			//super.run();
		}
	
	public static void main(String args[]){  
		Bike obj = new Honda4();  
		obj.run();  
	}  
}