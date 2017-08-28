package cn.zhang.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhang.beans.Car;
import cn.zhang.beans.HelloWorld;
import cn.zhang.beans.Person;

public class TestSpring01 {

	public ApplicationContext getApplicationContext() {
		return new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void test04() {
		ApplicationContext ctx = getApplicationContext();
		cn.zhang.beans.collection.Person person = (cn.zhang.beans.collection.Person) ctx.getBean("person3");
		System.out.println(person);
	}
	
	@Test
	public void test03() {
		ApplicationContext ctx = getApplicationContext();
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		person = (Person) ctx.getBean("person2");
		System.out.println(person);
	}
	
	/**
	 * 简单的测试Spring的使用
	 */
	@Test
	public void test01() {
		ApplicationContext ctx = getApplicationContext();
		HelloWorld hello = (HelloWorld) ctx.getBean("helloWorld");
		hello.hello();
	}
	
	@Test
	public void test02() {
		ApplicationContext ctx = getApplicationContext();
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		car = (Car) ctx.getBean("car2");
		System.out.println(car);
	}
}
