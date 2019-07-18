package threads;

public class DbThread implements Runnable{

	@Override
	public void run() {
		System.out.println("looking up data from db");
	}

}
