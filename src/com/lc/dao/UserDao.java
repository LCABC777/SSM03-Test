package com.lc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lc.pojo.User;

public interface UserDao {
	@Select("select * from user")
	List<User> selAll();
	
	
	@Insert("insert into user values(default,#{0},#{1})")
	int insUser(String name, String pwd);
	
	@Update("update user set pwd=#{1} where name=#{0}")
	int updUser(String name, String pwd);
	
	@Delete("delete from user where name=#{0}")
	int delUser(String name);
}
