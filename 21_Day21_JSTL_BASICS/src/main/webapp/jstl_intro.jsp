<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="name" value="Mustafa"></c:set>

<c:out value="${name}"></c:out>

<c:set var="number" value="2"></c:set>

<c:if test="${number % 2 == 0}">
	<c:out value="Even"></c:out>
</c:if>

</body>
</html>