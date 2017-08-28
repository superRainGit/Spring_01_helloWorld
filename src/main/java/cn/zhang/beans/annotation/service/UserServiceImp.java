package cn.zhang.beans.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zhang.beans.annotation.dao.UserDao;

/**
 * @author zhang
 *
 */
@Service("userService")
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public void add() {
		System.out.println("UserServiceImp.add()");
		userDao.save();
	}

}
