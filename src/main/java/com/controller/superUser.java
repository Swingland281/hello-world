package com.controller;

import com.entity.User;
import com.serve.LogRegTest;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "superUser")
public class superUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        regist(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
            case 1:jsonObject.put("result","注册成功");break;
        }
        response.getWriter().write(jsonObject.toString());
    }

}
