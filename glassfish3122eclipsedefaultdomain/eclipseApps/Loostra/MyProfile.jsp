<%@page import="loostra.entities.Give"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="loostra.entities.User"%>
<%@ page import="loostra.entities.Want"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%User user = (User) application.getAttribute("LoginUser"); %>
	<a href="./EditProfile">Edit Profile</a><br>
	<a href="./AddGive">Add Give</a><br>
	<a href="./AddWant">Add Want</a><br>
	gives - 
	<%if(user != null){
		if(user.getGives() != null || !user.getGives().isEmpty()){
	for(Give g : user.getGives()){%>
		<b><%= g.getName() %><br></b>
		<i><%= g.getDesc() %><br></i>
	<%}
	} 
	else{%>
	none entered yet
	<%} 
	}
	else{%>
	no user logged in
	<%} %>
	<br>
	wants - 
	<%if(user != null){
		if(user.getWants() != null || !user.getWants().isEmpty()){
	for(Want w : user.getWants()){%>
		<b><%= w.getName() %><br></b>
		<i><%= w.getDesc() %><br></i>
	<%}
	} 
	else{%>
	none entered yet
	<%} 
	}
	else{%>
	no user logged in
	<%} %>
	<br><!-- link up with facebook
	<iframe src="http://www.facebook.com/plugins/like.php?href=YOUR_URL"
        scrolling="no" frameborder="0"
        style="border:none; width:450px; height:80px"></iframe>
        -->
</body>
</html>

