<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 02.07.2025
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Orders</title>
</head>
<body>
    <h2>Orders:</h2>
    <br>
    <br>

    <table>
        <tr>
            <th>Product</th>
            <th>Quantity</th>
            <th>Price</th>
        </tr>
        <c:forEach var="o" items="${orders}">
            <tr>
                <td>${o.product}</td>
                <td>${o.quantity}</td>
                <td>${o.price}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
