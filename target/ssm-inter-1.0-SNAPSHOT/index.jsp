<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2024/5/11
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎登陆</title>
</head>
<body>
<h1>欢迎页面!!请登陆</h1>
<form method="post" action="login">
    用户名: <input type="text" name="username"><br>
    密码: <input type="text" name="password"><br>
    <button type="submit">提交</button>
</form>
<br>
没有账号?<a href="register.jsp">去注册</a>
</body>
</html>

