package com.edu.service.serviceImp;

import com.edu.dao.InstitutionDao;
import com.edu.entity.Records;
import com.edu.entity.User;
import com.edu.service.InstitutionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
@WebServlet(name = "InstitutionServiceImp")
public class InstitutionServiceImp implements InstitutionService {
    @Resource
    InstitutionDao institutionDao;

    public void regist(User user){
        institutionDao.regist(user);
    }

    public boolean login(String username,String password){
        boolean flag = false;
        User user = institutionDao.login(username);
        if(password.equals(user.getPassword())&&user.getRating()!=3)
            flag=true;
        return flag;
    }

    public void addInformation(Records records){
        institutionDao.addInformation(records);
    }
}
