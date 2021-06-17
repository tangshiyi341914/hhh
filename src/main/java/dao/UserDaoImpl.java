package dao;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import pojo.User;
import utils.JDBCUtils;
import java.util.List;
import java.util.Map;

 public class UserDaoImpl implements UserDao {
    /**
     * 数据库连接
     */
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<Map<String, Object>> MHselect(String s) {
        s="%%"+s;
        String sql="select * from tb_user where Uname like ?";
        try {
            List<Map<String, Object>> list=template.queryForList(sql,s);
            return list;
        }catch (EmptyResultDataAccessException e){
            return null;
        }

    }

    @Override
    public List<Map<String, Object>> AJselect(String s) {
        String sql="select * from tb_user where Uid = ?";
        try {
            List<Map<String, Object>> list=template.queryForList(sql,s);
            return list;
        }catch (EmptyResultDataAccessException e){
            return null;
        }

    }

    @Override
    public List<Map<String, Object>> AMselect(String s) {
        String sql="select * from tb_user where Uname = ?";
        try {
            List<Map<String, Object>> list=template.queryForList(sql,s);
            return list;
        }catch (EmptyResultDataAccessException e){
            return null;
        }

    }

    @Override
    public List<Map<String, Object>> SelectAll() {
        String sql="select * from tb_user";
        try{
            List<Map<String,Object>> list=template.queryForList(sql);
            return list;
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public int DeleteUser(String Uid) {
        //创建SQL语句
        String sql="delete from tb_user where Uid = ?";
        //操作数据库
        int res = template.update(sql,Uid);
        return res;
    }

    /**
     * 重新接口方法
     * 用户注册
     * @param user
     */
    @Override
    public void register(User user) {
        //创建SQL语句
        String sql="insert into tb_user(Uid,Uname,Password,Gender,Age,Role,Add_time) values(?,?,?,?,?,?,?)";
        //操作连接
        template.update(sql,user.getUid(),user.getUname(),user.getPassword(),user.getGender(),user.getAge(),user.getRole(),user.getAdd_time());
    }

    /**
     * 通过用户id查找用户
     * @param id
     */
    @Override
    public User findUserById(String id) {
        //创建SQL语句
        String sql = "select * from tb_user where Uid = ?";
        //操作数据库
        try{
            User user=template.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),id);
            return user;
        }catch(EmptyResultDataAccessException e) {
            return null;
        }
    }
    /**
     * 通过用户名查找
     * @param username
     */
    @Override
    public User findUserByUname(String username) {
        //创建SQL语句
        String sql = "select * from tb_user where Uname = ?";
        //操作数据库
        try{
            //使用的queryForObject方法
            User user=template.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),username);
            //返回用户
            return user;
        }catch(EmptyResultDataAccessException e){
            return null;
        }

    }
    /**
     * 用户登录
     * @param Uname
     * @param password
     */
    @Override
    public User login(String Uname, String password) {
        //创建SQL语句
        String sql = "select * from tb_user where Uname = ? AND password = ?";
        //操作数据库
        try{
            //使用的queryForObject方法
            User user=template.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),Uname,password);
            //返回用户
            return user;
        }catch(EmptyResultDataAccessException e){
            return null;
        }
    }

     @Override
     public void changePassword(String username, String newPassword) {
         //创建SQL语句
         String sql = "update tb_user set Password=? where Uname=?";
         //操作数据库
         template.update(sql,newPassword,username);
     }
 }
