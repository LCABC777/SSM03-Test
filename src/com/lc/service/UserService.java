package com.lc.service;

import java.util.List;

import com.lc.pojo.User;

public interface UserService {
	List<User> selAll();
	
	int insUser(String name, String pwd);
	
	int updUser(String name, String pwd);
	
	int delUser(String name);
}
