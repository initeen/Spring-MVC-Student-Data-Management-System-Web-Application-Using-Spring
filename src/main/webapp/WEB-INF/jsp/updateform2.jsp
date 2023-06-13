<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body style="background-color: #D6EAF8 ">
<h1 style="table-layout: fixed;text-align: center;">Student Data Management</h1>
<h2 style="table-layout: fixed;text-align: left;">Update Student Data</h2>
	<form action="update" method="get">
		Student ID:<input type="text" name="id" value="${stud.id } " readonly="readonly"> <br> 
		Student Name: <input type="text" name="name" value="${stud.name }"><br>
		Student Marks: <input type="text" name="marks" value="${stud.marks }"> <br> 
		<input type="submit" value="UPDATE">
	</form>
</body>
</html>