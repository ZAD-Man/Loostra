<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="usr" tagdir="/WEB-INF/tags/" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!-- 
	get user attribute based off 
	name in the get request scope, 
	and set it as an attribute 
-->

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- get user attribute based off name in the get request scope, and set it as an attribute -->
	
	<c:if test="${sessionScope.user.userDisplayName == requestScope.username }" >
		<a href="./EditProfile">Edit Profile</a><br>
		<a href="./AddSkill">Add Skill</a><br>
		<a href="./AddWant">Add Want</a><br>
		<usr:User perspective="self" username="${requestScope.username }" />
	</c:if>
	<c:if test="${sessionScope.user.userDisplayName == requestScope.username }" >
		<a href="./Review">Review</a><br>
		<usr:User perspective="user" username="${requestScope.username }"></usr:User>
	</c:if>
	
</body>
</html>