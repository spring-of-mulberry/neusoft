package cn.mulberry.jdbc.demoDaoImpl;

import cn.mulberry.jdbc.baseDao.baseDao;
import cn.mulberry.jdbc.demoEntity.User;
import cn.mulberry.jdbc.demoDao.userDao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class userDaoI extends baseDao implements userDao {
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/demo";
    private String username = "root";
    private String password = "123456";
    private Connection connection = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;

    //插入数据
    public int insertUser(User user){
        String sql = "insert into user(uname,upwd,uemail,ubirthday) values(?,?,?,?)";
        Object[] objects = {user.getUname(),user.getUpwd(),user.getUemail(),user.getUbirthday()};
        return doSql(sql,objects,"增加用户信息");
    }
    //更新数据
    public int updateUser(User user){
        String sql = "update user set ubirthday=? where uname=?";
        Object[] objects = {user.getUbirthday(),user.getUname()};
        return doSql(sql,objects,"更改用户信息");
    }
    //删除数据
    public int deleteUser(User user){
        String sql = "delete from user where uname=?";
        Object[] objects = {user.getUname()};
        return doSql(sql,objects,"删除用户信息");
    }
    //查询数据
    public List<User> selectUser(){
        String sql = "select uname,upwd,uemail,ubirthday from user";
        List<User> users = selectSql(sql,null,"查询员工信息");
        return users;
    }
    protected List<User> resultToList(ResultSet rs) throws SQLException {
        List<User> list = new ArrayList<User>();
        while(rs.next()){
            User user = new User();
            user.setUname(rs.getString("uname"));
            user.setUpwd(rs.getString("upwd"));
            user.setUemail(rs.getString("uemail"));
            user.setUbirthday(rs.getDate("ubirthday"));
            list.add(user);
        }
        return  list;
    }
}
