<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!
	int cube(int n)	{
	return n*n*n ;
	}
	%>
	
	<%= "Cube of 2 is : " +cube(2) %>
	

</body>
</html>