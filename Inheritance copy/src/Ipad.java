
public class Ipad extends Macbook{
	
	private int storage;
	
	
	public Ipad() {
		System.out.print("\nCreating a Ipads using the default constructor\n");
		this.storage = 0;
	}
	
	public Ipad(int storage) {
		System.out.print("Creating a Ipad using the parameterized constructor\n");
		this.storage = storage;
	}
	
	public Ipad(Ipad i) {
		this.storage = i.storage;
	}
	
	
	public void setStorage(int storage) {
		this.storage = storage;
	
	}
	
	public int getStorage() {
		return this.storage;
	}
	
	
	public String toString() {
		
		String info = "";
		
		info += "\nBrand: " + this.getBrand() + "\n"; 
		info += "Speed: " + this.getSpeed() +  "\n";
		info += "Model Name: " + this.getBrand()+ "\n"; 
		info += "Price: " + this.getPrice() + "$\n";
		info += "Storage " + this.storage + "\n"; 
		
		return info;
	}
	
	
	
	
	

}
