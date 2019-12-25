<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="bootstrap-admin-vertical-centered">
    <head>
        <title>登录页面_Bootstrap3响应式后台主题模板Boot3Admin - cssmoban</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@ include file="/link/link_css.jsp"%>
        <%@ include file="/link/link_js.jsp"%>

        <!-- Custom styles -->
        <style type="text/css">
            .alert{
                margin: 0 auto 20px;
            }
        </style>

    </head>
    <body class="bootstrap-admin-without-padding">
        <div class="container">
            <div class="row">
                <div class="alert alert-info">
                    <a class="close" data-dismiss="alert" href="#">&times;</a>
                    请输入正确的用户名和密码！
                </div>
                <form method="post" action="index.jsp" class="bootstrap-admin-login-form">
                    <h1>登录</h1>
                    <div class="form-group">
                        <input class="form-control" type="text" name="email" placeholder="邮箱">
                    </div>
                    <div class="form-group">
                        <input class="form-control" type="password" name="password" placeholder="密码">
                    </div>
                    <div class="form-group">
                        <label>
                            <input type="checkbox" name="remember_me">
                           记住密码
                        </label>
                    </div>
                    <button class="btn btn-lg btn-primary" type="submit">提交</button>
                </form>
            </div>
        </div>

        <script type="text/javascript">
            $(function() {
                // Setting focus
                $('input[name="email"]').focus();

                // Setting width of the alert box
                var formWidth = $('.bootstrap-admin-login-form').innerWidth();
                var alertPadding = parseInt($('.alert').css('padding'));
                $('.alert').width(formWidth - 2 * alertPadding);
            });
        </script>
    </body>
</html>
