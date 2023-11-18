package AbstractDemo;

public class Court extends Place {
	private String sandype;

	public Court(String name, String city, double capacity, String sandtype) {
		super(name, city, capacity);
		this.sandype = sandtype;

	}

	@Override
	public void getInfo() {
		System.out.println("Arena name: " + getName() + ", Location: " + getCity() + ", Capacity: " + getCapacity()
				+ " people, " + "Groundtype: " + sandype);

	}

}
