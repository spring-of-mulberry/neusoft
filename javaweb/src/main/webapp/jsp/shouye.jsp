<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/16 0016
  Time: 下午 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <c:if test="${empty sessionScope.uname}">
        <jsp:forward page="/jsp/login.jsp" />
    </c:if>
    <h2>用户名：<%=session.getAttribute("uname") %></h2>
    <%--删除会话域--%>
<%--<%--%>
    <%--session.removeAttribute("uname");--%>
<%--%>--%>
</body>
</html>
