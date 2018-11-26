package com.lc.pojo;

public class User {
private String name;
private String pwd;
private String uid;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getUid() {
	return uid;
}
public void setUid(String uid) {
	this.uid = uid;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(String name, String pwd, String uid) {
	super();
	this.name = name;
	this.pwd = pwd;
	this.uid = uid;
}

}
