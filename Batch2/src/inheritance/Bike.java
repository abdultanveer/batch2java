package inheritance;
 class Bike{ 
	int speed = 90;
   void run(){
	   speed = 400;
	   System.out.println("running");}  
}  
     
class Honda extends Bike{  
   void run(){System.out.println("running safely with 100kmph");}  
     
   public static void main(String args[]){  
   Honda honda= new Honda();  
   honda.run();  
   }  
}