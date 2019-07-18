package threads;

public class TestThreads {
	
	public static void main(String[] args) {
		PrintThread pThread = new PrintThread();
		
		DbThread db = new DbThread();
		
		Thread dbThread = new Thread(db);
		dbThread.start();
		pThread.start();

		
	}

}
