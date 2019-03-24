package com.edu.entity;

import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@WebServlet(name = "Records")
public class Records {
    private String student;
    private String recorder;
    private int record_type;
    private String Grade_cj;
    private int subject;
    private String remarks;
    private String grade_nj;
    private String competition_name;
    private String date;

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    public int getRecord_type() {
        return record_type;
    }

    public void setRecord_type(int record_type) {
        this.record_type = record_type;
    }

    public String getGrade_cj() {
        return Grade_cj;
    }

    public void setGrade_cj(String grade_cj) {
        Grade_cj = grade_cj;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getGrade_nj() {
        return grade_nj;
    }

    public void setGrade_nj(String grade_nj) {
        this.grade_nj = grade_nj;
    }

    public String getCompetition_name() {
        return competition_name;
    }

    public void setCompetition_name(String competition_name) {
        this.competition_name = competition_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
