<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: ClaudioCristianLopez
  Date: 12/7/2023
  Time: 10:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Garage Home URL</title>

    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css"/>


</head>
<body>

        <h1>Garage Home Page</h1>

        <table border="1">

            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Email</th>
                <th>Calle</th>
                <th>Numero</th>
                <th>Piso</th>
                <th>Depto</th>
                <th>Marca Auto</th>
                <th>Modelo</th>
                <th>Anio</th>
                <th>Patente</th>


            </tr>

            <c:forEach var="clientsTMP" items="${clientsAttributes}">

                <tr>
                    <td>${clientsTMP.nombre}</td>
                    <td>${clientsTMP.apellido}</td>
                    <td>${clientsTMP.email}</td>
                    <td>${clientsTMP.calle}</td>
                    <td>${clientsTMP.numero}</td>
                    <td>${clientsTMP.piso}</td>
                    <td>${clientsTMP.departamento}</td>
                    <td>${clientsTMP.marca_auto}</td>
                    <td>${clientsTMP.modelo}</td>
                    <td>${clientsTMP.anio}</td>
                    <td>${clientsTMP.patente}</td>

                </tr>


            </c:forEach>

        </table>

        <br>

        <div style="text-align: center">
                <input type="button" value="Add Client" onclick="window.location.href='addClientURL'; return false;"/>
        </div>


</body>
</html>
