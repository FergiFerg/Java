/*
 * 		The Ex2_Driver class is in a different package. 
 * 
 * 		Therefore we need to import the Ex2.Bus class to be able
 * 		to use it in the driver. 
 * 
 * 		Notice that the bus class is the only one being imported,
 * 		therefore we only have access to the child class Bus,
 * 		we cannot create object of the parent class. 
 * 
 * 		However, because the child class bus is in a different package, 
 * 		we need to import the parent class vehicle into the child class Bus.
 * 
 * 		This does not give us access to create parent Vehicle objects, we would 
 * 		need to import the Ex1.Vehicle class
 * */

// import Ex1.Vehicle;

package Ex2_Driver;
import Ex2.Bus; 

public class Ex2 {
	
	public static void main (String [] args) {
	
		Bus b1 = new Bus();
		System.out.println(b1);
		
		Bus b2 = new Bus(20, 3, 25000);
		System.out.println(b2);
		
		Bus b3 = new Bus(b2);
		System.out.println(b3);
		
		
		b3.showInfo();
		
		// end of main method
	}
}
