package cn.zhang.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 通过静态方法的方式去创建对应的bean
 *
 */
public class StaticCarFactory {

	private static Map<String, Car> cars = new HashMap<>();
	
	static {
		cars.put("Audi", new Car("Audi", 350000));
		cars.put("Bmw", new Car("Bmw", 450000));
		cars.put("Ford", new Car("Ford", 350000));
	}
	
	public static Car getCar(String brand) {
		return cars.get(brand);
	}
}
