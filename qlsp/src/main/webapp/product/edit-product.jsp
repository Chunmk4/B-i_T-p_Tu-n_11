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
<form action="/product-edit" method="post">
    ID: <input type="number" name="id" value="${product.id}">
    Name: <input type="text" name="name" value="${product.name}">
    Description: <input type="text" name="description" value="${product.description}">
    Price: <input type="number" name="price" value="${product.price}">
    <input type="submit" value="Edit">
</form>
</body>
</html>
