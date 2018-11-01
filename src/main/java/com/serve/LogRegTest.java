package com.serve;

import com.dao.UserDao;
import com.entity.User;

public class LogRegTest{
    UserDao dao=new UserDao();
    public int login(String name,String pwd){
        return dao.login(name,pwd);
    }
    public int regist(User user){
        return dao.regist(user);
    }
}

