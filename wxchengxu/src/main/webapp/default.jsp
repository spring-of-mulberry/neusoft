<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>空白页面_Bootstrap3响应式后台主题模板Boot3Admin - cssmoban</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@ include file="/link/link_css.jsp"%>
        <%@ include file="/link/link_js.jsp"%>
    </head>
    <body class="bootstrap-admin-with-small-navbar">
        <nav class="navbar navbar-default navbar-inverse navbar-fixed-top " role="navigation">
            <div class="container">
                <div class="row">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <%@ include file="/view/top_navbar.jsp" %>
                    <!-- /.navbar-collapse -->
                </div>
            </div>
        </nav>

        <div class="container">
            <!-- left, vertical navbar & content -->
            <div class="row">
                <!-- left, vertical navbar -->
                <%@ include file="/view/left_navbar.jsp" %>

                <!-- content -->
                <div class="col-md-10">
                    <div class="row">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <div class="text-muted bootstrap-admin-box-title">标题</div>
                            </div>
                            <div class="bootstrap-admin-panel-content text-muted" style="padding: 60px 0; text-align: center">
                                这里是你要显示的内容
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <hr>
                <footer role="contentinfo">
                    <p>&copy; 2013 <a href="#" target="_blank">Boot3Admin</a>-More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
                </footer>
            </div>
        </div>


    </body>
</html>
