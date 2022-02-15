/*
 * 		Given that the child class Bus is in the same package, we don't need
 * 		to import it, parent attributes are directly accessible.
 * 
 * 		The child class Bus has access to the parent attributes directly.
 * 
 * 		Notice in the constructor, we are able to set the child OWN attributes
 * 		by accessing them directly and setting a given value to them
 * 
 * */

package Ex1;
public class Bus extends Vehicle {

	private int passCapacity;
	
	public Bus() {
		System.out.println("Creating a bus object using default constructor ....");
		
		// sets OWN attributes
		this.numbOfDoors = 2; 	
		this.price = 10000;
		this.passCapacity = 10;
	}
	
	// Parameterized constructor
	public Bus(int passCapacity, int price, int numbOfDoors) {
		System.out.println("Creating a bus object using parametrized constructor ....");
		
		// sets OWN attributes
		this.price = price; 
		this.numbOfDoors = numbOfDoors; 
		this.passCapacity = passCapacity;
	}
	
	
	// Copy constructor
	public Bus(Bus b) {
		System.out.println("Creating a bus object using copy constructor ....");
		// super in this case means nothing, we could do this.price = b.price and get same result
		super.price = b.price; 
		this.numbOfDoors = b.numbOfDoors;
		this.passCapacity = b.passCapacity;	
	}
	
	public int getPassCapacity() {
		return this.passCapacity;
	}

	public void setPassCapacity(int passCapacity) {
		this.passCapacity = passCapacity;
	}
	
	public String toString() {
		return "This Bus has " + this.numbOfDoors + " doors and its price is: " + this.price +
				"$. The passenger capacity of this bus is " + this.passCapacity + " passengers.\n"; 
	}
	
	
	
	public boolean equals(Object x){
		
		System.out.println("The Bus object calls the Bus equals method ....");
		if (x == null || this == null || this.getClass() != x.getClass()) {
			return false;
		}else{
			// cast the passed object to a Vehicle object
			Bus b = (Bus)x;
			return (this.numbOfDoors == b.numbOfDoors && this.price == b.price);
		}
	}
	
	
	
	
	public void showInfo() {
		
		/*
		 * 		Since Bus is in a same package as Vehicle, it is possible 
		 * 		to refer to any vehicle attributes directly using a vehicle 
		 * 		object. 
		 * */
		
		System.out.println("Inside the show info method and created a new vehicle object v1....");
		Vehicle v1 = new Vehicle();
		System.out.print("v1 has " + v1.numbOfDoors + " doors and its price is " + v1.price);
	}
	
	
	// class method 
	public static void showVehicleInfo(Object x) {
		
		if(x instanceof Bus) {
			System.out.println("Object is an instance of Vehicle");
		} else {
			System.out.println("The type of the passed object is unknown; will not display any information ");
		}
	}
	
	
	
		
}
