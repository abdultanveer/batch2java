package abstraction;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;

public class AlfredsDriverlessCar implements IDrive {
	@Override
	public void startCar() {
		System.out.println("car has started");
	}
	
	@Override
	public void driveCar() {
		System.out.println("car is driving");
	}
	
	@Override
	public void stopCar() {
		System.out.println("car has stopped");
	}

	@Override
	public void switchOnLight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchOnFan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchOnAC() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Context getInitialContext(Hashtable<?, ?> environment) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

}
