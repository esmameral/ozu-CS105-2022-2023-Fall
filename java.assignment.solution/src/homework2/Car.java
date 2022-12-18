package homework2;

public class Car extends Vehicle implements Rentable {
	private int seatCount;

	@Override
	public String getVehicleInformation() {
		return getBrand() + ", " + getModel() + ", " + getSeatCount() + " seats";
	}

	public Car() {
		super();
	}

	public Car(String licensePlateNumber, String category, String transmission, String brand, String model,
			String year, int seatCount) {
		super(licensePlateNumber, category, transmission, brand, model, year);
		this.seatCount=seatCount;
	}

	@Override
	public double getDailyPrice() {
		return 200.0;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

}
