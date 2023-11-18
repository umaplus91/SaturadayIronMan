package OOP;

public class InterfaceImplementation implements Interface {

	@Override
	public void iDoor() {
		System.out.println("my car got 5 doors");
		
	}

	@Override
	public String iEngine() {
		System.out.println("my car got dual motor");
		return "dual motor";
	}

	@Override
	public String iColor() {
		System.out.println("Black");
		return "Black";
	}

	@Override
	public int iSeats() {
		System.out.println("my car got 4 seats");
		return 4;
	}

	@Override
	public boolean iHybrid() {
		System.out.println("my car is hybrid");
		return true;
	}

}
