package cn.zhang.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhang.beans.autowired.Address;
import cn.zhang.beans.autowired.Car;
import cn.zhang.beans.autowired.Person;

public class TestSpringAutowired {

	public ApplicationContext getApplicationContext() {
		return new ClassPathXmlApplicationContext("bean-spel.xml");
	}
	
	@Test
	public void test01() {
		ApplicationContext ctx = getApplicationContext();
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}
	
	@Test
	public void testRelation() {
		ApplicationContext ctx = getApplicationContext();
		Address address = (Address) ctx.getBean("address");
		System.out.println(address);
		address = (Address) ctx.getBean("address2");
		System.out.println(address);
	}
	
	@Test
	public void testScope() {
		ApplicationContext ctx = getApplicationContext();
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
	}
	
	@Test
	public void testSpEl() {
		ApplicationContext ctx = getApplicationContext();
		cn.zhang.beans.spel.Address address = (cn.zhang.beans.spel.Address) ctx.getBean("address");
		System.out.println(address);
		cn.zhang.beans.spel.Car car = (cn.zhang.beans.spel.Car) ctx.getBean("car");
		System.out.println(car);
		cn.zhang.beans.spel.Person person = (cn.zhang.beans.spel.Person) ctx.getBean("person");
		System.out.println(person);
	}
}
