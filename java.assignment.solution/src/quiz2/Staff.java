package quiz2;

public class Staff extends Person {
	
	private double salary;

	public Staff(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + " salary=" + salary ;
	}
}
