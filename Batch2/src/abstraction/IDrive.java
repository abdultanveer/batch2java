package abstraction;

import javax.naming.spi.InitialContextFactory;

public interface IDrive  extends ISwitchBoard,InitialContextFactory{//multiple inheritance
	
	public void startCar();
	public void driveCar();
	public void stopCar();
}
