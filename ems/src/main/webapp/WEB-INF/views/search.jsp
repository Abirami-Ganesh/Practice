<%@page import="com.te.ems.beans.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	EmployeeInfo info = (EmployeeInfo) request.getAttribute("user");
String msg = (String) request.getAttribute("msg");
%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS|Search</title>
</head>
<body>

	<fieldset>
		<legend>Search</legend>
		<form action="./search">
			<table>
				<tr>
					<th>User ID</th>
					<th>:</th>
					<td><input type="number" name="id" required="required">
					</td>
				</tr>
				<tr>
					<th><input type="submit" value="Search"></th>
				</tr>
			</table>
		</form>
	</fieldset>
	<br>
	<br>

	<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<h2 style="color: red">
		<%=msg%></h2>
	<%
		}
	%>

	<%
		if (info != null) {
	%>

	<fieldset>
		<legend> User Data</legend>
		<h3>
			User Name :
			<%=info.getName()%>
		</h3>
		<h3>
			User Id :
			<%=info.getId()%>
		</h3>
		<h3>
			User DOB :
			<%=info.getDob()%>
		</h3>
		<h3>
			User Mail :
			<%=info.getMail()%>
		</h3>
		<h3>
			User Mobile :
			<%=info.getMobile()%>
		</h3>
	</fieldset>

	<%
		}
	%>
</body>
</html>