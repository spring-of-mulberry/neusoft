<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/16 0016
  Time: 下午 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form action="session01.do" method="post">
        用户:<input type="text" name="uname" />
        密码:<input type="password" name="pwd"  />
        <input type="submit" value="登录" />
    </form>
</body>
</html>
