<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="loostra.entities.User"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%User user = (User) application.getAttribute("LoginUser"); %>
	<a href="./EditProfile">Edit Profile</a><br>
	<a href="./AddSkill">Add Skill</a><br>
	<!--<textarea rows="4" cols="20">Here is some text. Here is some more text.
	</textarea><br>-->
	<a href="./AddWant">Add Want</a><br>
</body>
</html>