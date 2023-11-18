package OOP;

public class AbstractClassImplementation extends AbstractClass {

	@Override
	public void iDoor() {
		System.out.println("My car has 2 doors");
		
	}

	@Override
	public String iEngine() {
		System.out.println("one dual motor");
		return null;
	}

	@Override
	public String iColor() {
		System.out.println("My car is white");
		return "white";
	}

	@Override
	public boolean iHybrid() {
		System.out.println("My cars is not hybrid");
		return false;
	}

	@Override
	public int iSeats() {
		System.out.println("My car has 4 seats");
		return 4;
	}

}
