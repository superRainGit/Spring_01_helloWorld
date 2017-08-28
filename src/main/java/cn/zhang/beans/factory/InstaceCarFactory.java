package cn.zhang.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用实例工厂方式来进行bean的创建
 * 
 * @author zhang
 *
 */
public class InstaceCarFactory {

	private Map<String, Car> cars = new HashMap<>();

	public InstaceCarFactory() {
		cars.put("Audi", new Car("Audi", 350000));
		cars.put("Bmw", new Car("Bmw", 450000));
		cars.put("Ford", new Car("Ford", 350000));
	}
	
	public Car getCar(String brand) {
		return cars.get(brand);
	}
}
