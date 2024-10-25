<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Practice Jsp</title>
</head>
<body>
   <h3>Welcome to the Jsp world</h3>
   <%
       String name="Aman Kunwar";
       int leng = name.length();
   %>
   
   <%= leng %>
   
</body>
</html>