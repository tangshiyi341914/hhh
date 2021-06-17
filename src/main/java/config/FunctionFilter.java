package config;

import dao.UserDaoImpl;
import pojo.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FunctionFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest) servletRequest;
        HttpServletResponse resp=(HttpServletResponse) servletResponse;
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        String Uname=req.getParameter("Uname");
        System.out.println(Uname);
        UserDaoImpl userDao = new UserDaoImpl();
        User user= userDao.findUserByUname(Uname);
        String url=req.getRequestURI();
        if (user.getRole().equals("学生")){
            if (url.contains("/validate")||url.contains("/addUser")||url.contains("login.jsp")||url.endsWith(".css")||url.endsWith(".js")||url.endsWith(".jpg")
                    ||url.contains("register.jsp")||url.equals("/")||url.contains("changepassword.jsp")||url.contains("/change")){
                filterChain.doFilter(req,resp);
            }
        }
    }

    @Override
    public void destroy() {

    }
}
