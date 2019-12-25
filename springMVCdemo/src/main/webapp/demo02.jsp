<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/24 0024
  Time: 上午 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>demo02</title>
</head>
<body>
    <form action="demo02" method="post">
        用户名：<input type="text" name="uname"  />
        密码：<input type="password" name="password" />
        年龄：<input type="text" name="age"  />
        注释：<input type="text" name="details" />
        <input type="submit" value="登录" />
    </form>
<hr />
    ${uname}<br />
    ${password}<br />
    ${age}<br />
    ${details}<br />
</body>
</html>
