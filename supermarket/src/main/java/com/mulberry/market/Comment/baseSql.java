package com.mulberry.market.Comment;

import java.io.Serializable;
import java.sql.*;
import java.util.List;

public abstract class baseSql<T extends Serializable> {
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/supermarket?verifyServerCertificate=false&useSSL=false";
    private String username = "root";
    private String password = "123456";
    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    //数据库连接
    public void addConnection(){
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //关闭数据库
    public void closeConnection() throws SQLException {
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
    //增删改通用操作
    public int iduDo(String sql,Object[] objects,String log){
        int flag = -1;
        addConnection();
        try {
            ps = connection.prepareStatement(sql);
            setParam(ps,objects);
            flag = ps.executeUpdate();
//            System.out.println(log);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return flag;
    }
    //设置参数
    public void setParam(PreparedStatement ps,Object[] objects) throws SQLException {
        if (objects != null){
            for (int i = 0; i <objects.length ; i++) {
                ps.setObject(i+1,objects[i]);
            }
        }
    }
    //查询数据操作
    public List<T> selectDo(String sql,Object[] objects,String log){
        addConnection();
        try {
            ps = connection.prepareStatement(sql);
            setParam(ps,objects);
            rs = ps.executeQuery();
//            System.out.println(log);
            return resultToList(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    //查询结果集
    protected abstract List<T> resultToList(ResultSet rs) throws SQLException;


}
