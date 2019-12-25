<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>HTML编辑器页面_Bootstrap3响应式后台主题模板Boot3Admin - cssmoban</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@ include file="/link/link_css.jsp"%>
        <%@ include file="/link/link_js.jsp"%>

    </head>
    <body >
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
                                <div class="text-muted bootstrap-admin-box-title">CKEditor Standard</div>
                            </div>
                            <div class="bootstrap-admin-panel-content">
                                <textarea id="ckeditor_standard"></textarea>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <div class="text-muted bootstrap-admin-box-title">CKEditor Full</div>
                            </div>
                            <div class="bootstrap-admin-panel-content">
                                <textarea id="ckeditor_full"></textarea>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <div class="text-muted bootstrap-admin-box-title">TinyMCE Basic</div>
                            </div>
                            <div class="bootstrap-admin-panel-content">
                                <textarea id="tinymce_basic"></textarea>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <div class="text-muted bootstrap-admin-box-title">TinyMCE Full</div>
                            </div>
                            <div class="bootstrap-admin-panel-content">
                                <textarea id="tinymce_full"></textarea>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <div class="text-muted bootstrap-admin-box-title">Bootstrap WYSIWYG</div>
                            </div>
                            <div class="bootstrap-admin-panel-content">
                                <textarea id="bootstrap-editor" class="form-control" placeholder="Enter text..." style="height: 200px"></textarea>
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

        <script type="text/javascript">
            $(function() {
                // CKEditor Standard
                $('textarea#ckeditor_standard').ckeditor({
                    height: '150px',
                    toolbar: [
                        {name: 'document', items: ['Source', '-', 'NewPage', 'Preview', '-', 'Templates']}, // Defines toolbar group with name (used to create voice label) and items in 3 subgroups.
                        ['Cut', 'Copy', 'Paste', 'PasteText', 'PasteFromWord', '-', 'Undo', 'Redo'], // Defines toolbar group without name.
                        {name: 'basicstyles', items: ['Bold', 'Italic']}
                    ]
                });

                // CKEditor Full
                $('textarea#ckeditor_full').ckeditor({
                    height: '200px'
                });

                // TinyMCE Basic
                tinymce.init({
                    selector: "#tinymce_basic",
                    plugins: [
                        "advlist autolink lists link image charmap print preview anchor",
                        "searchreplace visualblocks code fullscreen",
                        "insertdatetime media table contextmenu paste"
                    ],
                    toolbar: "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image"
                });

                // TinyMCE Full
                tinymce.init({
                    selector: "#tinymce_full",
                    plugins: [
                        "advlist autolink lists link image charmap print preview hr anchor pagebreak",
                        "searchreplace wordcount visualblocks visualchars code fullscreen",
                        "insertdatetime media nonbreaking save table contextmenu directionality",
                        "emoticons template paste textcolor"
                    ],
                    toolbar1: "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image",
                    toolbar2: "print preview media | forecolor backcolor emoticons",
                    image_advtab: true,
                    templates: [
                        {title: 'Test template 1', content: 'Test 1'},
                        {title: 'Test template 2', content: 'Test 2'}
                    ]
                });
            });

            // Bootstrap
            $('#bootstrap-editor').wysihtml5({
                stylesheets: [
                    'vendors/bootstrap-wysihtml5-rails-b3/vendor/assets/stylesheets/bootstrap-wysihtml5/wysiwyg-color.css'
                ]
            });
        </script>
    </body>
</html>
