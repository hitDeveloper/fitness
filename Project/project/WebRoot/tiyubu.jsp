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
	<li ><a href="main.jsp">首页</a></li>
	<li class="divider-vertical"></li>
	<li><a href="zhengxin.jsp">正心楼</a></li>
	<li class="divider-vertical"></li>
	<li><a href="gym.jsp">体育场</a></li>
	<li class="divider-vertical"></li>
	<li class="active"><a href="tiyubu.jsp">体育部</a></li>
	<li class="divider-vertical"></li>
	<li><a href="center.jsp">活动中心</a></li>
	<li class="divider-vertical"></li>
	<li><a href="swimming.jsp">游泳馆</a></li>
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
	<li class="active"><a href="#pingpong" data-toggle="tab">乒乓球</a></li>
	<li><a href="#yumaoqiu" data-toggle="tab">羽毛球</a></li>
	<li><a href="#wudao" data-toggle="tab">舞蹈教室</a></li>
	<li><a href="#lanqiu" data-toggle="tab">篮球</a></li>
</ul>
<div class="tab-content">
<div class="tab-pane active" id="pingpong">
<div class="span6">
<div class="carousel slide" id="carousel1">
<div class="carousel-inner">
<div class="item active">
<img src="image/gym/tiyubu/pingpangqiu/62682d89a05b440f8c8740e02bcb4971.jpg" alt="">
</div>
<div class="item">
<img src="image/gym/tiyubu/pingpangqiu/200791011446618.jpg" alt="">
</div>
<div class="item">
<img src="image/gym/tiyubu/pingpangqiu/2013222161721926.jpg" alt="">
</div>
<div class="item">
<img src="image/gym/tiyubu/pingpangqiu/20091124062157901.jpg" alt="">
</div>
</div>
<a href="#carousel1" data-slide="prev" class="left carousel-control">&lsaquo;</a>
<a href="#carousel1" data-slide="next" class="right carousel-control">&rsaquo;</a>
</div>
</div>
<div>
<s:action name="pageAction" executeResult="true">
<s:param name="gymName">体育部乒乓球</s:param> 
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
<img src="image/5.jpg" class="pull-right" width="400">
</div>
<div class="span10">
<h4 class="page-header">比赛消息</h4>
<p><s:property value="#session.news"/></p>
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
<div class="tab-pane" id="yumaoqiu">
<div class="span6">
<div class="carousel slide" id="carousel2">
<div class="carousel-inner">
<div class="item active">
<img src="image/gym/tiyubu/yumaoqiu/20071210212833216.jpg" alt="">
</div>
<div class="item">
<img src="image/gym/tiyubu/yumaoqiu/20071210212910247.jpg" alt="">
</div>
<div class="item">
<img src="image/gym/tiyubu/yumaoqiu/20080107174055532.jpg" alt="">
</div>
<div class="item">
<img src="image/gym/tiyubu/yumaoqiu/20091211092518942.jpg" alt="">
</div>
<div class="item">
<img src="" alt="">
</div>
</div>
<a href="#carousel2" data-slide="prev" class="left carousel-control">&lsaquo;</a>
<a href="#carousel2" data-slide="next" class="right carousel-control">&rsaquo;</a>
</div>
</div>
<div>
<s:action name="pageAction" executeResult="true">
<s:param name="gymName">体育部羽毛球</s:param> 
</s:action>
<h4 class="page-header">场馆介绍</h4>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:property value="#session.introduction"/></p>
</div>
<div class="span10">
<h4 class="page-header">场馆位置</h4>
<div class="span4">
<p></p>
</div>
<div class="span10">
<img src="image/5.jpg" class="pull-right" width="400">
</div>
<div class="span10">
<h4 class="page-header">比赛消息</h4>
<p><s:property value="#session.news"/></p>
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
<p></p>
</div>
</div>
</div>
<div class="tab-pane" id="wudao">
<div class="span6">
<div class="carousel slide" id="carousel3">
<div class="carousel-inner">
<div class="item active">
<img src="image/gym/zhengxinlou/wudaojiaoshi/cg(13).jpg" alt="">
</div>
<div class="item">
<img src="image/gym/tiyubu/wudaojiaoshi/6780a3d0hbce29a89a6fa&690.jpg" alt="">
</div>
<div class="item">
<img src="image/gym/tiyubu/wudaojiaoshi/1-140415104310294.jpg" alt="">
</div>
</div>
<a href="#carousel3" data-slide="prev" class="left carousel-control">&lsaquo;</a>
<a href="#carousel3" data-slide="next" class="right carousel-control">&rsaquo;</a>
</div>
</div>
<div>
<s:action name="pageAction" executeResult="true">
<s:param name="gymName">体育部舞蹈教室</s:param> 
</s:action>
<h4 class="page-header">场馆介绍</h4>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:property value="#session.introduction"/></p>

</div>
<div class="span10">
<h4 class="page-header">场馆位置</h4>
<div class="span4">
<p></p>
</div>
<div class="span10">
<img src="image/5.jpg" class="pull-right" width="400">
</div>
<div class="span10">
<h4 class="page-header">比赛消息</h4>
<p><s:property value="#session.news"/></p>
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

<div class="tab-pane" id="lanqiu">
<div class="span6">
<div class="carousel slide" id="carousel4">
<div class="carousel-inner">
<div class="item active">
<img src="image/gym/tiyubu/lanqiu/201052614465.jpg" alt="">
</div>
<div class="item">
<img src="image/gym/tiyubu/lanqiu/2010526144528.jpg" alt="">
</div>
<div class="item">
<img src="image/gym/tiyubu/lanqiu/2007326201241374.jpg" alt="">
</div>
<div class="item">
<img src="image/gym/tiyubu/lanqiu/20091020174726713.jpg" alt="">
</div>
</div>
<a href="#carousel4" data-slide="prev" class="left carousel-control">&lsaquo;</a>
<a href="#carousel4" data-slide="next" class="right carousel-control">&rsaquo;</a>
</div>
</div>
<div>
<s:action name="pageAction" executeResult="true">
<s:param name="gymName">体育部篮球</s:param> 
</s:action>
<h4 class="page-header">场馆介绍</h4>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:property value="#session.introduction"/></p>

</div>
<div class="span10">
<h4 class="page-header">场馆位置</h4>
<div class="span4">
<p></p>
</div>
<div class="span10">
<img src="image/5.jpg" class="pull-right" width="400">
</div>
<div class="span10">
<h4 class="page-header">比赛消息</h4>
<p><s:property value="#session.news"/></p>
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
<p></p>
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
