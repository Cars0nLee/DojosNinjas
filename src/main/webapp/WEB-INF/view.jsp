<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo</title>
</head>
<body>
		<h1><c:out value="${dojo.name}" /> Location Ninjas</h1>
		
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>		
			</tr>
			<c:forEach var="i" items="${dojo.ninjas}" >
			<tr>
				<td><c:out value="${i.firstName}" /></td>
				<td><c:out value="${i.lastName}" /></td>
				<td><c:out value="${i.age}" /></td>
			</tr>
			</c:forEach>
		</table>
		<br>
		<a href="http://localhost:8080">Back</a>
</body>
</html>
