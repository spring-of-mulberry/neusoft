/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-22 08:46:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class wysiwyg_002deditors_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/link/link_js.jsp", Long.valueOf(1577004299770L));
    _jspx_dependants.put("/link/link_css.jsp", Long.valueOf(1577004299737L));
    _jspx_dependants.put("/view/left_navbar.jsp", Long.valueOf(1577004299504L));
    _jspx_dependants.put("/view/top_navbar.jsp", Long.valueOf(1576999726491L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>HTML编辑器页面_Bootstrap3响应式后台主题模板Boot3Admin - cssmoban</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap-theme.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap Admin Theme -->\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap-admin-theme.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("<!-- Vendors -->\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/easypiechart/jquery.easy-pie-chart.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/easypiechart/jquery.easy-pie-chart_custom.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<!-- Vendors -->\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/jGrowl/jquery.jgrowl.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<!-- Vendors -->\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/bootstrap-wysihtml5-rails-b3/vendor/assets/stylesheets/bootstrap-wysihtml5/core-b3.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("<!-- Datatables -->\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/DT_bootstrap.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap Docs -->\r\n");
      out.write("<link href=\"http://getbootstrap.com/assets/css/docs.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("<!-- Vendors -->\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/bootstrap-datepicker/css/datepicker.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/datepicker.fixes.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/uniform/themes/default/css/uniform.default.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/uniform.default.fixes.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/chosen.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/bootstrap-wysihtml5-rails-b3/vendor/assets/stylesheets/bootstrap-wysihtml5/core-b3.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/html5shiv.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/respond.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-2.0.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/twitter-bootstrap-hover-dropdown.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/easypiechart/jquery.easy-pie-chart.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/datatables/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/DT_bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/uniform/jquery.uniform.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/chosen.jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/bootstrap-datepicker/js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/bootstrap-wysihtml5-rails-b3/vendor/assets/javascripts/bootstrap-wysihtml5/wysihtml5.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/bootstrap-wysihtml5-rails-b3/vendor/assets/javascripts/bootstrap-wysihtml5/core-b3.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/twitter-bootstrap-wizard/jquery.bootstrap.wizard-for.bootstrap3.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/boostrap3-typeahead/bootstrap3-typeahead.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/jGrowl/jquery.jgrowl.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/ckeditor/ckeditor.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/ckeditor/adapters/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/vendors/tinymce/js/tinymce/tinymce.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body >\r\n");
      out.write("        <nav class=\"navbar navbar-default navbar-inverse navbar-fixed-top \" role=\"navigation\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"navbar-header\">\r\n");
      out.write("    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">管理员系统</a>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("    <ul class=\"nav navbar-nav\">\r\n");
      out.write("        <li class=\"active\"><a href=\"#\">首页</a></li>\r\n");
      out.write("        <li ><a href=\"#\">关于我们</a></li>\r\n");
      out.write("        <li class=\"dropdown\">\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">下拉菜单<b class=\"caret\"></b></a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("                <li><a href=\"#\">Action</a></li>\r\n");
      out.write("                <li><a href=\"#\">Another action</a></li>\r\n");
      out.write("                <li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("                <li class=\"divider\"></li>\r\n");
      out.write("                <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("                <li class=\"divider\"></li>\r\n");
      out.write("                <li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <form class=\"navbar-form navbar-left\" role=\"search\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"请输入内容\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-default\">搜索</button>\r\n");
      out.write("    </form>\r\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("        <li><a href=\"#\">客服</a></li>\r\n");
      out.write("        <li class=\"dropdown\">\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">管理员<b class=\"caret\"></b></a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("                <li><a href=\"#\">设置</a></li>\r\n");
      out.write("                <li><a href=\"#\">个人资料</a></li>\r\n");
      out.write("                <li><a href=\"#\">账户中心</a></li>\r\n");
      out.write("                <li class=\"divider\"></li>\r\n");
      out.write("                <li><a href=\"#\">退出登录</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- /.navbar-collapse -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <!-- left, vertical navbar & content -->\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <!-- left, vertical navbar -->\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-2 bootstrap-admin-col-left\">\r\n");
      out.write("    <ul class=\"nav navbar-collapse collapse bootstrap-admin-navbar-side\">\r\n");
      out.write("        <li class=\"active\">\r\n");
      out.write("            <a href=\"index.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 首页</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li >\r\n");
      out.write("            <a href=\"about.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 关于我们</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"disabled\">\r\n");
      out.write("            <a href=\"#\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 日历</a><!-- calendar.html -->\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"disabled\">\r\n");
      out.write("            <a href=\"#\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 统计图表</a><!-- stats.html -->\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"tables.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 商品信息表</a>\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"forms.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 表单</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"tables.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 数据表格</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"buttons-and-icons.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 按钮 &amp; 图标</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"wysiwyg-editors.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> HTML编辑器</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"ui-and-interface.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> UI界面</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\"><span class=\"badge pull-right\">731</span> 订单</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\"><span class=\"badge pull-right\">812</span> 清单</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\"><span class=\"badge pull-right\">27</span> 客户</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\"><span class=\"badge pull-right\">1,234</span> 用户</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\"><span class=\"badge pull-right\">2,221</span> 消息</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\"><span class=\"badge pull-right\">11</span> 报告</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\"><span class=\"badge pull-right\">83</span> 错误</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\"><span class=\"badge pull-right\">4,231</span> 日志</a>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- content -->\r\n");
      out.write("                <div class=\"col-md-10\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"text-muted bootstrap-admin-box-title\">CKEditor Standard</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"bootstrap-admin-panel-content\">\r\n");
      out.write("                                <textarea id=\"ckeditor_standard\"></textarea>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"text-muted bootstrap-admin-box-title\">CKEditor Full</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"bootstrap-admin-panel-content\">\r\n");
      out.write("                                <textarea id=\"ckeditor_full\"></textarea>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"text-muted bootstrap-admin-box-title\">TinyMCE Basic</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"bootstrap-admin-panel-content\">\r\n");
      out.write("                                <textarea id=\"tinymce_basic\"></textarea>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"text-muted bootstrap-admin-box-title\">TinyMCE Full</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"bootstrap-admin-panel-content\">\r\n");
      out.write("                                <textarea id=\"tinymce_full\"></textarea>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"text-muted bootstrap-admin-box-title\">Bootstrap WYSIWYG</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"bootstrap-admin-panel-content\">\r\n");
      out.write("                                <textarea id=\"bootstrap-editor\" class=\"form-control\" placeholder=\"Enter text...\" style=\"height: 200px\"></textarea>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <hr>\r\n");
      out.write("                <footer role=\"contentinfo\">\r\n");
      out.write("                    <p>&copy; 2013 <a href=\"#\" target=\"_blank\">Boot3Admin</a>-More Templates <a href=\"http://www.cssmoban.com/\" target=\"_blank\" title=\"模板之家\">模板之家</a> - Collect from <a href=\"http://www.cssmoban.com/\" title=\"网页模板\" target=\"_blank\">网页模板</a></p>\r\n");
      out.write("                </footer>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(function() {\r\n");
      out.write("                // CKEditor Standard\r\n");
      out.write("                $('textarea#ckeditor_standard').ckeditor({\r\n");
      out.write("                    height: '150px',\r\n");
      out.write("                    toolbar: [\r\n");
      out.write("                        {name: 'document', items: ['Source', '-', 'NewPage', 'Preview', '-', 'Templates']}, // Defines toolbar group with name (used to create voice label) and items in 3 subgroups.\r\n");
      out.write("                        ['Cut', 'Copy', 'Paste', 'PasteText', 'PasteFromWord', '-', 'Undo', 'Redo'], // Defines toolbar group without name.\r\n");
      out.write("                        {name: 'basicstyles', items: ['Bold', 'Italic']}\r\n");
      out.write("                    ]\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                // CKEditor Full\r\n");
      out.write("                $('textarea#ckeditor_full').ckeditor({\r\n");
      out.write("                    height: '200px'\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                // TinyMCE Basic\r\n");
      out.write("                tinymce.init({\r\n");
      out.write("                    selector: \"#tinymce_basic\",\r\n");
      out.write("                    plugins: [\r\n");
      out.write("                        \"advlist autolink lists link image charmap print preview anchor\",\r\n");
      out.write("                        \"searchreplace visualblocks code fullscreen\",\r\n");
      out.write("                        \"insertdatetime media table contextmenu paste\"\r\n");
      out.write("                    ],\r\n");
      out.write("                    toolbar: \"insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image\"\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                // TinyMCE Full\r\n");
      out.write("                tinymce.init({\r\n");
      out.write("                    selector: \"#tinymce_full\",\r\n");
      out.write("                    plugins: [\r\n");
      out.write("                        \"advlist autolink lists link image charmap print preview hr anchor pagebreak\",\r\n");
      out.write("                        \"searchreplace wordcount visualblocks visualchars code fullscreen\",\r\n");
      out.write("                        \"insertdatetime media nonbreaking save table contextmenu directionality\",\r\n");
      out.write("                        \"emoticons template paste textcolor\"\r\n");
      out.write("                    ],\r\n");
      out.write("                    toolbar1: \"insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image\",\r\n");
      out.write("                    toolbar2: \"print preview media | forecolor backcolor emoticons\",\r\n");
      out.write("                    image_advtab: true,\r\n");
      out.write("                    templates: [\r\n");
      out.write("                        {title: 'Test template 1', content: 'Test 1'},\r\n");
      out.write("                        {title: 'Test template 2', content: 'Test 2'}\r\n");
      out.write("                    ]\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            // Bootstrap\r\n");
      out.write("            $('#bootstrap-editor').wysihtml5({\r\n");
      out.write("                stylesheets: [\r\n");
      out.write("                    'vendors/bootstrap-wysihtml5-rails-b3/vendor/assets/stylesheets/bootstrap-wysihtml5/wysiwyg-color.css'\r\n");
      out.write("                ]\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
