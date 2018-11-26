package com.lc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lc.dao.UserDao;
import com.lc.pojo.User;
import com.lc.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public List<User> selAll() {
		return userDao.selAll();
	}

	@Override
	public int insUser(String name,String pwd){
		return userDao.insUser(name,pwd);
	}

	@Override
	public int updUser(String name,String pwd) {
		return userDao.updUser(name,pwd);
	}

	@Override
	public int delUser(String name) {
		return userDao.delUser(name);
	}

}
