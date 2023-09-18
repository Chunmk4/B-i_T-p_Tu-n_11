<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Currency Converter</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<style type="text/css">
    .convert{
        background: #88de9f;
        padding:50px;
        border:10px #ffde07 solid;
        height:200px;
        width: 500px;
        margin: 0 auto;

    }

    .convert input {
        padding:5px; margin:5px
    }

</style>
<body style="background-image: url(Anh.jpg); background-size: cover" >

<form action="/convert" method="post">
    <div class="convert">
        <h2 style="text-align: center;">Currency Converter</h2>
    <label style="color: crimson">Rate: </label><br/>
    <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
    <label style="color: crimson">USD: </label><br/>
    <input type="text" name="usd" placeholder="USD" value="0"/><br/>
    <input  type = "submit" id = "submit" value = "Converter"/>
    </div>
</form>
</body>
</html>