package week9.examples;

public abstract class Shape {
	private String name;

	
	public Shape() {
		super();
	}

	public Shape(String name) {
		super();
		this.name = name;
	}

	public abstract double computeArea();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Area:"+ computeArea();
	}
	

}
