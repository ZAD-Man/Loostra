<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a Want</title>
</head>
<body>
	<form method="POST" action="AddWant">
		Abbreviated want:
		<input type="text" name="name"><br>
		Why do you need this:<br>
		<textarea rows="4" cols="20" name="description"></textarea><br>
		<input type="submit" value="Add Want">
	</form>
	<form method="GET" action="HomeFeed.jsp">
    	<input type="submit" value="Cancel">
    </form>
</body>
</html>