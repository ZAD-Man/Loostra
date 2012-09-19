<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="loostra.entities.User"%>
    <%@ page import="java.util.List" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="i" items="<%=(List<User>) application.getAttribute("users") %>">
		${i.getUserDisplayName()}<br>
		<c:forEach var ="j" items="${i.getWants()}">
			<a href="./WantRequest" name="name" title="${i.getUserDisplayName()} ${j.getName()}">${j.getName()}</a><br>
			${j.getDesc()}<br><br>
		</c:forEach>
		<br>
	</c:forEach>
</body>
</html>