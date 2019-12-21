<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/13 0013
  Time: 上午 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%! public int sum(int a, int b){
            return a+b;
        }

    %>
    <span>使用jsp表达式调用sum方法计算输出2+3的结果为：</span>

    <%= sum(2,3) %>
    <jsp:forward  page="demo03.jsp">
        <jsp:param name="username" value="hahah"></jsp:param>
    </jsp:forward>
</body>
</html>
