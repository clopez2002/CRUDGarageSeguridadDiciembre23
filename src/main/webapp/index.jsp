<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>

            <title>     Index JSP - Hola mundo      </title>

</head>
<body>
<!--
            <h1><%= "H1 desde el index JSP" %></h1>
            <br/>
            <a href="Servlet">Hola desde el Index</a>

-->

            <% response.sendRedirect("garageHomeURL/home"); %>

</body>
</html>