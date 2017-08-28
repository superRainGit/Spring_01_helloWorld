package cn.zhang.beans.factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * 通过使用FactoryBean的方式进行bean的实例化
 * @author zhang
 *
 */
public class CarFactoryBean implements FactoryBean<Car> {

	private String brand;
	private double price;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * 返回将要生成的bean的示例
	 */
	@Override
	public Car getObject() throws Exception {
		return new Car(brand, price);
	}

	/**
	 * 返回实例对应的具体的类型
	 */
	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	/**
	 * 确定bean是否是单实例的
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}

}
