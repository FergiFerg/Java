
public class Driver1 {

	/*
	 * 		Uses the computer class
	 * 
	 * 
	 * */
	
	
	public static void main (String [] args) {
		
		
		Computer c = new Computer("Apple", 4.1);		
		System.out.print(c);
		
		// new line
		System.out.println();

		Macbook m = new Macbook();		
		// display info
		System.out.print(m);
		
		
		// overrides the parent set speed method
		m.setSpeed(1.1);
		
//		// new line
//		System.out.println();
//
//		// overriding the parent method
//		System.out.print(m);

		
		// child has access to the parents methods, change using parent
		m.setBrand("Apple");
		
//		// new line
//		System.out.println();
//
//		// Displays with overriding the parent method
//		System.out.print(m);
		
		
		// displays after parent method access
		System.out.println();
		System.out.print(m);
		
		//new line
		System.out.println();
		
		// change attribute using child method
		m.setMbName("Macbook Pro");
		
		// overloads the private method
		m.setSpeed();
		System.out.print(m);
		
		// new line
		System.out.println();

		
		Macbook m2 = new Macbook("Apple", 4.7, "Macbook Air", 1500);		
		System.out.print(m2);

		
		// new line
		System.out.println();

		//	
		Macbook m3 = new Macbook("Macbook Pro", 1);
		System.out.print(m3);

		
		// new line
		System.out.println();

		
		Ipad p = new Ipad(256);
		System.out.print(p);
		
		
		// new line
		System.out.println();

		// method for any computer object displays info
		showComputerInfo(p);
		
		
		
	}
	
	// class method
	public static void showComputerInfo(Computer c) {
		System.out.print("Here is the information for the given computer:\n");
		System.out.print(c);
	}
	
}
