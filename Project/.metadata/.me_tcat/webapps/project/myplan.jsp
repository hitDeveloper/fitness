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
	<li><a href="swimming.jsp">游泳馆</a></li>
	<li class="divider-vertical"></li>
	<li><a href="gym2.jsp">第二体育场</a></li>
	<li class="divider-vertical"></li>
	<li><a href="xiaozuqiuchang.jsp">小足球场</a></li>
	<li class="divider-vertical"></li>
	<li class="active"><a href="myplan.jsp">健身计划</a></li>
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
<s:action name="checkAction" executeResult="true">
</s:action>
<s:if test="#session.userName!=null&&#session.age==null">
<form action=planAction method="post">
<h4 class="page-header">个人详细信息</h4>
<div align="center">
<div class="input-append">
<span class="add-on"><div class="span1" align="center">年龄</div></span>
<input type="text" placeholder="输入您的年龄" class="span3" name="age" />
</div></div>
<div align="center">
<div class="input-append">
<span class="add-on"><div class="span1" align="center">身高</div></span>
<input type="text" placeholder="输入您的身高（cm）" class="span3" name="height" />
</div></div>
<div align="center">
<div class="input-prepend input-append">
<span class="add-on"><div class="span1" align="center">体重</div></span>
<input type="text" placeholder="输入您的体重" class="span3" name="weight" />
</div></div>
<div align="center">
<div class="input-prepend input-append">
<span class="add-on"><div class="span1" align="center">锻炼时间</div></span>
<select class="span3" name="payTime">
<option value="每周2小时以内">每周2小时以内</option>
<option value="每周2-5小时之间">每周2-5小时之间</option>
<option value="每周5小时以上">每周5小时以上</option>
</select>
</div></div>
<div align="center">
	 性别&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     <input type="radio" name="gender" value="男" checked> 男&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     <input type="radio" name="gender" value="女"> 女&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</div>
<br/>
<div align="center">
	 兴趣&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     <input type="radio" name="hobby" value="篮球" checked> 篮球
     <input type="radio" name="hobby" value="网球">         网球
     <input type="radio" name="hobby" value="乒乓球">         乒乓球
     <input type="radio" name="hobby" value="排球">         排球<br>
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     <input type="radio" name="hobby" value="足球">         足球
     <input type="radio" name="hobby" value="跑步">         跑步
     <input type="radio" name="hobby" value="羽毛球">         羽毛球
     <input type="radio" name="hobby" value="足球">         其他
</div>
<br/>
<div align="center">
	<input class="btn" type="submit" value="健身计划在这里"/>
</div>
</form>
</s:if>

<s:elseif test="#session.userName!=null&&#session.age!=null">
<br/><br/><br/>
<div align="center"><a href="jumpAction.action">点击这里，查看健身计划</a></div>
</s:elseif>
</div>
		<script src="jquery-1.11.1.min.js"></script>
		<script src="bootstrap.min.js"></script>
</body>
</html>
