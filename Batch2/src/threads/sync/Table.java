package threads.sync;

public class Table {
	
	synchronized public  void printTable(int n) {
		for(int i=1; i<15;i++) {
			System.out.println(i*n);
		}
	}

}
