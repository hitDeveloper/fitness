<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<title>健身网</title>
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
	<li><a href="myplan.jsp">健身计划</a></li>
	<li class="divider-vertical"></li>
	<li class="active"><a href="book.jsp">场馆预定</a></li>
	<li class="divider-vertical"></li>
</ul>
<ul class="nav pull-right">
	<li><a href="login.jsp">登录</a></li>
	<li><a href="register.jsp">注册</a></li>
</ul>
</div>
</div>
</div>
<h4 class="page-header" align="center">订单</h4>
<table class="table table-bordered">
   <thead>
      <tr>
         <th><div align="center">场地场馆名称</div></th>
         <th><div align="center">收费标准</div></th>
         <th><div align="center">场地已使用数/场地总数</div></th>
		 <th><div align="center">联系人电话号码</div></th>
         <th><div align="center">请选择时间</div></th>
		 <th><div align="center">场地预约</div></th>
      </tr>
   </thead>
   <tbody>
	  <tr>
         <td><div align="center">正心楼舞蹈教室</div></td>
         <td><div align="center">5</div></td>
		 <td><div align="center">10/20</div></td>
		 <td><div align="center">88888888</div></td>
		 <td><div align="center">
		 <select name="time">
			<option value="6:00-7:00">6:00-7:00</option>
			<option value="7:00-8:00">7:00-8:00</option>
			<option value="8:00-9:00">8:00-9:00</option>
			<option value="9:00-10:00">9:00-10:00</option>
			<option value="10:00-11:00">10:00-11:00</option>
			<option value="11:00-12:00">11:00-12:00</option>
			<option value="12:00-13:00">12:00-13:00</option>
			<option value="13:00-14:00">13:00-14:00</option>
			<option value="14:00-15:00">14:00-15:00</option>
			<option value="15:00-16:00">15:00-16:00</option>
			<option value="16:00-17:00">16:00-17:00</option>
			<option value="17:00-18:00">17:00-18:00</option>
			<option value="18:00-19:00">18:00-19:00</option>
			<option value="19:00-20:00">19:00-20:00</option>
			<option value="20:00-21:00">20:00-21:00</option>
			<option value="21:00-22:00">21:00-22:00</option>
		 </select></div>
		 </td>
		    <td><div align="center"><button type="button" class="btn btn-link">预定</button></div></td>
      </tr>
   </tbody>
</table>
</div>
	<script src="jquery-1.11.1.min.js"></script>
	<script src="bootstrap.min.js"></script>
</body>
</html>

