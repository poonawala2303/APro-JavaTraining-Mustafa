<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "java.util.*" import= "java.time.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<b>Welcome to JSP</b>
	<%-- Declaration tag (to declare variables) --%>
	<%! int number = 10; 
	String firstName = "Mustafa";
	String lastName = "Poonawala";
	%>
	
	<%-- Scriplet Tag (to write logic) --%>
	<% Date date = new Date(); 
	LocalDate local = LocalDate.now();
	%>
	<br>
	<i>
	<%-- Expression Tag (to display data) --%>
	<%= date %>
	<br>
	<%= local %>
	<br>
	</i>
	
	<%-- Include Directive --%>
	<%@include file="NewFile.jsp" %>
	
	<br>
	<%= number*number%>
	<br>
	Hello <%= firstName + lastName %> 
</body>
</html>