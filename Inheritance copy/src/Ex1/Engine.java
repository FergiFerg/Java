package Ex1;

public class Engine {

	protected int cylinders;
	protected double price;
	protected boolean turbo;

	public Engine() {
		this.cylinders = 4;
		this.price = 420;
		this.turbo = false;
	}

	public Engine(int cylinders, double price, boolean turbo) {
		if (cylinders < 4) {
			cylinders = 4;
		}
		this.cylinders = cylinders;
		this.price = price;
		this.turbo = turbo;

	}

	public int getCylinders() {
		return this.cylinders;
	}

	public void setCylinders(int cylinders) {
		if (cylinders < 4) {
			cylinders = 4;
		}
		this.cylinders = cylinders;
	}

	public double getPrice() {
		return this.price;
	}

	public String getTurbo() {
		String turboResponse = null;
		if (this.turbo == true) {
			turboResponse = "has a turbo";
		} else {
			turboResponse = "doesn't have a turbo";
		}

		return turboResponse;
	}

	public static void engineInfo(Object x) {
		System.out.println("The object created is form the " + x.getClass());
	}

	public static void showEngineInfo(Object e) {

		System.out.print("Engine has " + ((Engine) e).getCylinders() + " cylinders and its price is "
				+ ((Engine) e).getPrice() + " and " + ((Engine) e).getTurbo());

	}

}
