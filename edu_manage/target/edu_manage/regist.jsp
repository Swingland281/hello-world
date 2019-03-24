<%--
  Created by IntelliJ IDEA.
  User: panzhongqiu
  Date: 2019/3/13
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>regist</title>
</head>
<body>
<form method="post" action="/identification">
    身份：<select name="rating">
            <option value="1">学生</option>
            <option value="2">公司</option>
            <option value="3">教师/学校/竞赛承办机构</option>
            <option value="4">教育部</option>
          </select>
    用户名：<input type="text" name="username">
    密码：<input type="password" name="password">
    <input type="submit" value="提交">
</form>
</body>
</html>
