package com.edu.dao;

import com.edu.entity.Records;
import com.edu.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Repository
@WebServlet(name = "InstitutionDao")
public interface InstitutionDao {
    public void regist(User user);
    public User login(@Param("username") String username);
    public void addInformation(Records records);
}
