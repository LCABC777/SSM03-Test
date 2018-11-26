package com.lc.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.pojo.User;
import com.lc.service.impl.UserServiceImpl;

@Controller
public class UserController {
@Autowired
private UserServiceImpl userServiceImpl;
	@RequestMapping("/select")
	public String selAll(Model m){
		List<User> lu=userServiceImpl.selAll();
		m.addAttribute("lu", lu);
		return "forward:jsp/hello.jsp";
	}
	@RequestMapping("/update")
	public void updUser(String name,String pwd,HttpServletResponse resp){
		int upd=userServiceImpl.updUser(name, pwd);
		System.out.println("更新了"+upd);
	}
	@RequestMapping("/insert")
	public void insUser(String name,String pwd,HttpServletResponse resp){
		int ins=userServiceImpl.insUser(name, pwd);
		System.out.println("插入了"+ins);
	}
	@RequestMapping("/delete")
	public void delUser(String name,HttpServletResponse resp){
		int del=userServiceImpl.delUser(name);
		System.out.println("删除了"+del);
	}
}
