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
            <c:url var="delete" value="orders/delete">
                <c:param name="id" value="${o.id}"/>
            </c:url>

            <c:url var="edit" value="orders/edit">
                <c:param name="id" value="${o.id}"/>
            </c:url>

            <tr>
                <td>${o.product}</td>
                <td>${o.quantity}</td>
                <td>${o.price}</td>
                <td>
                    <input type="button" value="Delete" onclick="window.location.href='${delete}'">
                </td>
                <td>
                    <input type="button" value="Edit" onclick="window.location.href='${edit}'">
                </td>
            </tr>
        </c:forEach>
    </table>

    <input type="button" value="Add Order" onclick="window.location.href='orders/add'">
</body>
</html>
