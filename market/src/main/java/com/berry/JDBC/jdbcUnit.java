package com.berry.JDBC;

import java.sql.*;

public class jdbcUnit {
    private String url;
    private String username;
    private String password;
    private String sql;
    private Connection connection = null;
    private PreparedStatement ps;
    private ResultSet rs;

    public void testJdbc() {
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //建立连接
            url = "jdbc:mysql://localhost:3306/demo";
            username = "root";
            password = "123456";
            connection = DriverManager.getConnection(url,username,password);
            //连接数据库
            sql = "select * from emp";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.print(rs.getInt("empno")+"\t");
                System.out.print(rs.getString("ename")+"\t");
                System.out.print(rs.getString("job")+"\t");
                System.out.println(rs.getString("hiredate")+"\t");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                ps.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
