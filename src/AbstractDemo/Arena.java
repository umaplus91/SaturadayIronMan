package AbstractDemo;

public class Arena extends Place {
	private String groundtype;

	public Arena(String name, String city, double capacity, String groundtype) {
		super(name, city, capacity);
		this.groundtype = groundtype;

	}

	@Override
	public void getInfo() {
		System.out.println("Arena name: " + getName() + ", Location: " + getCity() + ", Capacity: "
				+ getCapacity() + " people, " + "Groundtype: " + groundtype);

	}

}
