<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
	<div class="menu_container">
		<ul>
			<li>
			<a href="<%= application.getContextPath() %>/about.jsp">About</a>
			</li>
			<li>
			<a href="<%= application.getContextPath() %>/service.jsp">Services</a>
			</li>
			
			<li>
			<a href="<%= application.getContextPath() %>/index.jsp">home</a>
			</li>
		</ul>

	</div>
</body>
</html>