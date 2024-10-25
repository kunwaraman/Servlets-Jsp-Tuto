<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Calculator Result</h2>
    <% 
        // Retrieve input parameters from the request
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operation = request.getParameter("operation");
        
        // Convert string inputs to double
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double result = 0.0;
        
        // Perform the calculation based on the selected operation
        if(operation.equals("addition")) {
            result = num1 + num2;
        } else if(operation.equals("subtraction")) {
            result = num1 - num2;
        } else if(operation.equals("multiplication")) {
            result = num1 * num2;
        } else if(operation.equals("division")) {
            // Handle division by zero error
            if(num2 != 0) {
                result = num1 / num2;
            } else {
                out.println("Error: Division by zero");
                return;
            }
        }
    %>
    
    <p>Result: <%= result %></p>

</body>
</html>