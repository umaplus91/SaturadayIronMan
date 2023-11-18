package AbstractDemo;

public class Stadium extends Place {
	//private String grasstype;

	public Stadium(String name, String city, double capacity) {
		super(name, city, capacity);
		//this.grasstype = grassype;

	}

	@Override
	public void getInfo() {
			System.out.println("Arena name: " + getName() + ", Location: " + getCity() + ", Capacity: "
					+ getCapacity() + " people, " + "Groundtype: " + getGroundtype());

	}
	//Encapsulated for main one
	public String getGroundtype() {
		return "Artifical Grass";
	}

}
 