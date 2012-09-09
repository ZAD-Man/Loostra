<%@ tag %>
<%@ attribute name="perspective" required="true" %>
<%@ attribute name="username" required="true" %>
<%@ taglib prefix="usr" tagdir="/WEB-INF/tags/" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% loostra.entities.User user = new loostra.entities.User(); //ToDo: Change to value retrieved from database based on name %>

<p>Hi!  My name is: ${user.userDisplayName}</p>
<p>${user.followers.size } following, ${user.following.size} followed. </p>
<p>${user.avgRating }</p>

<c:forEach var="comment" items="${user.channelComments }" >

	<usr:Comment user="${comment.commenterDisplayName }" comment="${comment.comment }"></usr:Comment>	

</c:forEach>


//TODO: Add want / offering list