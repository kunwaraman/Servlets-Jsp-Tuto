<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <h2>Dynamic Calculator</h2>
    <form action="calculatorResult.jsp" method="post">
        <label for="num1">Enter Number 1:</label>
        <input type="text" id="num1" name="num1"><br><br>
        
        <label for="num2">Enter Number 2:</label>
        <input type="text" id="num2" name="num2"><br><br>
        
        <label for="operation">Select Operation:</label>
        <select id="operation" name="operation">
            <option value="addition">Addition</option>
            <option value="subtraction">Subtraction</option>
            <option value="multiplication">Multiplication</option>
            <option value="division">Division</option>
        </select><br><br>
        
        <input type="submit" value="Calculate">
    </form>

</body>
</html>