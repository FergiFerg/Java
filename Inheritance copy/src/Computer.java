
public class Computer {
	
	private String brand;
	private double speed;

	
	/*
	 * 			If a parent class has no default constructor 
	 * 			Java will create one and set the attributes to default types
	 * 
	 * 			If it already has a parameterized constructor 
	 * 			Java will not create a default, runtime error.
	 * 
	 * 
	 * 
	 * */
	
	public Computer() {
		System.out.print("Creating a Computer using the default constructor");
		this.brand = null;
		this.speed = 0;
	}
	
	
	public Computer(String brand, double speed) {
		System.out.print("Creating a computer using the parametrized constructor ");
		this.brand = brand;
		this.speed = speed;
	}
	
	
	public Computer(Computer c) {
		this.brand = c.brand;
		this.speed = c.speed;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	final public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	
//	public void setSpeed(double speed) {
//		this.speed = speed;
//	}

	
	public String getBrand() {
		return this.brand;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	
	
	public String toString() {
		
		String info = "";
		
		info += "Brand name: " + this.brand + "\n";
		info += "Processor Speed: " + this.speed + " Ghz.\n";

		return info;
	}
	
	
	// class method
	public static void showComputerInfo(Computer c) {
		System.out.print("Here is the information for the given computer:\n");
		System.out.print(c);
	}
	
	
	
	
	
	
	
	
	
	
	
}




