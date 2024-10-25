<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome to the servlet tut</title>
<link rel="stylesheet" href="<%= application.getContextPath() %>/css/style.css"/>
</head>
<body>
	<div class="container">
	<%@ include file="menu.jsp"%>
		<h1>Services offered by substring technologies</h1>
		<p>This page provide you information about services</p>
	</div>
	
	<script src="<%= application.getContextPath() %>/js/script.js"></script>
	

</body>
</html>