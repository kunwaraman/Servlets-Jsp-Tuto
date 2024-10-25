<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to servlet</title>
<!-- including external css -->
<link rel="stylesheet" href="<%= application.getContextPath() %>/css/style.css"/>
<!-- hiii  ji -->
</head>
<body>
	<div class="container">
	<%@ include file="menu.jsp"%>
		<h1>Welcome to servlet crash course</h1>
		<p>This is very information servlet</p>
		
		<form action="<%= application.getContextPath() %>/third" method="post">
		
		<input name="message" type="text" placeholder="enter text here "/>
		
		<button type="submit">Submit</button>
		
		</form>
		
		
	</div>
	
	<script src="<%= application.getContextPath() %>/js/script.js"></script>
	
	



</body>
</html>