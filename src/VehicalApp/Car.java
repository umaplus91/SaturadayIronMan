package VehicalApp;

public class Car extends Vehicle {

	private int wheels;
	private String type;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;

	public Car(String name, int wheels, String type, int doors, int gears, boolean isManual) {
		super(name);
		this.type = type;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.wheels = wheels;
		currentGear = 1;

	}
	
	public void changeGear(int newGear) {
		this.currentGear = newGear;
		System.out.println("changeGear method called: Change to " + this.currentGear + "gear");
	}
	
	public void changeSpeed(int newSpeed, int newDirection) {
		move(newSpeed, newDirection);
		System.out.println("changeSpeed method called: Speed ->" + newSpeed + "direction" + newDirection);
	}
	
}
