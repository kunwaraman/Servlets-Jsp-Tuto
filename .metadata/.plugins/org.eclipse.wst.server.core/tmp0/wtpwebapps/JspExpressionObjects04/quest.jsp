<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ExpressionLanguage</title>
</head>
<body>
    <%--
    <%
         request.setAttribute("request_name", "Aman Kunwar");
         //out.println(request.getAttribute("request_name"));
         
      --%>
     
     <h3>Hello : ${requestScope.request_name}</h3>
     
     <%--
         session.setAttribute("session_cname", "SmartProgramming");
        // out.println(session.getAttribute("session_cname"));
     
     --%> 
    <%--  <h3>Company Name : ${session_cname}</h3> --%>
    
    <%--Another example  --%>
    <form action="output.jsp" method="get">
      <input type="text" name="name1" placeholder = "Enter Name"/>
      <input type="submit" value="Click Me"/>
    </form>
   
      
</body>
</html>