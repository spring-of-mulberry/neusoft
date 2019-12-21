<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/13 0013
  Time: 上午 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        if(name==null){%>
            <span style="color: red;">用户名不能为空</span><br/>
     <%   }%>
    <%  if(pwd==null){%>
            <span style="color: red;">密码不能为空</span><br/>
    <%}else{
        if (pwd.length()<6||pwd.length()>12){ %>
            <span style="color: red;">密码长度需在6-12位</span>
    <%  }
   }%>
    <form action="test.do" method="post">
        <p>用户名：<input type="text" name="name" /></p>
        <p>密码：<input type="text" name="pwd" /></p>
        <p><input type="submit" /></p>
    </form>
</body>
</html>
