package service;

import dao.UserDao;
import dao.UserDaoImpl;



import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private UserDao userdao= new UserDaoImpl();
    @Override
    public List<Map<String, Object>> MHselect(String s) {
        return userdao.MHselect(s);
    }
    @Override
    public List<Map<String, Object>> AJselect(String s) {
        return userdao.AJselect(s);
    }

    @Override
    public List<Map<String, Object>> AMselect(String s) {
        return userdao.AMselect(s);
    }

    @Override
    public List<Map<String, Object>> SelectAll() {
        return userdao.SelectAll();
    }

    @Override
    public int DeleteUser(String Uid) {
        return userdao.DeleteUser(Uid);
    }
}
