/*
 * 		Overriding the equals method that can take any given object.
 * 
 * 		The equals method take an object of type object:
 * 		if the object is from the same class, and if the object is not null or
 * 		or the passed object is not null, it then down casts it to the appropriate 
 * 		class to compare it will the calling object
 * */

package Ex4_Driver;
import Ex1.Vehicle;
import Ex1.Bus;

public class Ex4 {

	public static void main (String [] args) {
		
		Vehicle v1 = new Vehicle(); 
		System.out.print(v1);
		System.out.println();
		
		Vehicle v2 = new Vehicle(2, 5000); 
		System.out.print(v2);
		System.out.println();
		
		
		// vehicle with vehicle
		if (v1.equals(v2)) {
			System.out.println("The two vehicle objects (v1 & v2) are equal");
		}else {
			System.out.println("The two vehicle objects (v1 & v2) are not equal");
			}

		
		// vehicle with copy vehicle
		System.out.println();
		Vehicle v3 = new Vehicle(v2); 
		System.out.print(v3);
		if (v2.equals(v3)) {
			System.out.println("The two vehicle objects (v2 & v3) are equal");
		}else {
			System.out.println("The two vehicle objects (v2 & v3) are not equal");
			}
		
		// vehicle with bus
		System.out.println();
		Bus b1 = new Bus();
		if (v1.equals(b1)) {
			System.out.println("The two vehicle objects (v1 & b1) are equal");
		}else {
			System.out.println("The two vehicle objects (v1 & b1) are not equal");
			}
		
	
		// bus with vehicle
		System.out.println();
		if (b1.equals(v1)) {
			System.out.println("The two objects (b1 & v1) are equal");
		}else {
			System.out.println("The two objects (b1 & v1) are not equal");
			}
		
		
		// bus with copy bus
		System.out.println();
		Bus b2 = new Bus(b1);		
		if (b1.equals(b2)) {
			System.out.println("The two Bus objects (b1 & b2) are equal");
		}else {
			System.out.print("The two Bus objects (b1 & b2) are not equal");
			}
		
		// end of main method
	}

}
