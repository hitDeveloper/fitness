<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<title>首页</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0"  charset="utf-8">
	<link href="bootstrap.min.css" rel="stylesheet" type="text/css" media="screen">
	<link href="bootstrap-responsive.min.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="container">
<h1 class="page-header" >哈工大健身网<img src="image/logo.jpg"></h1>
<div class="navbar">
<div class="navbar-inner">
<div class="container">
<ul class="nav">
	<li><a href="main.jsp">首页</a></li>
	<li class="divider-vertical"></li>
	<li><a href="zhengxin.jsp">正心楼</a></li>
	<li class="divider-vertical"></li>
	<li><a href="gym.jsp">体育场</a></li>
	<li class="divider-vertical"></li>
	<li><a href="tiyubu.jsp">体育部</a></li>
	<li class="divider-vertical"></li>
	<li><a href="center.jsp">活动中心</a></li>
	<li class="divider-vertical"></li>
	<li class="active"><a href="swimming.jsp">游泳馆</a></li>
	<li class="divider-vertical"></li>
	<li><a href="gym2.jsp">第二体育场</a></li>
	<li class="divider-vertical"></li>
	<li><a href="xiaozuqiuchang.jsp">小足球场</a></li>
	<li class="divider-vertical"></li>
	<li><a href="myplan.jsp">健身计划</a></li>
	<li class="divider-vertical"></li>
	<li><a href="book.jsp">场馆预定</a></li>
	<li class="divider-vertical"></li>
</ul>
<ul class="nav pull-right">
	<li><a href="login.jsp">登录</a></li>
	<li><a href="register.jsp">注册</a></li>
</ul>
</div>
</div>
</div>

<div class="tabbable tabs-left">
<ul class="nav nav-tabs">
	<li class="active"><a href="#center" data-toggle="tab">游泳馆</a></li>
</ul>
<div class="tab-content">
<div class="tab-pane active" id="center">
<div class="span6">
<div class="carousel slide" id="carousel1">
<div class="carousel-inner">
<div class="item active">
<img src="image/gym/youyongguan/20097297567.jpg" alt="">
</div>
<div class="item">
<img src="image/gym/youyongguan/200972975628297.jpg" alt="">
</div>
<div class="item">
<img src="image/gym/youyongguan/d0f49e8f-0f18-4361-8ef3-e573a51736d8.jpg" alt="">
</div>
</div>
<a href="#carousel1" data-slide="prev" class="left carousel-control">&lsaquo;</a>
<a href="#carousel1" data-slide="next" class="right carousel-control">&rsaquo;</a>
</div>
</div>
<div>
<s:action name="pageAction" executeResult="true">
<s:param name="gymName">游泳馆</s:param> 
</s:action>
<h4 class="page-header">场馆介绍</h4>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:property value="#session.introduction"/></p>

</div>
<div class="span10">
<h4 class="page-header">场馆位置</h4>
<div class="span4">
<p></p>
</div>
<div class="span8">
<img src="image/7.jpg" class="pull-right" width="400">
</div>
<div class="span10">
<h4 class="page-header">开放时间</h4>
<p><s:property value="#session.time"/></p>

</div>
<div class="span10">
<h4 class="page-header">联系人</h4>
<p><s:property value="#session.manager"/></p>

</div>
<div class="span10">
<h4 class="page-header">电话</h4>
<p><s:property value="#session.telNumber"/></p>

</div>
<div class="span10">
<h4 class="page-header">收费情况</h4>
<p><s:property value="#session.price"/></p>

</div>
</div>
</div>
</div>


</div>
</div>
		<script src="jquery-1.11.1.min.js"></script>
		<script src="bootstrap.min.js"></script>
</body>
</html>

