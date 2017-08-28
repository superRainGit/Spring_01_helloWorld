package cn.zhang.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhang.beans.factory.Car;

public class TestSpringFactory {

	public ApplicationContext getApplicationContext() {
		return new ClassPathXmlApplicationContext("bean-factory.xml");
	}
	
	@Test
	public void testStaticFactory() {
		ApplicationContext ctx = getApplicationContext();
		Car car = (Car) ctx.getBean("car1");
		System.out.println(car);
	}
	
	@Test
	public void testInstanceFactory() {
		ApplicationContext ctx = getApplicationContext();
		Car car2 = (Car) ctx.getBean("car2");
		System.out.println(car2);
	}
	
	@Test
	public void testFactoryBean() {
		ApplicationContext ctx = getApplicationContext();
		Car car3 = (Car) ctx.getBean("car3");
		System.out.println(car3);
	}
}
