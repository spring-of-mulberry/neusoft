package cn.mulberry.jdbc.baseDao;

import java.io.Serializable;
import java.sql.*;
import java.util.List;

public abstract class baseDao <T extends Serializable> {
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/demo";
    private String username = "root";
    private String password = "123456";
    private String sql = "";
    private Connection connection = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;

    //创建连接
    public void addDriver() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //增删改操作
    public int doSql(String sql,Object[] objects,String log){
        int flag = -1;
        try {
            addDriver();
            ps = connection.prepareStatement(sql);
            element(ps,objects);
            flag = ps.executeUpdate();
            System.out.println(log);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                closeDriver();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return flag;
    }
    //对象的获取
    public void element(PreparedStatement ps,Object[] objects) throws SQLException {
        for (int i = 0; i <objects.length ; i++) {
            ps.setObject(i+1,objects[i]);
        }
    }
    //查询操作
    public List<T> selectSql(String sql, Object[] objects, String log) {
        try {
            addDriver();
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println(log);
            return resultToList(rs);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                closeDriver();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return  null;

    }

    protected abstract List<T> resultToList(ResultSet rs) throws SQLException;

    //关闭连接
    public void closeDriver() throws SQLException {
        if (rs != null){
            rs.close();
        }
        if (ps != null){
            ps.close();
        }
        if (connection != null){
            connection.close();
        }
    }
}
