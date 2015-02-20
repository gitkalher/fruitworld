<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
	<title>Products</title>
	<link rel="stylesheet" type="text/css" 	href="resources/style/style.css"/>
</head>
<body>
	<header>
		<h1>Products</h1>
	</header>
	
	<%@ include file="navigation_bar.jsp" %>
	
	<main>
		<P>We have a large range of products available</P>
		
		<table border="1" style="width: 100%">
			<tr>
				<th>Sr. No.</th><th>Name</th><th>Description</th>
			</tr>
			<tr>
				<td>11</td><td>Banana</td><td>Yellow eat me banana from Africa.</td>
			</tr>
			<tr>
				<td>12</td><td>Apple</td><td>Red Gala fine quality.</td>
			</tr>
			<tr>
				<td>13</td><td>Orange</td><td>Juicy orange.</td>
			</tr>
		</table>
	</main>
	
	<%@ include file="footer.jsp" %>

</body>
</html>


