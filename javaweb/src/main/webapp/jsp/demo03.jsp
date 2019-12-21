<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/12 0012
  Time: 下午 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="domo03?name=zhangsan&pws=123">点击测试出结果</a>
<form action="cookie.do" method="post">
    <p>用户名：<input type="text" name="username" /></p>
    <p>密码：<input type="text" name="password" /></p>
    <p> 类型：<input type="checkbox" name="type" value="1" >企业
        <input type="checkbox" name="type" value="2" >个人
        <input  type="checkbox" name="type" value="3">社团</p>
    <p> <input type="submit" /></p>
</form>
<br />
<hr />
<span>${username}</span>
<span>${pwds}</span>

<%=request.getParameter("username") %>
</body>
</html>
