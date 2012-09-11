<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Skill</title>
</head>
<body>
	<form method="POST" action="AddSkill">
		Skill name:
		<input type="text" name="name"><br>
		Skill description:<br>
		<input type="text"  name="description"><br>
		<input type="submit" value="Add Skill">
	</form>
	<form method="GET" action="HomeFeed.jsp">
    	<input type="submit" value="Cancel">
    </form>
</body>
</html>