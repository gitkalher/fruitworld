<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" type="text/css" 	href="resources/style/style.css"/>
</head>
<body>
	<header>
		<h1>Welcome to Fruit World.</h1>
	</header>

	<%@ include file="navigation_bar.jsp" %>

	<main>
		<P>The time on the server is ${serverTime}.</P>
	</main>
	
	<%@ include file="footer.jsp" %>
	
</body>
</html>


