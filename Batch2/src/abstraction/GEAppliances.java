package abstraction;

public class GEAppliances implements ISwitchBoard {
	

	@Override
	public void switchOnLight() {
		System.out.println("GE light is on");
		
	}

	@Override
	public void switchOnFan() {
		System.out.println("GE fan is on");
		
	}

	@Override
	public void switchOnAC() {
		System.out.println("GE AC is on");
		
	}

}
