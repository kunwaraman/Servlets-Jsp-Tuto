<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title> 
</head>
<body>
<%
String name ="AmanKunwar";
out.println(name);

%>

<%
 session.setAttribute("session_name", "AmankumarMadhubani");
%>

<form action="output.jsp" method="get">
<input type="text" name="name1" placeholder="Enter Name"/>
<input type="submit" value="Click Me"/>
</form>

</body>
</html>