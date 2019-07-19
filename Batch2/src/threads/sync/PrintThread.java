package threads.sync;

public class PrintThread extends Thread {
	/**
	 * this variable will be multiplied
	 */
	int n;
	Table table;
	
	/**
	 * constructor to create a thread object
	 * @param n variable to be multipled
	 * @param table is a shared object
	 */
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
