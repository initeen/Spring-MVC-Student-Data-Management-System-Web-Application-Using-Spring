<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration/input</title>
</head>
<body style="background-color: #D6EAF8 ">
<h1 style="table-layout: fixed;text-align: center;">Student Data Management</h1>
<h2 style="table-layout: fixed;text-align: left;">Add Student Data</h2>
	<form:form action="save" modelAttribute="stud">
	Student Id: <form:input path="id" />
		<br>
	Student Name: <form:input path="name" />
		<br>
	Student Marks <form:input path="marks" />
		<br>
		<input type="submit" value="Add Student Data">
	</form:form>
	<hr>
	<b>
	
	<a href="read1">Display All Student Data</a>
	</b>
	
</body>
</html>