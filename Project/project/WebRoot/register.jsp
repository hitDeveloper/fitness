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
<form action="registerAction" method="post">
<div class="container">
<h1 class="page-header" >哈工大健身网<img src="image/logo.jpg"></h1>
<h4 class="page-header" align="center">用户注册</h4>
<div align="center"><s:property value="information"/></div>
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
<span class="add-on"><div class="span1" align="center">确认密码</div></span>
<input type="password" placeholder="请再输入一次" class="span3" name="repassword" />
</div></div>
<div align="center">
<div class="input-prepend input-append">
<span class="add-on"><div class="span1" align="center">学号</div></span>
<input type="text" placeholder="请输入学号" class="span3" name="number" />
</div></div>
<div align="center">
<div class="input-prepend input-append">
<span class="add-on"><div class="span1" align="center">学院</div></span>
<select class="span3" name="college">
<option value="航天学院">航天学院</option>
<option value="机电工程学院">机电工程学院</option>
<option value="材料科学与工程学院">材料科学与工程学院</option>
<option value="电子与信息工程学院">电子与信息工程学院</option>
<option value="能源科学与工程学院">能源科学与工程学院</option>
<option value="电气工程及自动化学院">电气工程及自动化学院</option>
<option value="理学院">理学院</option>
<option value="经济与管理学院">经济与管理学院</option>
<option value="人文与社会科学学院">人文与社会科学学院</option>
<option value="土木工程学院">土木工程学院</option>
<option value="市政环境工程学院">市政环境工程学院</option>
<option value="建筑学院">建筑学院</option>
<option value="交通科学与工程学院">交通科学与工程学院</option>
<option value="计算机科学与技术学院">计算机科学与技术学院</option>
<option value="软件学院">软件学院</option>
<option value="法学院">法学院</option>
<option value="化工学院">化工学院</option>
<option value="食品科学与工程学院">食品科学与工程学院</option>
<option value="外国语学院">外国语学院</option>
<option value="媒体技术与艺术系">媒体技术与艺术系</option>
<option value="生命科学与技术学院">生命科学与技术学院</option>
<option value="马克思主义学院">马克思主义学院</option>
<option value="基础学部">基础学部</option>
<option value="基础与交叉科学研究院">基础与交叉科学研究院</option>
<option value="实验学院">实验学院</option>
<option value="其他学院">其他学院</option>
</select>
</div></div>
<div align="center">
	<input class="btn" type="submit" value="注册"/>     
</div>

</div>
</form>
		<script src="jquery-1.11.1.min.js"></script>
		<script src="bootstrap.min.js"></script>
</body>
</html>