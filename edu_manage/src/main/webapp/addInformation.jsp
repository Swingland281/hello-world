<%--
  Created by IntelliJ IDEA.
  User: panzhongqiu
  Date: 2019/3/14
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addInformation</title>
</head>
<body>
<form action="/addInformation" method="post">
    学生姓名：<input type="text" name="student">
    记录类型：<select name="record_type">
                    <option value="1">考试成绩</option>
                    <option value="2">竞赛成绩</option>
              </select>
    成绩：<input type="text" name="Grade_cj">
    科目：<select name="subject">
                    <option value="1">语文</option>
                    <option value="2">数学</option>
                    <option value="3">英语</option>
          </select>
    年级：<input type="text" name="grade_nj">
    名称：<input type="text" name="competition_name" >
    日期：<input type="date" name="data">
    备注：<input type="text" name="remarks" >
    <input type="submit" value="sublim">
</form>
</body>
</html>
