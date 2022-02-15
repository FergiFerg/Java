/*
 * 		The child class Bus is in a different package. 
 * 
 * 		Therefore to have access to the parent class attributes directly, 
 * 		we need to import the parent class Vehicle from package Ex1.
 * 
 * 		We can then use the attributes directly to set the child OWN attributes.
 * */

package Ex2;
import Ex1.Vehicle;
public class Bus extends Vehicle {

	private int passCapacity;
	
	public Bus() {	
		// Call to the parent default constructor
		super();
		this.passCapacity = 10;
		System.out.println("Creating a bus object using default constructor using call to super default....");
	}
	
	// Parameterized constructor
	public Bus(int passCapacity, int price, int numbOfDoors) {	
		// Call to the parent parameterized constructor
		super(price,numbOfDoors);
		this.passCapacity = passCapacity;
		System.out.println("Creating a bus object using parametrized constructor using call to super parameterized....");
	}
	
	
	// Copy constructor
	public Bus(Bus b) {
		System.out.println("Creating a bus object using copy constructor with no super call....");
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
	
	
	public void showInfo() {
		/*
		 * 		Since Bus is in a different package than Vehicle, it is not possible 
		 * 		to refer to any vehicle attributes directly using a vehicle 
		 * 		object
		 * */
		
		// Vehicle v1 = new Vehicle();
		// v1.numbOfDoors;
		
		/*
		 * 		A Bus object can refer to the protected attributes of 
		 * 		the parent class Vehicle directly within its
		 * 		own class
		 * */
		
		System.out.println("Inside the show info method and created a new object b1....");
		Bus b1 = new Bus(60, 3, 74000);
		
		System.out.print("b1 has " + b1.numbOfDoors + " doors and its price is " + b1.price);
		System.out.print(" and passenger capacity is " + b1.passCapacity + " passengers");
	}
	
	
}
