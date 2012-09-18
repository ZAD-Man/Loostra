<%@ tag %>
<%@ attribute name="user" required="true" %>
<%@ attribute name="comment" required="true" %>

<p><a href="${request.getContextPath()}/users/${user}" >${user} says:</a></p>
<p>${comment}
