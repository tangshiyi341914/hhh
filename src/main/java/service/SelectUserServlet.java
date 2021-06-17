package service;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

public class SelectUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String name=req.getParameter("username");
        UserService userservice=new UserServiceImpl();
        List<Map<String,Object>> mapList=null;
        String value=req.getParameter("Submit");
        if(value==null){
            mapList=userservice.SelectAll();
        }else{
            if(value.equals("模糊查询")){
                mapList=userservice.MHselect(name);
            }else if(value.equals("按键查询")){
                mapList=userservice.AJselect(name);
            } else if(value.equals("按名查询")){
                mapList=userservice.AMselect(name);
            }
        }
        req.setAttribute("maplist",mapList);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("user.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
