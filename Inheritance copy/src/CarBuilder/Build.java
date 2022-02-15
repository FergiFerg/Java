package CarBuilder;

import Ex1.Vehicle;

public class Build {

	public static void main(String[] args) {

		Vehicle car1 = new Vehicle(3, 69.00);
		System.out.println(car1.getPrice());
		System.out.println(car1.getNumbOfDoors());

	}

}
