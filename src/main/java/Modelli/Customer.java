package Modelli;

public class Customer {
	private String name;
	private int points;

	public Customer(String name, int points) {
		super();
		this.name = name;
		this.points = points;
	}

	// Constructor and standard getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}