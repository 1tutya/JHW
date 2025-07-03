<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 03.07.2025
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order Add</title>
</head>
<body>
    <h2>Enter Order`s Data:</h2>
    <form:form action="save" modelAttribute="addOrderDto">
        <form:hidden path="id"/>

        Product: <form:input path="product"/>
        <form:errors path="product"/>
        <br>
        Quantity: <form:input path="quantity"/>
        <form:errors path="quantity"/>
        <br>
        Price: <form:input path="price"/>
        <form:errors path="price"/>
        <br>
        <input type="submit" value="Add">
    </form:form>
</body>
</html>
