<%@page import="com.rays.pojo.User"%>
<%@ page import="java.util.*;"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<%
			List<User> list_data = (List<User>)request.getAttribute("data_list");
			%>
			<table border="1" align="center">
			<tr>
			<td>user id</td>
			<td>first name</td>
			<td>last name</td>
			<td>dob</td>
			<td>email</td>
			</tr>
			
			<%
			    for(User user:list_data){
			    	
			    	%>
			    	<tr>
			    	<td><%=user.getUid() %></td>
			    	<td><%=user.getFname() %></td>
			    	<td><%=user.getLname() %></td>
			    	<td><%=user.getDob() %></td>
			    	<td><%=user.getEmail() %></td>
			    	</tr>
					<% 
			    }
			%>
</table>
</body>
</html>