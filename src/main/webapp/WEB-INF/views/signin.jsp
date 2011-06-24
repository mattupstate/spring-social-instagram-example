<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>Sign In</title>
	</head>
	<body>
		<form action="<c:url value="/signin/instagram" />" method="POST">
		    <button type="submit">Sign in with Instagram</button>		    
		</form>
	</body>
</html>
