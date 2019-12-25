<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>关于我们页面_Bootstrap3响应式后台主题模板Boot3Admin - cssmoban</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@ include file="/link/link_css.jsp"%>
        <%@ include file="/link/link_js.jsp"%>
        <!-- Custom styles -->
        <style type="text/css">
            .bootstrap-admin-content-title h1{
                font-size: 45px;
                margin-bottom: 30px;
            }
            .bs-docs-home{
            }
            .bs-masthead{
                padding: 0;
            }
            .bs-masthead h1{
                font-size: 40px;
                margin: 0;
                padding: 34px 0;
                text-align: center;
            }
            .bs-masthead a:hover{
                text-decoration: none;
            }
            .meritoo-logo a{
                background-color: #fff;
                border: 1px solid rgba(66, 139, 202, 0.4);
                display: block;
                padding: 12px 0;
            }
            .meritoo-logo a img{
                display: block;
                margin: 0 auto;
            }
            .row-urls{
                margin-top: 4px;
            }
            .row-urls .col-md-6{
                text-align: center;
            }
            .row-urls .col-md-6 a{
                font-size: 18px;
            }
        </style>

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
                     <div class="row bootstrap-admin-no-edges-padding">
                        <div class="col-md-6">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <div class="text-muted bootstrap-admin-box-title">内容</div>
                                </div>
                                <div class="bootstrap-admin-panel-content">
                                    <ul>
                                        <li>代码基于<a href="http://getbootstrap.com" target="_blank">Bootstrap 3.x.</a>构建</li>
                                        <li>可以免费使用</li>
                                        <li>基于<a href="https://github.com/VinceG/Bootstrap-Admin-Theme" target="_blank">Bootstrap-Admin-Theme</a>修改</li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <div class="text-muted bootstrap-admin-box-title">代码</div>
                                </div>
                                <div class="bootstrap-admin-panel-content">
                                    <ul>
                                        <li>
                                            <a href="#" target="_blank">cssmoban下载</a>
                                        </li>
                                        <li>
                                            <a href="#">下载地址</a>
                                        </li>
                                        <li>
                                            License: MIT 
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row bootstrap-admin-no-edges-padding">
                        <div class="col-md-12">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <div class="text-muted bootstrap-admin-box-title">License</div>
                                </div>
                                <div class="bootstrap-admin-panel-content">
                                    <p>The MIT License (MIT)</p>
                                    <p>版权所有© 2013&gt;</p>
                                    <p>特此免费授予的，对任何获得本软件副本及相关文档文件（ “软件” ） ，以处理本软件不受任何限制，包括但不限于使用权，复制，修改，合并，发布，分发，再许可和/或销售软件副本，并允许他人为之软体家具是这样做的，须符合下列条件：</p>
                                    <p>上述版权声明和本许可声明应包含在所有的副本或实质性部分的软件。</p>
                                    <p>本软件按“原样”，没有任何形式的担保，明示或默示的担保，包括但不限于适销性，适用于特定用途和非侵权的保证。在任何情况下，作者或版权所有者都不对任何索赔，损害赔偿或其他责任，无论是合同行为，侵权行为或其他原因引起， ，出来或与本软件或使用，或其他买卖本软件。</p>
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
