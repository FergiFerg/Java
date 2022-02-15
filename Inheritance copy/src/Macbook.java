
public class Macbook extends Computer {

	
	private String mbName;
	private double price; 

	
	public Macbook() {
		System.out.print("\nCreating a Macbook using the default constructor\n");
		this.mbName = null; 
		this.price = 0.0;
	}
	
	
	public Macbook(String mbName) {
		this.mbName = mbName;
	}
	
	// uses the this(parameter) constructor
	public Macbook(String mbName, double price) {
		this(mbName);
		this.price = price;
		System.out.print("\nCreating a Macbook using the this() parametrized constructor ");

	}
	
	
	public Macbook(String brand, double speed, String mbName, double price) {
		super(brand, speed);
		this.mbName = mbName;
		this.price = price;
		System.out.print("\nCreating a Macbook using the super() parametrized constructor ");

	}
	
	
	public Macbook(Macbook m) {
		this.mbName = m.mbName;
		this.price = m.price;
	}
	
	public void setMbName(String mbName) {
		this.mbName = mbName;
	}
	
	
	public void setPrice(double price) {
		this.price = price;
	}
	
//	// overrides parent set price method
//	public void setSpeed(double speed) {
//		
//		super.setSpeed(speed);	
//	}
//	
//	
	
	// overloads private father method
	public void setSpeed(){
		
		double speed = 0.0;
		setSpeed(speed);
	}
	
	
	
	public String getMbName() {
		return this.mbName;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	
	public String toString() {
		
		
		String info = "";
		
		info += "\nBrand: " + this.getBrand() + "\n"; 
		info += "Speed: " + this.getSpeed() +  "\n";
		info += "Model Name: " + this.mbName + "\n"; 
		info += "Price: " + this.price + "$\n";
		
		return info;
		
	}
	
	
	
	
	
	
	
	
}
