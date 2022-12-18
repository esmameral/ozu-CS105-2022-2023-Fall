package homework2;

public class Reservation {
	private String reservationNumber;
	private Person person;
	private Rentable rentedVehicle;
	private int dayCount;

	public String getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(String reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Rentable getRentedVehicle() {
		return rentedVehicle;
	}

	public void setRentedVehicle(Rentable rentedVehicle) {
		this.rentedVehicle = rentedVehicle;
	}

	public int getDayCount() {
		return dayCount;
	}

	public void setDayCount(int dayCount) {
		this.dayCount = dayCount;
	}

	public Reservation() {
		super();
		this.reservationNumber=(int) (Math.random() * 90000000) + 10000000+"";
	}

	public Reservation(Person person, Rentable rentedVehicle, int dayCount) {
		this();
		
		this.person = person;
		this.rentedVehicle = rentedVehicle;
		this.dayCount = dayCount;
	}

	@Override
	public String toString() {
		String vehicleInfo=((Vehicle)rentedVehicle).getVehicleInformation();
		return "Res:[" + reservationNumber +","+dayCount+" days]"+ ", Driver:[" + person.getName() + 
				
				"], Vehicle:["+vehicleInfo+"]" ;
	}

}
