package cn.zhang.beans.collection;

import java.util.Map;

public class NewPerson {

	private String name;
	private int age;
	private Map<String, Car> car;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Map<String, Car> getCar() {
		return car;
	}

	public void setCar(Map<String, Car> car) {
		this.car = car;
	}

	public NewPerson() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
	}

}
