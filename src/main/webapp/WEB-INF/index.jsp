<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>     
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dojo</title>
</head>
<body>
	<h1>New Dojo</h1>
	<form:form action="/create" method="POST" modelAttribute="dojo">
		<p>
		<form:errors path="name" style="color:red;"/>
		</p>
		<p>
		<form:label path="name">Name:</form:label>
		<form:input path="name" />
		</p>
		<input type="submit" value="Create">
	</form:form>
	<br>
	<a href="http://localhost:8080/ninja">Add Ninja</a>
	<br><br>
	<h2>View Ninjas By Location</h2>
	<a href="http://localhost:8080/view/7">Arlington</a><br>
	<a href="http://localhost:8080/view/8">Dallas</a><br>
	<a href="http://localhost:8080/view/9">Chicago</a><br>
	<a href="http://localhost:8080/view/10">Seattle</a><br>
	<a href="http://localhost:8080/view/11">California</a><br>
	<a href="http://localhost:8080/view/12">Tulsa</a><br>
	<a href="http://localhost:8080/view/13">Alaska</a>
</body>
</html>

