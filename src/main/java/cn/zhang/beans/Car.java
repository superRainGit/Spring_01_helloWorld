package cn.zhang.beans;

public class Car {

	private String name;
	private String factory;
	private double price;
	private int maxSpeed;

	public Car(String name, String factory, double price) {
		super();
		this.name = name;
		this.factory = factory;
		this.price = price;
	}

	public Car(String name, String factory, int maxSpeed) {
		super();
		this.name = name;
		this.factory = factory;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", factory=" + factory + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

}
