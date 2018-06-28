<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.iteamcn.baichengnews.util.PageInfo"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr><td>用户ID</td><td>用户名称</td><td>用户昵称</td><td>用户所在组</td><td>用户注册日期</td><td>是否被封禁</td></tr>
		<c:forEach items="${list}" var="user">
			<tr>
				<td>${user.u_id}</td>
				<td>${user.u_name}</td>
				<td>${user.u_nick}</td>
				<td>${user.u_group}</td>
				<td>${user.u_reg_date}</td>
				<td>${user.u_banned}</td>
			</tr>
		</c:forEach>
	</table>
	<table>
		<tr>
		<%
			PageInfo p=(PageInfo)request.getAttribute("page");
			int cur=p.getCurrentPage();
			if(cur>=3){
				for(int i=cur-2;i<cur;i++){
					out.print("<td><a href='/BaiChengNews/user/list/"+i+"'>"+i+"</a></td>");
				}
			}else{
				for(int i=1;i<cur;i++){
					out.print("<td><a href='/BaiChengNews/user/list/"+i+"'>"+i+"</a></td>");
				}
			}
			out.print("<td>"+cur+"</td>");
			int tot=p.getTotalPage();
			if(tot-cur>2){
				for(int i=cur+1;i<cur+3;i++){
					out.print("<td><a href='/BaiChengNews/user/list/"+i+"'>"+i+"</a></td>");
				}
			}else{
				for(int i=cur+1;i<=tot;i++){
					out.print("<td><a href='/BaiChengNews/user/list/"+i+"'>"+i+"</a></td>");
				}
			}
		%>
		</tr>
	</table>
	共${page.totalPage}页
</body>
</html>