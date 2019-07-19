package threads.sync;


/**
 * this class represents a table object
 * @author Admin
 *
 */
public class Table {
	/**
	 * this will print a table multiplied with n 14 times
	 * @param n
	 */
	synchronized public  void printTable(int n) {
		for(int i=1; i<15;i++) {
			System.out.println(i*n);
		}
	}

}
