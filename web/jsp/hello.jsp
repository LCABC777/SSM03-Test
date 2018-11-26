<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/SSM03-Test/select">
		<input type="submit" value="查询"/>
	</form>
	<table border="1px">
		<tr>
			<td>用户名</td>
			<td>密码</td>
		</tr>
		<c:forEach items="${lu}" var="u">
			<tr>
				<td>${u.name}</td>
				<td>${u.pwd}</td>
			</tr>
		</c:forEach>
	</table>
	<form action="/SSM03-Test/insert">
		<input type="text"  name="name"/>用户名
		<input type="password" name="pwd"/>密码
		<button type="submit">增加</button>
	</form>
	
	<form action="/SSM03-Test/update">
		<input type="text"  name="name"/>用户名
		<input type="password" name="pwd"/>密码
		<button type="submit">修改</button>
	</form>
	
	<form action="/SSM03-Test/delete">
		<input type="text"  name="name"/>用户名
		<button type="submit">删除</button>
	</form>
</body>
</html>