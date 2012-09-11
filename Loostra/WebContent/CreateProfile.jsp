<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="CreateProfile">
		Last Name
		:            First Name
		:            Middle Initial<p>
		<input type="text" name="lastName">
		<input type="text" name="firstName">
		<input type="text" name="middleI"><p>
		Enter a month
  		:            Enter a day
  		:            Enter a year<p>
		<select name="month" size="1">
	  		<c:forEach var="i" begin="1" end="12" step="1">
	  			<option value="${i}">${i}</option>
	  		</c:forEach>
  		</select>
  		
  		<select name="day" size ="1">
  			<c:forEach var="i" begin="1" end="31" step="1">
  				<option value="${i}">${i}</option>
  			</c:forEach>
  		</select>
  		
  		<select name="year" size="1">
	  		<c:forEach var="i" begin="1900" end="2012" step="1">
	  			<option value="${i}">${i}</option>
	  		</c:forEach>
  		</select></p>
  		Email
		<input type="text" name="email"><br><br>
		User Name
		<input type="text" name="userName"><br>
		Password
		<input type="password" name="password"><br>
		Confirm Password
		<input type="password" name="pass2"><br><br>
    	<input type="submit" value="Create">
    </form>
    <form method="GET" action="index.jsp">
    	<input type="submit" value="Cancel">
    </form>
</body>
</html>