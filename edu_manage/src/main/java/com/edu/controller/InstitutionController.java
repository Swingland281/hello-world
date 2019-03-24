package com.edu.controller;

import com.edu.entity.Records;
import com.edu.entity.User;
import com.edu.service.InstitutionService;
import com.edu.service.serviceImp.InstitutionServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;


@Controller
@WebServlet(name = "InstitutionController")
public class InstitutionController {
    @Autowired
    InstitutionServiceImp institutionServiceImp;
    @Autowired
    User user;
    @Autowired
    Records records;

    @RequestMapping(value = "/identification",method = RequestMethod.POST)
    @ResponseBody
    public void identification(HttpServletRequest request, HttpServletResponse response,
                               @RequestParam("username")String username, @RequestParam("rating")int rating,
                               @RequestParam("password")String password) throws ServletException, IOException {

        if(username!=null&&password!=null) {
            user.setUsername(username);
            user.setPassword(password);
            user.setRating(rating);
        }
        institutionServiceImp.regist(user);
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public void login(HttpServletRequest request, HttpServletResponse response,
                      @RequestParam("username")String username,@RequestParam("password")String password)throws ServletException, IOException {
        if(institutionServiceImp.login(username,password)){
            request.getSession().setAttribute("current_user",username);
            request.getRequestDispatcher("/addInformation.jsp").forward(request,response);
        }
         else
        response.getWriter().write("UNSUCCESS");
    }

    @RequestMapping(value = "/addInformation",method = RequestMethod.POST)
    @ResponseBody
    public void addInformation(HttpServletRequest request, HttpServletResponse response,
                        @RequestParam("student")String student,@RequestParam("record_type")int record_type,
                        @RequestParam("Grade_cj")String Grade_cj,@RequestParam("subject")int subject,@RequestParam("grade_nj")String grade_nj,
                        @RequestParam("competition_name")String competition_name,@RequestParam("data")String data,@RequestParam("remarks")String remarks
                               )throws ServletException, IOException {
        records.setStudent(student);
        records.setRecorder((String)request.getSession().getAttribute("current_user"));
        records.setRecord_type(record_type);
        records.setGrade_cj(Grade_cj);
        records.setSubject(subject);
        records.setRemarks(remarks);
        records.setGrade_nj(grade_nj);
        records.setCompetition_name(competition_name);
        records.setDate(data);

        institutionServiceImp.addInformation(records);

    }

}
