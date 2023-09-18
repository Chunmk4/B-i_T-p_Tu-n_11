<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<style type="text/css"  >
  .login {
    background: #88de9f;
    padding:50px;
    border:10px #ffde07 solid;
    height:200px;
    width: 500px;
    margin: 0 auto;

  }
  .login input {
    padding:5px; margin:5px
  }
</style>
<body style="background-image:url(image.jpg); background-size: cover">
<form action="/login" method="post" >
  <div class="login">
    <h1>Login</h1>
    <input type="text" name="username" size="30" placeholder="Tên đăng nhập" />
    <input type="password" name="password" size="30" placeholder="Mật khẩu" />
    <input type="submit" value="Sign in"/>
  </div>
</form>
</body>
</html>