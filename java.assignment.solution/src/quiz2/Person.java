package quiz2;

public class Person {
	private int id;
	private String name;
	private String address;
	public Person(int id, String name) {
		super();
		this.id=id;
		this.name = name;
		this.address="ISTANBUL";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "I am " + name + " from " + address +" My Info: ID="+id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
