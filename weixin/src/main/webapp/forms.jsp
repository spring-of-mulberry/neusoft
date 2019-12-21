<%@ page import="com.mulberry.wx.entity.product" %><%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html ><html ><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><meta name="viewport" content="width=device-width, initial-scale=1.0" /><title>Forms | Amanda Admin Template</title><link rel="stylesheet" href="css/style.default.css" type="text/css" /><script type="text/javascript" src="js/plugins/jquery-1.7.min.js"></script><script type="text/javascript" src="js/plugins/jquery-ui-1.8.16.custom.min.js"></script><script type="text/javascript" src="js/plugins/jquery.cookie.js"></script><script type="text/javascript" src="js/plugins/jquery.uniform.min.js"></script><script type="text/javascript" src="js/plugins/jquery.validate.min.js"></script><script type="text/javascript" src="js/plugins/jquery.tagsinput.min.js"></script><script type="text/javascript" src="js/plugins/charCount.js"></script><script type="text/javascript" src="js/plugins/ui.spinner.min.js"></script><script type="text/javascript" src="js/plugins/chosen.jquery.min.js"></script><script type="text/javascript" src="js/custom/general.js"></script><script type="text/javascript" src="js/custom/forms.js"></script><!--[if IE 9]>    <link rel="stylesheet" media="screen" href="css/style.ie9.css"/><![endif]--><!--[if IE 8]>    <link rel="stylesheet" media="screen" href="css/style.ie8.css"/><![endif]--><!--[if lt IE 9]>	<script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script><![endif]--></head><body class="withvernav"><div class="bodywrapper">    <div class="topheader">        <div class="left">            <h1 class="logo">Aman.<span>da</span></h1>            <span class="slogan">admin template</span>                        <div class="search">            	<form action="" method="post">                	<input type="text" name="keyword" id="keyword" value="Enter keyword(s)" />                    <button class="submitbutton"></button>                </form>            </div><!--search-->                        <br clear="all" />                    </div><!--left-->                <div class="right">        	<div class="notification">                <a class="count" href="ajax/notifications.html"><span>9</span></a>        	</div>            <div class="userinfo">            	<img src="images/thumbs/avatar.png" alt="" />                <span>${sessionScope.username}</span>                <c:if test="${empty sessionScope.username}" >                    <jsp:forward page="index.jsp" />                </c:if>            </div><!--userinfo-->                        <div class="userinfodrop">            	<div class="avatar">                	<a href=""><img src="images/thumbs/avatarbig.png" alt="" /></a>                    <div class="changetheme">                    	Change theme: <br />                    	<a class="default"></a>                        <a class="blueline"></a>                        <a class="greenline"></a>                        <a class="contrast"></a>                        <a class="custombg"></a>                    </div>                </div><!--avatar-->				<div class="userdata">                	<h4>Juan Dela Cruz</h4>                    <span class="email">youremail@yourdomain.com</span>                    <ul>                    	<li><a href="editprofile.html">Edit Profile</a></li>                        <li><a href="accountsettings.html">Account Settings</a></li>                        <li><a href="help.html">Help</a></li>                        <li><a href="index.html">Sign Out</a></li>                    </ul>                </div><!--userdata-->            </div><!--userinfodrop-->        </div><!--right-->    </div><!--topheader-->            <div class="header">    	<ul class="headermenu">        	<li class="current"><a href="dashboard.html"><span class="icon icon-flatscreen"></span>Dashboard</a></li>            <li><a href="manageblog.html"><span class="icon icon-pencil"></span>Manage Blog</a></li>            <li><a href="messages.html"><span class="icon icon-message"></span>Messages</a></li>            <li><a href="reports.html"><span class="icon icon-chart"></span>Reports</a></li>        </ul>                <div class="headerwidget">        	<div class="earnings">            	<div class="one_half">                	<h4>Today's Earnings</h4>                    <h2>$640.01</h2>                </div><!--one_half-->                <div class="one_half last alignright">                	<h4>Current Rate</h4>                    <h2>53%</h2>                </div><!--one_half last-->            </div><!--earnings-->        </div><!--headerwidget-->            </div><!--header-->        <div class="vernav2 iconmenu">    	<ul>        	<li class="current"><a href="#formsub" class="editor">Forms</a>            	<span class="arrow"></span>            	<ul id="formsub">               		<li class="current"><a href="forms.html">Basic Form</a></li>                    <li><a href="wizard.html">Wizard</a></li>                    <li><a href="editor.html">WYSIWYG</a></li>                </ul>            </li>            <li><a href="filemanager.html" class="gallery">File Manager</a></li>            <li><a href="elements.html" class="elements">Elements</a></li>            <li><a href="widgets.html" class="widgets">Widgets</a></li>            <li><a href="calendar.html" class="calendar">Calendar</a></li>            <li><a href="support.html" class="support">Customer Support</a></li>            <li><a href="typography.html" class="typo">Typography</a></li>            <li><a href="tables.html" class="tables">Tables</a></li>			<li><a href="buttons.html" class="buttons">Buttons &amp; Icons</a></li>            <li><a href="#error" class="error">Error Pages</a>            	<span class="arrow"></span>            	<ul id="error">               		<li><a href="notfound.html">Page Not Found</a></li>                    <li><a href="forbidden.html">Forbidden Page</a></li>                    <li><a href="internal.html">Internal Server Error</a></li>                    <li><a href="offline.html">Offline</a></li>                </ul>            </li>            <li><a href="#addons" class="addons">Addons</a>            	<span class="arrow"></span>            	<ul id="addons">               		<li><a href="newsfeed.html">News Feed</a></li>                    <li><a href="profile.html">Profile Page</a></li>                    <li><a href="productlist.html">Product List</a></li>                    <li><a href="photo.html">Photo/Video Sharing</a></li>                    <li><a href="gallery.html">Gallery</a></li>                    <li><a href="invoice.html">Invoice</a></li>                </ul>            </li>        </ul>        <a class="togglemenu"></a>        <br /><br />    </div><!--leftmenu-->            <div class="centercontent">            <div class="pageheader">            <h1 class="pagetitle">增和改操作</h1>            <span class="pagedesc">对表进行增改操作列表</span>                        <ul class="hornav">                <li class="current"><a href="#basicform">Basic</a></li>                <li><a href="#validation">Validation</a></li>            </ul>        </div><!--pageheader-->                <div id="contentwrapper" class="contentwrapper">        	        	<div id="basicform" class="subcontent">                                                    <div class="contenttitle2">                        <%--<c:if test="${empty product}">--%>                            <%--<h3>增加操作</h3>--%>                        <%--</c:if>--%>                        <%--<c:if test="${!empty product}">--%>                            <%--<h3>修改操作</h3>--%>                        <%--</c:if>--%>                        <%--方法二--%>                        <c:if test="${empty product}">                            <h3>增加操作</h3>                        </c:if>                        <c:if test="${!empty product}">                            <h3>修改操作</h3>                        </c:if>                    </div><!--contenttitle-->                    <%--<form class="stdform" action="${pageContext.request.contextPath}/product.do" method="post">--%>                        <%--<c:if test="${empty product}">--%>                            <%--<input type="hidden" name="method" value="add">--%>                            <%--<p>--%>                                <%--<label>ID</label>--%>                                <%--<span class="field"><input type="text" name="id" value="${product.id}" placeholder="ID" class="mediuminput" /></span>--%>                            <%--</p><br/>--%>                        <%--</c:if>--%>                        <%--<c:if test="${!empty product}">--%>                            <%--<input type="hidden" name="method" value="update">--%>                            <%--<input type="hidden" name="id" value="${product.id}" />--%>                            <%--<p>--%>                                <%--<label>ID</label>--%>                                <%--<span class="field"><input type="text" name="id" value="${product.id}" placeholder="ID" disabled="disabled" class="mediuminput" /></span>--%>                            <%--</p><br/>--%>                        <%--</c:if>--%>                <form class="stdform" action="${pageContext.request.contextPath}/test.do" method="post">                    <c:if test="${empty product}">                        <input type="hidden" name="method" value="add">                        <p>                            <label>ID</label>                            <span class="field"><input type="text" name="id" value="${product.id}" placeholder="ID" class="mediuminput" /></span>                        </p><br/>                    </c:if>                    <c:if test="${!empty product}">                        <input type="hidden" name="method" value="update">                        <input type="hidden" name="id" value="${product.id}" />                        <p>                            <label>ID</label>                            <span class="field"><input type="text" name="id" value="${product.id}" placeholder="ID" disabled="disabled" class="mediuminput" /></span>                        </p><br/>                    </c:if>                        <p>                            <label>PNAME</label>                            <span class="field"><input type="text" name="pname" value="${product.pname}" placeholder="PNAME" class="mediuminput" /></span>                        </p><br/>                        <p>                            <label>PPRICE</label>                            <span class="field"><input type="text" name="pprice" value="${product.pprice}" placeholder="PPRICE" class="mediuminput" /></span>                        </p><br/>                        <p>                            <label>PCOUNT</label>                            <span class="field"><input type="text" name="pcount" value="${product.pcount}" placeholder="PCOUNT" class="mediuminput" /></span>                        </p><br/>                        <p>                        <label>PIMAGE</label>                        <span class="field"><input type="text" name="pimage" value="${product.pimage}" placeholder="PIMAGE" class="mediuminput" /></span>                        </p><br/>                        <p>                        <label>PDETAILS</label>                        <span class="field"><input type="text" name="pdetails" value="${product.pdetails}" placeholder="PDETAILS" class="mediuminput" /></span>                        </p><br/>                        <p>                        <label>PFENID</label>                        <span class="field"><input type="text" name="pfenid" value="${product.pfenid}" placeholder="PFENID" class="mediuminput" /></span>                        </p><br/>                        <p>                            <label>PFENNAME</label>                            <span class="field"><input type="text" name="pfenname" value="${product.pfenname}" placeholder="PFENNAME" class="mediuminput" /></span>                        </p><br/>                        <%--<p  class="reset radius2"class="stdformbutton">提交</button>--%>                            <input type="submit" class="stdformbutton"  value="提交" />                        <%--</p>--%>                                                                    </form>                                        <br />                    					<div class="contenttitle2">                        <h3>Form Style 2</h3>                    </div><!--contenttitle-->                    					<form class="stdform stdform2" method="post" action="">                    	<p>                        	<label>First Name</label>                            <span class="field"><input type="text" name="firstname" id="firstname2" class="longinput" /></span>                        </p>                                                <p>                        	<label>Last Name</label>                            <span class="field"><input type="text" name="lastname" id="lastname2" class="longinput" /></span>                        </p>						<p>                            <label>Radio Buttons</label>                            <span class="field">                            	<input type="radio" name="radiofield" /> Unchecked Radio &nbsp; &nbsp;                            	<input type="radio" name="radiofield" checked="checked" /> Checked Radio &nbsp; &nbsp;                                <input type="radio" name="radiofield" disabled="disabled" /> Disabled Radio  &nbsp; &nbsp;                                <input type="radio" name="radiofield" checked="checked" disabled="disabled" /> Disabled Radio                             </span>                        </p>                                                <p>                        	<label>Email</label>                            <span class="field"><input type="text" name="email" id="email2" class="longinput" /></span>                        </p>                                                <p>                        	<label>Location <small>You can put your own description for this field here.</small></label>                            <span class="field"><textarea cols="80" rows="5" name="location" id="location2" class="longinput"></textarea></span>                        </p>                                                <p>                        	<label>Select</label>                            <span class="field"><select name="selection" id="selection2">                            	<option value="">Choose One</option>                                <option value="1">Selection One</option>                                <option value="2">Selection Two</option>                                <option value="3">Selection Three</option>                                <option value="4">Selection Four</option>                            </select></span>                        </p>                                                                        <p class="stdformbutton">                        	<button class="submit radius2">Submit Button</button>                            <input type="reset" class="reset radius2" value="Reset Button" />                        </p>                    </form>					                    <br />            </div><!--subcontent-->                        <div id="validation" class="subcontent" style="display: none">            	                    <form id="form1" class="stdform" method="post" action="">                    	<p>                        	<label>First Name</label>                            <span class="field"><input type="text" name="firstname" id="firstname" class="longinput" /></span>                        </p>                                                <p>                        	<label>Last Name</label>                            <span class="field"><input type="text" name="lastname" id="lastname" class="longinput" /></span>                        </p>                                                <p>                        	<label>Email</label>                            <span class="field"><input type="text" name="email" id="email" class="longinput" /></span>                        </p>                                                <p>                        	<label>Location</label>                            <span class="field"><textarea cols="80" rows="5" name="location" class="mediuminput" id="location"></textarea></span>                         </p>                                                <p>                        	<label>Select</label>                            <span class="field">                            <select name="selection" id="selection">                            	<option value="">Choose One</option>                                <option value="1">Selection One</option>                                <option value="2">Selection Two</option>                                <option value="3">Selection Three</option>                                <option value="4">Selection Four</option>                            </select>                            </span>                        </p>                                                <br />                                                <p class="stdformbutton">                        	<button class="submit radius2">Submit Button</button>                        </p>                    </form>            </div><!--subcontent-->                </div><!--contentwrapper-->        	</div><!-- centercontent -->        </div><!--bodywrapper--></body></html>