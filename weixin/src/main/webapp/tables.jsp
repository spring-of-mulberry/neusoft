<%@ page import="java.util.List" %>
<%@ page import="com.mulberry.wx.entity.product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>数据表格页面</title>
<link rel="stylesheet" href="css/style.default.css" type="text/css" />
<script type="text/javascript" src="js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript" src="js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="js/plugins/jquery.cookie.js"></script>
<script type="text/javascript" src="js/plugins/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript" src="js/custom/general.js"></script>
<script type="text/javascript" src="js/custom/tables.js"></script>
<!--[if IE 9]>
    <link rel="stylesheet" media="screen" href="css/style.ie9.css"/>
<![endif]-->
<!--[if IE 8]>
    <link rel="stylesheet" media="screen" href="css/style.ie8.css"/>
<![endif]-->
<!--[if lt IE 9]>
	<script src="js/plugins/css3-mediaqueries.js"></script>
<![endif]-->
    <script>
        function forword(url) {
            window.location.replace(url);
        }
    </script>
</head>

<body class="withvernav">
<div class="bodywrapper">
    <div class="topheader">
        <div class="left">
            <h1 class="logo">Ama.<span>Admin</span></h1>
            <span class="slogan">后台管理系统</span>
            
            <div class="search">
            	<form action="" method="post">
                	<input type="text" name="keyword" id="keyword" value="Enter keyword(s)" />
                    <button class="submitbutton"></button>
                </form>
            </div><!--search-->
            
            <br clear="all" />
            
        </div><!--left-->
        
        <div class="right">
        	<!--<div class="notification">
                <a class="count" href="notifications.html"><span>9</span></a>
        	</div>
			-->
            <div class="userinfo">
            	<img src="images/thumbs/avatar.png" alt="" />
                <span>${sessionScope.username}</span>
                <c:if test="${empty sessionScope.username}" >
                    <jsp:forward page="index.jsp" />
                </c:if>
            </div><!--userinfo-->
            
            <div class="userinfodrop">            	<div class="avatar">
                	<a href=""><img src="images/thumbs/avatarbig.png" alt="" /></a>
                    <div class="changetheme">
                    	Change theme: <br />
                    	<a class="default"></a>
                        <a class="blueline"></a>
                        <a class="greenline"></a>
                        <a class="contrast"></a>
                        <a class="custombg"></a>
                    </div>
                </div><!--avatar-->
