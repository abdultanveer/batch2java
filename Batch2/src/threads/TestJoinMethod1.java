package threads;
class TestJoinMethod1 extends Thread{  
	public TestJoinMethod1(String threadName) {
		super(threadName);
	}
	public void run(){  
		for(int i=1;i<=5;i++){  
			try{  
				Thread.sleep(500);  
			}catch(Exception e){System.out.println(e);}  
			System.out.println(i+Thread.currentThread().getName());  
		}  
	}  
	public static void main(String args[]){  
		TestJoinMethod1 t1=new TestJoinMethod1("altynay");  
		TestJoinMethod1 t2=new TestJoinMethod1("alfred");  
		TestJoinMethod1 t3=new TestJoinMethod1("myat");  
		t1.start();  
		try{  
			t1.join(1500);  
		}catch(Exception e){System.out.println(e);}  

		t2.start();  
		t3.start();  
	}  
}