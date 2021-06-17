package dao;

import pojo.User;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class LoginValidate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String Uname=req.getParameter("Uname");
        System.out.println(Uname);
        String Password=req.getParameter("Password");
        UserDaoImpl userDao = new UserDaoImpl();
        User user= userDao.findUserByUname(Uname);
        if (user==null){
            req.getSession().setAttribute("msg","用户名无效，请注册！");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }else {
            if (user.getPassword().equals(Password)){
                req.getSession().setAttribute("loginUser",Uname);
                req.getRequestDispatcher("dashboard.jsp").forward(req,resp);
            }
            else {
                req.getSession().setAttribute("msg","密码错误！");
                System.out.println(req.getSession().getAttribute("msg"));
                req.getRequestDispatcher("login.jsp").forward(req,resp);
            }
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
