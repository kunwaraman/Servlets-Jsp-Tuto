<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>starting</title>
</head>
<body>
   <%
       String myname = request.getParameter("name1");
       out.println(myname);
   %>
   
   <%
    String cname = (String) session.getAttribute("session_name");
    out.println(cname);
   %>
      
</body>
</html>