<div class="userdata">
                	<h4>Juan Dela Cruz</h4>
                    <span class="email">youremail@yourdomain.com</span>
                    <ul>
                    	<li><a href="editprofile.html">Edit Profile</a></li>
                        <li><a href="accountsettings.html">Account Settings</a></li>
                        <li><a href="help.html">Help</a></li>
                        <li><a href="index.html">Sign Out</a></li>
                    </ul>
                </div><!--userdata-->
            </div><!--userinfodrop-->
        </div><!--right-->
    </div><!--topheader-->
    
    
    <div class="header">
    	<ul class="headermenu">
        	<li><a href="dashboard.html"><span class="icon icon-flatscreen"></span>Dashboard</a></li>
            <li><a href="manageblog.html"><span class="icon icon-pencil"></span>Manage Blog</a></li>
            <li><a href="messages.html"><span class="icon icon-message"></span>Messages</a></li>
            <li><a href="reports.html"><span class="icon icon-chart"></span>Reports</a></li>
        </ul>
        
        <div class="headerwidget">
        	<div class="earnings">
            	<div class="one_half">
                	<h4>Today's Earnings</h4>
                    <h2>$640.01</h2>
                </div><!--one_half-->
                <div class="one_half last alignright">
                	<h4>Current Rate</h4>
                    <h2>53%</h2>
                </div><!--one_half last-->
            </div><!--earnings-->
        </div><!--headerwidget-->
        
    </div><!--header-->
    
    <div class="vernav2 iconmenu">
    	<ul>
        	<li><a href="#formsub" class="editor">Forms</a>
            	<span class="arrow"></span>
            	<ul id="formsub">
               		<li><a href="forms.html">Basic Form</a></li>
                    <li><a href="wizard.html">Wizard</a></li>
                    <li><a href="editor.html">WYSIWYG</a></li>
                </ul>
            </li>
            <!--<li><a href="filemanager.html" class="gallery">File Manager</a></li>-->
            <li><a href="elements.html" class="elements">Elements</a></li>
            <li><a href="widgets.html" class="widgets">Widgets</a></li>
            <li><a href="calendar.html" class="calendar">Calendar</a></li>
            <li><a href="support.html" class="support">Customer Support</a></li>
            <li><a href="typography.html" class="typo">Typography</a></li>
            <li class="current"><a href="tables.jsp" class="tables">Tables</a></li>
            <li><a href="buttons.html" class="buttons">Buttons &amp; Icons</a></li>
            <li><a href="#error" class="error">Error Pages</a>
            	<span class="arrow"></span>
            	<ul id="error">
               		<li><a href="notfound.html">Page Not Found</a></li>
                    <li><a href="forbidden.html">Forbidden Page</a></li>
                    <li><a href="internal.html">Internal Server Error</a></li>
                    <li><a href="offline.html">Offline</a></li>
                </ul>
            </li>
            <li><a href="#addons" class="addons">Addons</a>
            	<span class="arrow"></span>
            	<ul id="addons">
               		<li><a href="newsfeed.html">News Feed</a></li>
                    <li><a href="profile.html">Profile Page</a></li>
                    <li><a href="productlist.html">Product List</a></li>
                    <li><a href="photo.html">Photo/Video Sharing</a></li>
                </ul>
            </li>
        </ul>
        <a class="togglemenu"></a>
        <br /><br />
    </div><!--leftmenu-->
        
    <div class="centercontent tables">
    
        <div class="pageheader notab">
            <h1 class="pagetitle">Tables</h1>
            <span class="pagedesc">This is a sample description of a page</span>
            
        </div><!--pageheader-->
        
        <div id="contentwrapper" class="contentwrapper">
                        
                <div class="contenttitle2">
                	<h3>Standard Table</h3>
                </div><!--contenttitle-->
                	
                <table cellpadding="0" cellspacing="0" border="0" class="stdtable">
                    <colgroup>
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                    </colgroup>
                    <thead>
                    <tr>
                        <th class="head0">ID</th>
                        <th class="head1">PNAME</th>
                        <th class="head0">PPRICE</th>
                        <th class="head1">PCOUNT</th>
                        <th class="head0">PIMAGE</th>
                        <th class="head1">PDETAILS</th>
                        <th class="head0">PFENID</th>
                        <th class="head1">PFENNAME</th>
                        <th class="head0">OPEARTE</th>

                    </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th class="head0">ID</th>
                            <th class="head1">PNAME</th>
                            <th class="head0">PPRICE</th>
                            <th class="head1">PCOUNT</th>
                            <th class="head0">PIMAGE</th>
                            <th class="head1">PDETAILS</th>
                            <th class="head0">PFENID</th>
                            <th class="head1">PFENNAME</th>
                            <th class="head0">OPEARTE</th>
                        </tr>
                    </tfoot>
                    <tbody>
                    <c:forEach items="${requestScope.productlist}" var="p">
                        <tr>
                            <td>${p.id}</td>
                            <td>${p.pname}</td>
                            <td>${p.pprice}</td>
                            <td>${p.pcount}</td>
                            <td>${p.pimage}</td>
                            <td>${p.pdetails}</td>
                            <td class="center">${p.pfenid}</td>
                            <td class="center">${p.pfenname}</td>
                            <td class="center">
                            <a  class="" onclick="forword('forms.jsp')">Add</a>&nbsp;
                            <a  class="" onclick="forword('product.do?method=edit&id=${p.id}')">Edit</a> &nbsp;
                            <a  class="" onclick="forword('doproduct.do?method=delete&id=${p.id}')">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                
                <br /><br />

                
                <div class="contenttitle2">
                	<h3>Table with Quick Edit/View</h3>
                </div><!--contenttitle-->
                
                <table cellpadding="0" cellspacing="0" border="0" class="stdtable stdtablequick">
                    <colgroup>
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                    </colgroup>
                    <thead>
                        <tr>
                            <th class="head0">ID</th>
                            <th class="head1">PNAME</th>
                            <th class="head0">PPRICE</th>
                            <th class="head1">PCOUNT</th>
                            <th class="head0">PIMAGE</th>
                            <th class="head1">PDETAILS</th>
                            <th class="head0">PFENID</th>
                            <th class="head1">PFENNAME</th>
                            <th class="head0">OPEARTE</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th class="head0">ID</th>
                            <th class="head1">PNAME</th>
                            <th class="head0">PPRICE</th>
                            <th class="head1">PCOUNT</th>
                            <th class="head0">PIMAGE</th>
                            <th class="head1">PDETAILS</th>
                            <th class="head0">PFENID</th>
                            <th class="head1">PFENNAME</th>
                            <th class="head0">OPEARTE</th>
                        </tr>
                    </tfoot>
                    <tbody>
                    <c:forEach items="${requestScope.listproduct}" var="p">
                        <tr>
                            <td>${p.id}</td>
                            <td>${p.pname}</td>
                            <td>${p.pprice}</td>
                            <td>${p.pcount}</td>
                            <td>${p.pimage}</td>
                            <td>${p.pdetails}</td>
                            <td class="center">${p.pfenid}</td>
                            <td class="center">${p.pfenname}</td>
                            <td class="center">
                                <a  class="" onclick="forword('forms.jsp')">Add</a>&nbsp;
                                <a  class="" onclick="forword('test.do?method=doselect_all&id=${p.id}')">Edit</a> &nbsp;
                                <a  class="" onclick="forword('test.do?method=delete&id=${p.id}')">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                
                <br /><br />
                
                <div class="contenttitle2">
                	<h3>Table with Row Selection</h3>
                </div><!--contenttitle-->
                <table cellpadding="0" cellspacing="0" border="0" class="stdtable stdtablecb">
                    <colgroup>
                        <col class="con0" style="width: 4%" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                    </colgroup>
                    <thead>
                        <tr>
                        	<th class="head0"><input type="checkbox" class="checkall" /></th>
                            <th class="head1">Rendering engine</th>
                            <th class="head0">Browser</th>
                            <th class="head1">Platform(s)</th>
                            <th class="head0">Engine version</th>
                            <th class="head1">CSS grade</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                        	<th class="head0"><input type="checkbox" class="checkall" /></th>
                            <th class="head1">Rendering engine</th>
                            <th class="head0">Browser</th>
                            <th class="head1">Platform(s)</th>
                            <th class="head0">Engine version</th>
                            <th class="head1">CSS grade</th>
                        </tr>
                    </tfoot>
                    <tbody>
                        <tr>
                        	<td align="center"><input type="checkbox" /></td>
                            <td>Trident</td>
                            <td>Internet Explorer 4.0</td>
                            <td>Win 95+</td>
                            <td class="center">4</td>
                            <td class="center">X</td>
                        </tr>
                    </tbody>
                </table>
                
                <br clear="all" />
                
                <br /><br />
                
                <div class="contenttitle2">
                	<h3>Table with Options</h3>
                </div><!--contenttitle-->
                <div class="tableoptions">
                	<button class="deletebutton radius3" title="table1">Delete Selected</button> &nbsp;
                    <select class="radius3">
                    	<option value="">Show All</option>
                        <option value="">Rendering Engine</option>
                        <option value="">Platform</option>
                    </select> &nbsp;
                    <button class="radius3">Apply Filter</button>
                </div><!--tableoptions-->	
                <table cellpadding="0" cellspacing="0" border="0" id="table1" class="stdtable stdtablecb">
                    <colgroup>
                        <col class="con0" style="width: 4%" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                    </colgroup>
                    <thead>
                        <tr>
                        	<th class="head0"><input type="checkbox" class="checkall" /></th>
                            <th class="head1">Rendering engine</th>
                            <th class="head0">Browser</th>
                            <th class="head1">Platform(s)</th>
                            <th class="head0">Engine version</th>
                            <th class="head1">CSS grade</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                        	<th class="head0"><input type="checkbox" class="checkall" /></th>
                            <th class="head1">Rendering engine</th>
                            <th class="head0">Browser</th>
                            <th class="head1">Platform(s)</th>
                            <th class="head0">Engine version</th>
                            <th class="head1">CSS grade</th>
                        </tr>
                    </tfoot>
                    <tbody>
                        <tr>
                        	<td align="center"><input type="checkbox" /></td>
                            <td>Trident</td>
                            <td>Internet Explorer 4.0</td>
                            <td>Win 95+</td>
                            <td class="center">4</td>
                            <td class="center">X</td>
                        </tr>
                    </tbody>
                </table>
                
                <br /><br />
                
                <div class="contenttitle2">
                	<h3>Table with Action</h3>
                </div><!--contenttitle-->
                <div class="tableoptions">
                	<button class="deletebutton radius3" title="table2">Delete Selected</button> &nbsp;
                    <select class="radius3">
                    	<option value="">Show All</option>
                        <option value="">Rendering Engine</option>
                        <option value="">Platform</option>
                    </select> &nbsp;
                    <button class="radius3">Apply Filter</button>
                </div><!--tableoptions-->	
                <table cellpadding="0" cellspacing="0" border="0" id="table2" class="stdtable stdtablecb">
                    <colgroup>
                        <col class="con0" style="width: 4%" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                    </colgroup>
                    <thead>
                        <tr>
                        	<th class="head0"><input type="checkbox" class="checkall" /></th>
                            <th class="head1">Rendering engine</th>
                            <th class="head0">Browser</th>
                            <th class="head1">Platform(s)</th>
                            <th class="head0">Engine version</th>
                            <th class="head1">CSS grade</th>
                            <th class="head0">&nbsp;</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                        	<th class="head0"><input type="checkbox" class="checkall" /></th>
                            <th class="head1">Rendering engine</th>
                            <th class="head0">Browser</th>
                            <th class="head1">Platform(s)</th>
                            <th class="head0">Engine version</th>
                            <th class="head1">CSS grade</th>
                            <th class="head0">&nbsp;</th>
                        </tr>
                    </tfoot>
                    <tbody>
                        <tr>
                        	<td align="center"><input type="checkbox" /></td>
                            <td>Trident</td>
                            <td>Internet Explorer 4.0</td>
                            <td>Win 95+</td>
                            <td class="center">4</td>
                            <td class="center">X</td>
                            <td class="center"><a href="" class="edit">Edit</a> &nbsp; <a href="" class="delete">Delete</a></td>
                        </tr>
                    </tbody>
                </table>
                
                <br /><br />
                
                <div class="contenttitle2">
                	<h3>Dynamic Table</h3>
                </div><!--contenttitle-->
                <table cellpadding="0" cellspacing="0" border="0" class="stdtable" id="dyntable">
                    <colgroup>
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                    </colgroup>
                    <thead>
                        <tr>
                            <th class="head0">Rendering engine</th>
                            <th class="head1">Browser</th>
                            <th class="head0">Platform(s)</th>
                            <th class="head1">Engine version</th>
                            <th class="head0">CSS grade</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th class="head0">Rendering engine</th>
                            <th class="head1">Browser</th>
                            <th class="head0">Platform(s)</th>
                            <th class="head1">Engine version</th>
                            <th class="head0">CSS grade</th>
                        </tr>
                    </tfoot>
                    <tbody>
                        <tr class="gradeX">
                            <td>Trident</td>
                            <td>Internet Explorer 4.0</td>
                            <td>Win 95+</td>
                            <td class="center">4</td>
                            <td class="center">X</td>
                        </tr>
                    </tbody>
                </table>
                
          <br /><br />
                
          <div class="contenttitle2">
                	<h3>Dynamic Table with Checkbox Column</h3>
                </div><!--contenttitle-->
                <table cellpadding="0" cellspacing="0" border="0" class="stdtable" id="dyntable2">
                    <colgroup>
                        <col class="con0" style="width: 4%" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                    </colgroup>
                    <thead>
                        <tr>
                          <th class="head0 nosort"><input type="checkbox" /></th>
                            <th class="head0">Rendering engine</th>
                            <th class="head1">Browser</th>
                            <th class="head0">Platform(s)</th>
                            <th class="head1">Engine version</th>
                            <th class="head0">CSS grade</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                          <th class="head0"><span class="center">
                            <input type="checkbox" />
                          </span></th>
                            <th class="head0">Rendering engine</th>
                            <th class="head1">Browser</th>
                            <th class="head0">Platform(s)</th>
                            <th class="head1">Engine version</th>
                            <th class="head0">CSS grade</th>
                        </tr>
                    </tfoot>
                    <tbody>
                        <tr class="gradeX">
                          <td align="center"><span class="center">
                            <input type="checkbox" />
                          </span></td>
                            <td>Trident</td>
                            <td>Internet Explorer 4.0</td>
                            <td>Win 95+</td>
                            <td class="center">4</td>
                            <td class="center">X</td>
                        </tr>
                    </tbody>
                </table>
        
        </div><!--contentwrapper-->
        
	</div><!-- centercontent -->
    
    
</div><!--bodywrapper-->

</body>
</html>
