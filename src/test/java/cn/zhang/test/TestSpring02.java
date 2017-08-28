package cn.zhang.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhang.beans.collection.DataSource;
import cn.zhang.beans.collection.NewPerson;
import cn.zhang.beans.collection.Person;

public class TestSpring02 {

	public ApplicationContext getApplicationContext() {
		return new ClassPathXmlApplicationContext("applicationContext2.xml");
	}
	
	@Test
	public void test01() {
		ApplicationContext ctx = getApplicationContext();
		Person person = (Person) ctx.getBean("person3");
		System.out.println(person);
	}
	
	@Test
	public void test02() {
		ApplicationContext ctx = getApplicationContext();
		NewPerson person = (NewPerson) ctx.getBean("newPerson");
		System.out.println(person);
	}
	
	@Test
	public void test03() {
		ApplicationContext ctx = getApplicationContext();
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource);
	}
	
	@Test
	public void test04() {
		ApplicationContext ctx = getApplicationContext();
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}
	
}
