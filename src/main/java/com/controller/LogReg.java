package com.controller;

import com.entity.User;
import com.serve.LogRegTest;
import org.json.JSONObject;

import java.io.IOException;

public class LogReg extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        int flag = Integer.parseInt(request.getParameter("flag"));
        switch (flag) {
            case 1:
                login(request, response);
                break;
            case 2:
                regist(request, response);
                break;
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void login(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name=request.getParameter("name");
        String pwd=request.getParameter("pwd");
        LogRegTest test=new LogRegTest();
        JSONObject logResult=new JSONObject();
        switch (test.login(name,pwd)){
            case 0:logResult.put("result","该用户名不存在");break;
            case 1:logResult.put("result","密码与账号不符");break;
            case 2:logResult.put("result","登陆成功");break;
        }
        response.getWriter().write(logResult.toString());
    }
    protected void regist(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String trueName=request.getParameter("trueName");
        String name=request.getParameter("name");
        String pwd=request.getParameter("pwd");
        String email=request.getParameter("email");
        String tel=request.getParameter("tel");

        User user=new User();
        user.setTrueName(trueName);
        user.setPwd(pwd);
        user.setName(name);
        user.setEmail(email);
        user.setpNum(tel);

        LogRegTest test=new LogRegTest();
        JSONObject jsonObject=new JSONObject();
        switch (test.regist(user)){
            case 0:jsonObject.put("result","用户名已存在");break;
            case 1:jsonObject.put("result","注册申请提交成功，正在审核");break;
        }
        response.getWriter().write(jsonObject.toString());
    }
}