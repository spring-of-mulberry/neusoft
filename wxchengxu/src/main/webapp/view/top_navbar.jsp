<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/22 0022
  Time: 下午 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="#">管理员系统</a>
</div>
<!-- Collect the nav links, forms, and other content for toggling -->
<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <ul class="nav navbar-nav">
        <li class="active"><a href="#">首页</a></li>
        <li ><a href="#">关于我们</a></li>
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">下拉菜单<b class="caret"></b></a>
            <ul class="dropdown-menu">
                <li><a href="#">Action</a></li>
                <li><a href="#">Another action</a></li>
                <li><a href="#">Something else here</a></li>
                <li class="divider"></li>
                <li><a href="#">Separated link</a></li>
                <li class="divider"></li>
                <li><a href="#">One more separated link</a></li>
            </ul>
        </li>
    </ul>
    <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
            <input type="text" class="form-control" placeholder="请输入内容">
        </div>
        <button type="submit" class="btn btn-default">搜索</button>
    </form>
    <ul class="nav navbar-nav navbar-right">
        <li><a href="#">客服</a></li>
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">管理员<b class="caret"></b></a>
            <ul class="dropdown-menu">
                <li><a href="#">设置</a></li>
                <li><a href="#">个人资料</a></li>
                <li><a href="#">账户中心</a></li>
                <li class="divider"></li>
                <li><a href="#">退出登录</a></li>
            </ul>
        </li>
    </ul>
</div>
