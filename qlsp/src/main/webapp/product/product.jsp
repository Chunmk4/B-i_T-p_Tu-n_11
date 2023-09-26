<%@ page import="com.example.qlsp.models.Product" %><%--
  Created by IntelliJ IDEA.
  User: chung
  Date: 26/09/2023
  Time: 8:48 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Day la trang hien thi san pham
<a href="/product-create">Create new product</a>
<form action="/product" method="get">
    <input type="text" name="q">
    <input type="submit" value="Search">
</form>
<c:forEach items="${products}" var="prod">
    <div>
        <p>${prod.id}</p>
        <p>${prod.name}</p>
        <p>${prod.description}</p>
        <p>${prod.price}</p>
        <form action="/product-edit" method="get">
            <input type="hidden" name="id" value="${prod.id}">
            <input type="submit" value="Edit">
        </form>
        <form action="/product-delete" method="get">
            <input type="hidden" name="id" value="${prod.id}">
            <input type="submit" value="Delete">
        </form>
    </div>
</c:forEach>
</body>
</html>
