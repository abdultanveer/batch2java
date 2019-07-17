package abstraction;

public class Wiring {

	public static void main(String[] args) {
		ISwitchBoard switchBoard = new GEAppliances();
				//new HavellsAppliances(); //wiring switches to appliances
		
		switchBoard.switchOnAC();
		switchBoard.switchOnFan();
		switchBoard.switchOnLight();
	}

}
