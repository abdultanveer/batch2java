package threads.sync;

public class TestSyncThreads {
	public static void main(String[] args) {
		Table table = new Table();
		
		PrintThread pt1 = new PrintThread(5,table);
		PrintThread pt2 = new PrintThread(100,table);
		
		pt1.start();
		pt2.start();
		
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				table.printTable(50);
			}
		}.start();

	}

}
