<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="loostra.entities.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomeFeed</title>
</head>
<body>
	<!-- Profile, Bank, Messages, Search form, Updates -->
	<form method="POST" action="/Search">
		<input type="text" name="searchField">
		<input type="submit" value="Search">
	</form>
	<br>
	<!-- Profile should be /Profile/[Username] -->
	<%User user = (User) application.getAttribute("LoginUser");%> 
	
	<a href="./MyProfile" ><%=user.getUserDisplayName()%></a>
	<a href="./Store">Purchase Talents</a>
	<a href="./Updates">Updates</a>
	<a href="./SeeSkills">See Skills</a>
	<a href="./SeeWants">See Wants</a>
	
</body>
</html>