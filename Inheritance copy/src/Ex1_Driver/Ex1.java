/*
 * 		The Ex1_Driver class is in a different package. 
 * 
 * 		Therefore we need to import the parent Vehicle class, 
 * 		and the child Bus class to use them both within the driver. 
 * 
 * */
package Ex1_Driver;
import Ex1.Bus; 
import Ex1.Vehicle; 

public class Ex1 {
	
	public static void main (String [] args) {
	
		
		// Using parent vehicle class
		Vehicle v1 = new Vehicle();
		System.out.println(v1);

		Vehicle v2 = new Vehicle(2, 20000);
		System.out.println(v2);

		// Using child Bus class
		Bus b1 = new Bus();
		System.out.println(b1);

		Bus b2 = new Bus(40, 30000, 3);
		System.out.println(b2);
		
		Bus b3 = new Bus(b2); 
		System.out.println(b3);
		
		b3.showInfo();



		
		
		
		
		
		
		
		
		// end of main method
	}
	
}
