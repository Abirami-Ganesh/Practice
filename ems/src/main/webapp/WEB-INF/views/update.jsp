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
<title>EMS|Update</title>
</head>
<body>

	<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<h1 style="color: red">
		<%=msg%></h1>
	<%
		}
	%>
	<fieldset>
		<legend>Update</legend>
		<form action="./update" method="post">
			<table>
				<tr>
					<th>User ID</th>
					<th>: <%=info.getId()%>
					</th>
					<td><input type="number" name="id" hidden="true"
						required="required" value="<%=info.getId()%>"></td>
				</tr>
				<tr>
					<th>User Name</th>
					<th>:</th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<th>Mobile Number</th>
					<th>:</th>
					<td><input type="number" name="mobile"></td>
				</tr>
				<tr>
					<th>User Mail</th>
					<th>:</th>
					<td><input type="email" name="mail"></td>
				</tr>
				<tr>
					<th>User DOB</th>
					<th>:</th>
					<td><input type="date" name="dob"></td>
				</tr>
				<tr>
					<th>User Password</th>
					<th>:</th>
					<td><input type="password" name="pwd"></td>
				</tr>
				<tr>
					<th><input type="submit" value="Update"></th>
				</tr>
			</table>

		</form>
	</fieldset>
</body>
</html>