package cn.zhang.beans.spel;

public class Car {

	private String name;
	private double price;
	private double tyrePremeter;

	public double getTyrePremeter() {
		return tyrePremeter;
	}

	public void setTyrePremeter(double tyrePremeter) {
		this.tyrePremeter = tyrePremeter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", tyrePremeter=" + tyrePremeter + "]";
	}

}
