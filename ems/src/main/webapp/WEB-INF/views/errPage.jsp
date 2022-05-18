<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	String err = (String) request.getAttribute("err");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS</title>
</head>
<body>
	<h1 style="color: red"><%=err%></h1>
	<div style="margin-left: 100px; padding: 70px">
		<a href="./login">
			<button>Login</button>
		</a> <br> <br> <a href="./signup">
			<button>Sign Up</button>
		</a>
	</div>

</body>
</html>