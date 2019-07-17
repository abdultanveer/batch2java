package abstraction;

public class MyatsApp {
	
	public static void main(String[] args) {
		IDrive iDrive = new AlfredsDriverlessCar();
		iDrive.driveCar();
		iDrive.stopCar();
	}

}
