package com.edu.service;

import com.edu.entity.Records;
import com.edu.entity.User;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
@WebServlet(name = "InstitutionService")
public interface InstitutionService{
    public void regist(User user);
    public boolean login(String username,String password);
    public void addInformation(Records records);
}
