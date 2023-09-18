<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <title>Simple Dictionary</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Từ Điển Tiếng Việt</h2>
<form action="/translate" method="post">
    <input type="text" name="txtSearch" placeholder="Nhập từ của bạn:"/>
    <input type = "submit" id = "submit" value = "Search"/>
</form>
</body>
</html>