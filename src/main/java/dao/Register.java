package dao;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        UserDaoImpl userDao=new UserDaoImpl();
        String Uid=req.getParameter("Uid");
        String Uname=req.getParameter("Uname");
        String Password=req.getParameter("Password");
        String Gender=req.getParameter("Gender");
        int Age=Integer.parseInt(req.getParameter("Age"));
        String Role=req.getParameter("Role");
        User user = new User(Uid,Uname,Password,Gender,Age,Role,new java.sql.Date(new Date().getTime()));
        System.out.println(user.toString());
        userDao.register(user);
        req.getRequestDispatcher("login.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
