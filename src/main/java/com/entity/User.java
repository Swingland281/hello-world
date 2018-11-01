package com.entity;

public class User {
    private String trueName;
    private String name;
    private String pwd;
    private String email;
    private String pNum;
    private int id;
    private String state;

    public String getTrueName() { return trueName; }
    public String getName() { return name; }
    public String getPwd() { return pwd; }
    public String getEmail() { return email; }
    public String getpNum() { return pNum; }
    public int getId() { return id; }

    public String getState() { return state; }
    public void setTrueName(String trueName){
        this.trueName=trueName;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setpNum(String pNum) {
        this.pNum = pNum;
    }

    public void setId(int id) { this.id = id; }

    public void setState(String state) { this.state = state; }
}
