<%--
  Created by IntelliJ IDEA.
  User: chung
  Date: 26/09/2023
  Time: 9:05 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/product-delete" method="post">
    <input type="hidden" name="id" value="${product.id}">
    ID: <input type="number" value="${product.id}" disabled>
    Name: <input type="text" name="name" value="${product.name}" disabled>
    Description: <input type="text" name="description" value="${product.description}" disabled>
    Price: <input type="number" name="price" value="${product.price}" disabled>
    <input type="submit" value="Delete">
</form>
</body>
</html>
