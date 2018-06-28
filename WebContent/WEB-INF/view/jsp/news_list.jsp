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
		<tr><td>新闻ID</td><td>新闻频道</td><td>新闻标题</td><td>新闻图片</td><td>发布日期</td><td>作者名称</td></tr>
		<c:forEach items="${list}" var="news">
			<tr>
				<td><a href="/BaiChengNews/news/detail/${news.n_id}">${news.n_id}</a></td>
				<td>${news.n_channelObject.ch_name}</td>
				<td>${news.n_title}</td>
				<td><c:if test="${news.n_pic!=null}"><img src="${news.n_pic}"></c:if></td>
				<td>${news.n_date}</td>
				<td><a href="/BaiChengNews/user/detail/${news.n_authorObject.u_nick}">${news.n_authorObject.u_nick}</a></td>
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
					out.print("<td><a href='/BaiChengNews/news/list/"+i+"'>"+i+"</a></td>");
				}
			}else{
				for(int i=1;i<cur;i++){
					out.print("<td><a href='/BaiChengNews/news/list/"+i+"'>"+i+"</a></td>");
				}
			}
			out.print("<td>"+cur+"</td>");
			int tot=p.getTotalPage();
			if(tot-cur>2){
				for(int i=cur+1;i<cur+3;i++){
					out.print("<td><a href='/BaiChengNews/news/list/"+i+"'>"+i+"</a></td>");
				}
			}else{
				for(int i=cur+1;i<=tot;i++){
					out.print("<td><a href='/BaiChengNews/news/list/"+i+"'>"+i+"</a></td>");
				}
			}
		%>
		</tr>
	</table>
	共${page.totalPage}页
</body>
</html>