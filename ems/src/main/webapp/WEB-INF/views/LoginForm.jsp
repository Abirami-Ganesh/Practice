<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<% String err = (String) request.getAttribute("err"); %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS|Login</title>
</head>
<body>
	<% if( err != null && !err.isEmpty()){ %>
		<h2 style="color: red"> <%= err %></h2>
	<%} %>

	<fieldset>
		<legend>Login</legend>
		<form action="./login" method="post">
			<table>
				<tr>
					<th>User ID</th>
					<th>:</th>
					<td><input type="number" name="id" required="required">
					</td>
				</tr>
				<tr>
					<th>User Password</th>
					<th>:</th>
					<td><input type="password" name="pwd" required="required">
					</td>
				</tr>
				<tr>
					<th><input type="submit" value="Login"></th>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>