<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
</head>
<body>
	<h1>New Ninja</h1>
	
	<form:form action="/createninja" method="POST" modelAttribute="ninja">
		<p>
			<form:errors path="dojo" style="color:red;"/>
		</p>
		<p>
			<form:errors path="firstName" style="color:red;"/>
		</p>
		<p>
			<form:errors path="lastName" style="color:red;"/>
		</p>
		<p>
			<form:errors path="age" style="color:red;"/>
		</p>
		<form:label path="dojo">Dojo Location: </form:label>
			<form:select path="dojo">
			<form:option value="" hidden="hidden">Choose Dojo</form:option>
			<c:forEach var="i" items="${dojos}" >
				<form:option value="${i.id}">
					<c:out value="${i.name}" />
				</form:option>
			</c:forEach>
		</form:select>
		<p>
			<form:label path="firstName">First Name: </form:label>
			<form:input path="firstName" />
		</p>
		<p>
			<form:label path="lastName">Last Name: </form:label>
			<form:input path="lastName" />
		</p>
		<p>
			<form:label path="age">Age: </form:label>
			<form:input type="number" path="age" />
		</p>
		<input type="submit" value="Create">
	</form:form>
	<br>
	<a href="http://localhost:8080">Home</a>
</body>
</html>

