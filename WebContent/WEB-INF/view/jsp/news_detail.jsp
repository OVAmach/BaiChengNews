<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新闻信息</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>新闻ID</td>
			<td>新闻频道</td>
			<td>新闻标题</td>
			<td>新闻图片</td>
			<td>发布日期</td>
			<td>作者名称</td>
		</tr>
		<tr>
			<td>${news.n_id}</td>
			<td>${news.n_channelObject.ch_name}</td>
			<td>${news.n_title}</td>
			<td><img src="${news.n_pic}"></td>
			<td>${news.n_date}</td>
			<td>${news.n_authorObject.u_nick}</td>
		</tr>
	</table>
	${news.n_content}
</body>
</html>