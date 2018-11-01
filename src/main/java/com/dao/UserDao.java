package com.dao;

import com.entity.User;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import sun.plugin2.server.main.ResultHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
        public final static String DRIVER = "com.mysql.jdbc.Driver";
        private final static String URL = "jdbc:mysql://localhost:3306/lanxuprogram";
        private final static String USERNAME = "root";
        private final static String PASSWORD = "root";

        public Connection getConnection() {
            Connection conn = null;
            try {
                Class.forName(DRIVER);
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return conn;
        }
    public int login(String name,String pwd){
        int flag=0;
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            String str="SELECT password FROM user0 WHERE nickName=?";
            conn=getConnection();
            ps=conn.prepareStatement(str);
            ps.setString(1,name);
            rs=ps.executeQuery();
            rs.first();
            String password=rs.getString("password");
            if(password!=null){
                  flag=1;
                  if(password.equals(pwd)) {
                      flag = 2;
                      if ()
                  }
            }
        }catch (Exception ex){
            ex.getStackTrace();
        }finally {
            try{
                conn.close();
                ps.close();
                rs.close();
            }catch (Exception ex){
                ex.getStackTrace();
            }
        }

        return  flag;
    }

    public int regist(User user){
        int flag=0;
        if(login(user.getName(),user.getPwd())!=0)
            return flag;
        Connection conn=null;
        PreparedStatement ps=null;
        try{
            String str="INSERT INTO user0 (trueName,nickName,password,email,phoneNum,id,state) value(?,?,?,?,?,?,?)";
            conn=getConnection();
            ps=conn.prepareStatement(str);
            ps.setString(1,user.getTrueName());
            ps.setString(2,user.getName());
            ps.setString(3,user.getPwd());
            ps.setString(4,user.getEmail());
            ps.setString(5,user.getpNum());
            ps.setInt(6,getId()+1);
            ps.setString(7,"wait");
            ps.execute();
            flag=1;
        }catch (Exception ex){
            ex.getStackTrace();
        }finally {
            try {
                conn.close();
                ps.close();
            }catch (Exception ex){
                ex.getStackTrace();
            }
        }
        return flag;
    }

    public int getId(){
        int n=0;
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            String str="SELECT * FROM user0";
            conn=getConnection();
            ps=conn.prepareStatement(str);
            rs=ps.executeQuery();
            while(rs.next()){
                ++n;
            }
        }catch (Exception ex){
            ex.getStackTrace();
        }finally {
            try{
                conn.close();
                ps.close();
                rs.close();
            }catch (Exception ex){
                ex.getStackTrace();
            }
        }
        return n;
    }

    public User selectUser(String name){
            User user=null;
            Connection conn=null;
            try{
                conn=getConnection();
                QueryRunner qr=new QueryRunner();
                String str="SELECT * FROM user0 WHERE name=?";
                ResultHandler<User> rh=new ResultHandler<User>(User);
                qr.query(conn,str,)
            }catch (Exception ex){
                ex.getStackTrace();
            }finally {
                try{
                    DbUtils.close(conn);
                }catch (Exception ex){
                    ex.getStackTrace();
                }
            }
            return user;
    }


}
