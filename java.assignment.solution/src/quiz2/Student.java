package quiz2;

public class Student extends Person {
	private String program;
	private int year;
	private double fee;

	public Student(int id,String name, String program, int year) {
		super(id,name);
		this.program = program;
		this.year = year;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return super.toString()+ " program="+program + ", year=" + year + ", fee=" + fee;
	}

}
