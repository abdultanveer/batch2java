package abstraction;

public class HavellsAppliances implements ISwitchBoard{

	@Override
	public void switchOnLight() {
		System.out.println("havells light is on");
	}

	@Override
	public void switchOnFan() {
		System.out.println("havells fan is on");
		
	}

	@Override
	public void switchOnAC() {
		System.out.println("havells AC is on");
		
	}

}
