<%--
  Created by IntelliJ IDEA.
  User: panzhongqiu
  Date: 2018/10/22
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form method="post" action="/Login?flag=1">
    还没有账号？<a href="regist.jsp">去注册</a><br>
    用户名：<input type="text" name="name"><br>
    密码：<input type="password" name="pwd"><br>
    <input type="submit" value="提交" ><br>
</form>
</body>
</html>
