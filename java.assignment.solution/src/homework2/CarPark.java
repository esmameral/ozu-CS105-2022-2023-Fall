package homework2;

import java.util.ArrayList;
import java.util.List;

public class CarPark {
	private String name;
	private int capacity;
	private List<Vehicle> parkedVehicles = new ArrayList<>();
	private List<Reservation> reservations = new ArrayList<>();

	public boolean parkVehicle(Vehicle vehicle) {
		if(getParkedVehicles().size()!=capacity) {
			getParkedVehicles().add(vehicle);
			return true;
		}
		return false;
	}
	public void makeReservation(Rentable rentable, Person person, int dayCount) {
		Reservation reservation=new Reservation(person, rentable, dayCount);
		getReservations().add(reservation);
	}

	public double computeTotalAmount() {
		double total=0;
		for (Reservation res : reservations) {
			total+=res.getDayCount()*res.getRentedVehicle().getDailyPrice();
		}
		return total;
	}
	public void printRentedVehicles() {
		for (Reservation reservation : reservations) {
			System.out.println(reservation);
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<Vehicle> getParkedVehicles() {
		return parkedVehicles;
	}

	public void setParkedVehicles(List<Vehicle> parkedVehicles) {
		this.parkedVehicles = parkedVehicles;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public CarPark() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarPark(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}

}
