package cn.zhang.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhang.beans.annotation.TestObject;
import cn.zhang.beans.annotation.controller.UserController;
import cn.zhang.beans.annotation.dao.UserDao;
import cn.zhang.beans.annotation.service.UserService;

public class TestSpringAnnotation {

	public ApplicationContext getApplicationContext() {
		return new ClassPathXmlApplicationContext("bean-annotation.xml");
	}
	
	/**
	 * 测试简单的使用基于注解方式注册到IOC容器中的bean
	 */
	@Test
	public void test01() {
		ApplicationContext ctx = getApplicationContext();
		TestObject to = (TestObject) ctx.getBean("testObject");
		System.out.println(to);
		UserController uc = (UserController) ctx.getBean("userController");
		System.out.println(uc);
		UserDao ud = (UserDao) ctx.getBean("userDaoImp");
		System.out.println(ud);
		UserService us = (UserService) ctx.getBean("userService");
		System.out.println(us);
	}
	
	@Test
	public void test02() {
		ApplicationContext ctx = getApplicationContext();
		UserController uc = (UserController) ctx.getBean("userController");
		uc.execute();
	}
}
