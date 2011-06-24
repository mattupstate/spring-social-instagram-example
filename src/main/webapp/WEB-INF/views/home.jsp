<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>Home</title>
	</head>
	<body>
	<ul>
		<li><a href="<c:url value="/signout" />">Sign Out</a></li>
	</ul>
	<h3>Your media feed</h3>
	<ul>
	<c:forEach items="${media}" var="item">
		<p><img src="${item.images.low_resolution.url}"/></p>
	</c:forEach>
	</ul>	
	</body>
</html>