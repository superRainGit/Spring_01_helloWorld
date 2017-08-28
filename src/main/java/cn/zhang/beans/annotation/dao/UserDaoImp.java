package cn.zhang.beans.annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.zhang.beans.annotation.TestObject;

@Repository("userDao")
public class UserDaoImp implements UserDao {
	
	@Autowired
	private TestObject to;

	@Override
	public void save() {
		System.out.println("UserDaoImp.save()");
		System.out.println(to);
	}

}
