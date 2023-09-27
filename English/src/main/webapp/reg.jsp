<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 9/27/2023
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Register</title>
    <link rel="stylesheet" type="text/css" href="logreg.css">
</head>
<body>
<form action="#" method="post">
    <h2>TẠO TÀI KHOẢN</h2>
    <div class="inputBox">
        <input type="text" name="yourname" placeholder="Username" required>
    </div>
    <div class="inputBox">
        <input type="email" name="email" placeholder="Email" required>
    </div>
    <div class="inputBox">
        <input type="password" name="pswd" placeholder="Password" required>
    </div>
    <div class="inputBox">
        <input type="password" name="cfrm pswd" placeholder="Confirm Password" required>
    </div>
    <div class="inputBox">
        <input type="submit" name="reg" value="Đăng ký">
    </div>
    <p>Đã có tài khoản? <a href="login.jsp">Đăng nhập</a></p>
</form>
</body>
</html>
