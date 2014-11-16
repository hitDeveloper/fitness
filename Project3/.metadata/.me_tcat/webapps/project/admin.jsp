<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<title>管理员</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="bootstrap.min.css" rel="stylesheet" type="text/css" media="screen">
	<link href="bootstrap-responsive.min.css" rel="stylesheet" type="text/css">
</head>
<body>
<form action="backAction" method="post">
<div class="container">
<h1 class="page-header" >哈工大健身网<img src="image/logo.jpg"></h1>
	<div class="page-header" align="center"><h4>欢迎您，<s:property value="#session.gymName"/>室管理员</h4></div>
	<div align="center">场馆信息表</div>
<table class="table table-bordered">
	<tr>
	<td><label>已用情况</label><input type="text" name="usedNumber"> <s:fielderror key="msg" /></td>
	<td><label>总共可用</label><input type="text" name="totalNumber"></td>
	<td><label>联系人</label><input type="text" name="adminName"></td>
	</tr>
	<tr>
	<td><label>联系电话</label><input type="text" name="telNumber"></td>
	<td><label>开放时间</label><input type="text" name="time"></td>
	<td><label>收费情况</label><input type="text" name="price"></td>
	</tr>
</table>
<table class="table table-bordered">
	<tr>
	<td><label>场馆介绍</label><textarea rows="6" class="span5" name="introduction"></textarea></td>
	<td><label>比赛通知</label><textarea rows="6" class="span5" name="news"></textarea></td>
	</tr>
</table>
<div align="center">
<button type="submit" class="btn btn-default">提交</button>
<button type="reset" class="btn btn-default">取消</button>
</div>
</div>
<h4 class="page-header" align="center">当前订单详情</h4>
<table class="table table-bordered">
   <thead>
      <tr>
         <th><div align="center">预订人用户名</div></th>
         <th><div align="center">学院</div></th>
         <th><div align="center">时间</div></th>
		 <th><div align="center">删除订单记录</div></th>
      </tr>
   </thead>
   <tbody>
	  <tr>
         <td><div align="center">小明</div></td>
         <td><div align="center">计算机科学与技术</div></td>
		 <td><div align="center">6:30-7:30</div></td>
		 <td><div align="center"><button type="button" class="btn btn-link">删除</button></div></td>
      </tr>
   </tbody>
</table>
</form>
</body>
</html>
