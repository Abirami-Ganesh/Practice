<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% String msg = (String) request.getAttribute("err"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS|SignUp</title>
</head>
<body>

	<% if( msg != null && !msg.isEmpty()){ %>
		<h1 style="color: red"> <%= msg %></h1>
	<%} %>
	<fieldset>
	<legend>Sign Up</legend>
	<form action="./register" method="post">
		<table>
			<tr>
				<th>User ID  </th>
				<th> : </th>
				<td> <input type="number" name="id" required="required">
				</td>
			</tr>
			<tr>
				<th>User Name  </th>
				<th> : </th>
				<td> <input type="text" name="name" required="required">
				</td>
			</tr>
			<tr>
				<th>Mobile Number  </th>
				<th> : </th>
				<td> <input type="number" name="mobile" required="required">
				</td>
			</tr>
			<tr>
				<th>User Mail  </th>
				<th> : </th>
				<td> <input type="email" name="mail" required="required">
				</td>
			</tr>
			<tr>
				<th>User DOB  </th>
				<th> : </th>
				<td> <input type="date" name="dob" required="required">
				</td>
			</tr>
			<tr>
				<th>User Password  </th>
				<th> : </th>
				<td> <input type="password" name="pwd" required="required">
				</td>
			</tr>
			<tr>
			<th> <input type="submit" value="Submit">  </th>
			</tr>	
		</table>
	
	</form>
</fieldset>
</body>
</html>