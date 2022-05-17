<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
			<legend> User Details </legend>
			<form action="./login1" method="post">
			<!-- <form action="./login2" method="post">--> 
			<!-- <form action="./login3" method="post">  -->
			
			<!-- <form action="./login4" method="post">-->
				<table>
					<tr>
						<th>User Id </th>
						<td> <input type="number" name="id"> </td>
					</tr>
					<tr>
						<th>User Mail </th>
						<td> <input type="email" name="mail"> </td>
					</tr>
					<tr>
						<th>User Name </th>
						<td> <input type="text" name="name"> </td>
					</tr>
					<tr>
					<td> <input type="submit" value="Login"> </td>
					</tr>
				</table>
			</form>
			
	</fieldset>

</body>
</html>