
/*
 * 		Using the instanceOf method to check if 
 * 		an object is an instance of a specific class.
 * 
 * 		Child object are always instances of themselves, and 
 * 		instances of their parent, and ancestor classes.
 * 
 * 		The book class is not an instance of the Vehicle class, 
 * 		nor is it an instance of the Bus class.
 * 		
 * */

package Ex3_Driver;
import Ex1.Vehicle;
import Ex1.Bus;
import Ex3.Book;

public class Ex3 {
	
	public static void main (String [] args) {
		
		Vehicle v1 = new Vehicle(); 
		Vehicle.classInfo(v1);				// get class
		System.out.print(v1);
		Vehicle.showVehicleInfo(v1);		// instance of Vehicle
		System.out.println();

		Bus b1 = new Bus();
		Vehicle.classInfo(b1);
		System.out.print(b1);
		Vehicle.showVehicleInfo(b1);		// instance of Bus

		System.out.println();
		Book bk1 = new Book();
		Vehicle.showVehicleInfo(bk1);		// not an instance of Vehicle
		Bus.showVehicleInfo(bk1);			// not an instance of Bus		
		Vehicle.classInfo(bk1);				
	
		// end of main method
	}

}
