<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="AdminRegDemo" method="post">
	<table align="center">
		<tr>
			<td>First Name:</td>
			<td><input type="text" name="aname" value=""></td>
		</tr>				
		<tr>
			<td>DOB:</td>
			<td><input type="text" name="dob" value=""></td>
		</tr>
		<tr>
			<td>Mobile:</td>
			<td><input type="text" name="mobile" value=""></td>
		</tr>
		<tr>
			<td><input type="submit" value="submit" name="submit"></td>
			<td><input type="reset" name="reset" value="Clear"></td>
		</tr>
		
		</table>
	</form>

		<center><h2><a href="index.jsp">Home</a></h2></center>

</body>
</html>