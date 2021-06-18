package config;

import dao.UserDaoImpl;
import pojo.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 唐适益
 */
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest) servletRequest;
        HttpServletResponse resp=(HttpServletResponse) servletResponse;
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=Utf-8");
        String url=req.getRequestURI();
        if (url.contains("/validate")||url.contains("/addUser")||url.contains("login.jsp")||url.endsWith(".css")||url.endsWith(".js")||url.endsWith(".jpg")
                ||url.endsWith(".png")||url.endsWith(".ico")||url.contains("register.jsp")||url.equals("/")||url.contains("changepassword.jsp")||url.contains("/change")){
            filterChain.doFilter(req,resp);
        }
        else if (req.getSession().getAttribute("loginUser")==null){
            req.getSession().setAttribute("msg","没有权限，请先登录");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
            filterChain.doFilter(req,resp);
        }
    }
    @Override
    public void destroy() {

    }
}
