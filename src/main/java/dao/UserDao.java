package dao;

import pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    /*模糊查询*/
    List<Map<String,Object>> MHselect(String s);
    //通过id查询
    List<Map<String, Object>> AJselect(String s);
    //    通过姓名查询
    List<Map<String,Object>> AMselect(String s);
    //返回所有用户信息
    List<Map<String,Object>> SelectAll();
    //通过id删除用户
    int DeleteUser(String s);
    //用户注册，登录验证
    void register(User user);
    User findUserById(String id);
    User findUserByUname(String username);
    User login(String Uname, String password);
    void changePassword(String username,String newPassword);
}

