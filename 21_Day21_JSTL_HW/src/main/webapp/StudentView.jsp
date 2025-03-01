<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students Info</title>
</head>
<body>
	<table>
	
	<tr>
		<th>Roll</th>
		<th>Name</th>
		<th>Age</th>
	</tr>
	
	<c:forEach items="${students1234}" var="student">
	
	<tr>
	
		<td>
			<c:out value="${student.getRollNumber()}"></c:out>
		</td>
		
		<td>
			<c:out value="${student.getName()}"></c:out>
		</td>
		
		<td>
			<c:out value="${student.getAge()}"></c:out>
		</td>
	
	</tr>
	
	</c:forEach>
	
	</table>
</body>
</html>