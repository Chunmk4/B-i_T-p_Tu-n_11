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
<form action="/product-create" method="post">
    ID: <input type="number" name="id">
    Name: <input type="text" name="name">
    Description: <input type="text" name="description">
    Price: <input type="number" name="price">
    <input type="submit" value="Add">
</form>
</body>
</html>
