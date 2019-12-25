<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/25 0025
  Time: 上午 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品信息</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <td>id</td>
                <td>pname</td>
                <td>pprice</td>
                <td>pcount</td>
                <td>pimage</td>
                <td>pdetails</td>
                <td>pfenid</td>
                <td>pfenname</td>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${requestScope.products}" var="pro">
            <tr>
                <td>${pro.id}</td>
                <td>${pro.pname}</td>
                <td>${pro.pprice}</td>
                <td>${pro.pcount}</td>
                <td>${pro.pimage}</td>
                <td>${pro.pdetails}</td>
                <td>${pro.pfenid}</td>
                <td>${pro.pfenname}</td>
                <td>
                    <a>增加</a>
                    <a>修改</a>
                    <a>删除</a>
                </td>

            </tr>
        </c:forEach>
        </tbody>

    </table>

</body>
</html>
