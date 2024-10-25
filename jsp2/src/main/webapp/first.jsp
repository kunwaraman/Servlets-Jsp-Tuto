<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Table of 2</title>
</head>
<body>
<h1>hello how are bro</h1>
<h2>i am fine that you also fine</h2>
    <h2>Table of 2</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Number</th>
                <th>Result</th>
            </tr>
        </thead>
        <tbody>
            <% for (int i = 1; i <= 10; i++) { %>
                <tr>
                    <td>2 x <%= i %></td>
                    <td><%= 2 * i %></td>
                </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>
