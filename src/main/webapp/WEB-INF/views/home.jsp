<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" type="text/css" 	href="resources/style/style.css"/>
	<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.11.2.min.js"> </script>
	<script src="resources/script/master-script.js" ></script>
</head>
<body>
	<div class="wrapper">
		<header>
			<h1>Welcome to Fruit World.</h1>
		</header>
	
		<%@ include file="navigation_bar.jsp" %>
		
		<main>
			<P>The time on the server is ${serverTime}.</P>
		</main>
		
		<div class="push"></div>
	</div>
	<%@ include file="footer.jsp" %>
</body>
</html>


