<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Increment Count by 2</title>
</head>
<body>
	<h1>Welcome, User!</h1>
	<h2>Each visit to this page will increment session count by 2!</h2>
	<a href="/counter">What is the session count now? <c:out value="${count}"/> </a>
</body>
</html>