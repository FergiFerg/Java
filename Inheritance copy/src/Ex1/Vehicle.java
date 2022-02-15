/*
 * 		Vehicle class, and Bus class are in the same package.
 * 
 * 		Therefore the child class Bus doesn't need to be imported, 
 * 		and has access to the parent class attributes directly. 
 * 
 * 		Directly meaning we can use them in the child class by name
 * 		to set the Bus class OWN attributes. 
 * 
 * */

package Ex1;
public class Vehicle {
	
	protected int numbOfDoors;
	protected double price;
	
	
	// public default constructor
	public Vehicle() {		
		System.out.println("Creating a vehicle object using default constructor ....");
		this.numbOfDoors = 4;
		this.price = 10000;
	}
	
	// public parameterized constructor
	public Vehicle(int numbOfDoors, double price) {		
		System.out.println("Creating a vehicle object using the parameterized constructor ....");
		this.numbOfDoors = numbOfDoors;
		this.price = price;
	}
	
	// public copy constructor
	public Vehicle(Vehicle v) {
		System.out.println("Creating a vehicle object using copy constructor ....");
		this.numbOfDoors = v.numbOfDoors;
		this.price = v.price;			
	}

	
	public int getNumbOfDoors(){
		return this.numbOfDoors;
	}	
	
	public double getPrice(){
		return this.price;
	}	
	
	public void setNumbOfDoors(int numbOfDoors) {
		this.numbOfDoors = numbOfDoors;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "This Vehicle has " + this.numbOfDoors + " doors and it price is " + this.price + "$.\n";	
	}
	

	public boolean equals(Object x){
		
		System.out.println("The Vehicle object calls the Vehicle equals method ....");
		if (x == null || this == null || this.getClass() != x.getClass()) {
			return false;
		}else{
			// cast the passed object to a Vehicle object
			Vehicle v = (Vehicle)x;
			return (this.numbOfDoors == v.numbOfDoors && this.price == v.price);
		}
	}

	

	// class method 
	public static void showVehicleInfo(Object x) {
		
		if(x instanceof Vehicle) {
			System.out.println("Object is an instance of Vehicle");
		} else {
			System.out.println("The type of the passed object is unknown; will not display any information ");
		}
	}
	
	// class method
	public static void classInfo(Object x) {
		System.out.println("The object created is from the " + x.getClass() );
	}

	

}
