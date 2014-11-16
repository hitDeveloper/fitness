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
<form action="register" method="post">
<div class="container">
<h1 class="page-header" >哈工大健身网<img src="image/logo.jpg"></h1>
<h4 class="page-header" align="center">用户注册</h4>
<div align="center">
<div class="input-append">
<span class="add-on"><div class="span1" align="center">用户名</div></span>
<input type="text" placeholder="输入您的用户名" class="span3" name="userName" />
</div></div>
<div align="center">
<div class="input-append">
<span class="add-on"><div class="span1" align="center">密码</div></span>
<input type="password" placeholder="输入您的密码" class="span3" name="password" />
</div></div>
<div align="center">
<div class="input-prepend input-append">
<span class="add-on"><div class="span1" align="center">年龄</div></span>
<input type="text" placeholder="输入您的年龄" class="span3" name="age" /><span class="add-on">岁</span>
</div></div>
<div align="center">
<div class="input-prepend input-append">
<span class="add-on"><div class="span1" align="center">身高</div></span>
<input type="text" placeholder="输入您的身高" class="span3" name="length" /><span class="add-on">cm</span>
</div></div>
<div align="center">
<div class="input-prepend input-append">
<span class="add-on"><div class="span1" align="center">体重</div></span>
<input type="text" placeholder="输入您的身高" class="span3" name="weight" /><span class="add-on">kg</span>
</div></div>
<div align="center">
<p>性别</p>
男<input type="radio" name="sex" value="男">
女<input type="radio" name="sex" value="女"><br />
</div>
<div align="center">
<p>年级</p>
大一<input type="radio" name="grade" value="大一">
大二<input type="radio" name="grade" value="大二">
大三<input type="radio" name="grade" value="大三"><br />
大四<input type="radio" name="grade" value="大四">
研一<input type="radio" name="grade" value="研一">
研二<input type="radio" name="grade" value="研二">
</div>
<div align="center">
<p>健身目标</p>
减肥<input type="radio" name="excerciseAim" value="减肥">
锻炼<input type="radio" name="excerciseAim" value="锻炼">
练肌肉<input type="radio" name="excerciseAim" value="练肌肉">
健康<input type="radio" name="excerciseAim" value="健康">
</div>
<div align="center">
	<input class="btn" type="submit" value="提交"/>     
</div>

</div>
</form>
		<script src="jquery-1.11.1.min.js"></script>
		<script src="bootstrap.min.js"></script>
</body>
</html>