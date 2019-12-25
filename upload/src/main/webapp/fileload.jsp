<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/25 0025
  Time: 下午 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="dofile" method="post" enctype="multipart/form-data">
    文件名:<input type="text" name="fname"/>
    文件:<input type="file" name="ufile"/>
    <button type="submit">上传</button>
</form>
</body>
</html>
