<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>用户ID</td>
			<td>用户名称</td>
			<td>用户昵称</td>
			<td>用户所在组</td>
			<td>用户注册日期</td>
			<td>是否被封禁</td>
		</tr>
		<tr>
			<td>${user.u_id}</td>
			<td>${user.u_name}</td>
			<td>${user.u_nick}</td>
			<td>${user.u_group}</td>
			<td>${user.u_reg_date}</td>
			<td>${user.u_banned}</td>
		</tr>
	</table>
</body>
</html>