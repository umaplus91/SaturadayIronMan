package AbstractDemo;

public abstract class Place {
	private String name;
	private String city;
	private double capacity;

	public Place(String name, String city, double capacity) {
		this.name = name;
		this.city = city;
		this.capacity = capacity;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	
	public abstract void getInfo();
	

}

