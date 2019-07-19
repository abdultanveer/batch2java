package threads.sync;

public class PrintThread extends Thread {
	int n;
	Table table;
	
	
	public PrintThread(int n,Table table) {
		this.n = n;
		this.table = table;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		table.printTable(n);
	}

}
