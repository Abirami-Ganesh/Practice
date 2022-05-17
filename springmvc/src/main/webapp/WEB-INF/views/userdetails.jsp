<%@page import="com.te.springmvc.beans.UserDetail"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    	String name =(String) request.getAttribute("userName");
        Integer id =(Integer)  request.getAttribute("userId");
        UserDetail detail =(UserDetail) request.getAttribute("data");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% if ( id != null){ %>
		<h1>I User Name = <%= name %></h1>
		<h1>I User ID  = <%= id %></h1>
	<%} %>
		
	<% if(detail != null){ %>	
	<h1>D User Name = <%= detail.getName() %></h1>
		<h1>D User ID  = <%= detail.getId() %></h1>
	<%} %>
</body>
</html>