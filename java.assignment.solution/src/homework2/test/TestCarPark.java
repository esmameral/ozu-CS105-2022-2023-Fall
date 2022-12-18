package homework2.test;

import homework2.Car;
import homework2.CarPark;
import homework2.Motorcycle;
import homework2.Person;

public class TestCarPark {

	public static void main(String[] args) {
		CarPark carPark = new CarPark("Star Park", 5);
		Car car1 = new Car("34 EYY 62", "Medium", "Automatic", "Honda", "Civic", "2020", 5);
		Car car2 = new Car("34 H 6287", "Small", "Manuel", "Honda", "Jazz", "2019", 5);
		Car car3 = new Car("06 AB 87", "Medium", "Automatic", "Toyota", "Corolla", "2021", 5);
		Car car4 = new Car("16 CK 28", "Large", "Automatic", "Peugeot", "301", "2022", 5);
		Motorcycle motor1 = new Motorcycle("34 KK 71", "Standard", "Manual", "Honda", "CBF 150", "2018", "Scooter");
		Motorcycle motor2 = new Motorcycle("34 ABC 51", "Adventure", "Manual", "BMW", "R120GS ADV", "2022",
				"Motorcycle");
		System.out.println("park status:"+carPark.parkVehicle(car1));
		System.out.println("park status:"+carPark.parkVehicle(car2));
		System.out.println("park status:"+carPark.parkVehicle(car3));
		System.out.println("park status:"+carPark.parkVehicle(motor1));
		System.out.println("park status:"+carPark.parkVehicle(motor2));
		System.out.println("park status:"+carPark.parkVehicle(car4));
		
		Person person1=new Person("Esma Meral","123456");
		Person person2=new Person("Sema Demir","938767");
		Person person3=new Person("Ahmet Karaca","983011");
		
		carPark.makeReservation(car1, person1, 5);
		carPark.makeReservation(car2, person2, 10);
		carPark.makeReservation(motor1, person3, 4);
		
		System.out.println("Total Amount="+carPark.computeTotalAmount());
		System.out.println("--------- RENTED VEHICLES ---------");
		carPark.printRentedVehicles();

	}

}
