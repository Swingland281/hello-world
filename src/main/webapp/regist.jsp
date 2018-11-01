<%--
  Created by IntelliJ IDEA.
  User: panzhongqiu
  Date: 2018/10/22
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>regist</title>
</head
<body>
    <form action="/LogReg?flag=2" method="post">
        真实姓名：<input type="text" name="trueName"><br>
        用户名：<input type="text" name="name"><br>
        密码：<input type="password" name="pwd"><br>
        邮箱：<input type="email" name="email"><br>
        电话号码:<input type="tel" name="tel"><br>
        <input type="submit" value="提交"><br>
    </form>
</body>
</html>
