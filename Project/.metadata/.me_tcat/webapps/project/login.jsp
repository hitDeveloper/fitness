<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML>
<html>
<head>
<title>登录界面</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="bootstrap.min.css" rel="stylesheet" type="text/css" media="screen">
	<link href="bootstrap-responsive.min.css" rel="stylesheet" type="text/css">
</head>
<body>
<form action="userLoginAction" method="post">
<div class="container">
<h1 class="page-header">哈工大健身网<img src="image/logo.jpg"></h1>
<ul class="nav nav-pills">
<li class="active"><a href="#login" data-toggle="tab">用户登录</a></li>
<li><a href="#admin" data-toggle="tab">管理员登录</a></li>
</ul>
<br /><br /><br /><br /><br /><br /><br /><br />
<div class="tab-content">
<div class="tab-pane active" id="login">
<div align="center"><font face="新宋体" color="#0000FF">
<h4><strong> 欢迎登录</strong></h4>
</font></div>
<div align="center">
      <table align="center" width="390">
	    <tr align="center">
		</tr>
        <tr align=center>
        	<td width="72" align="right">用户名</td>
        	<td width="310"><input type="text" name="userName">
        	</td>
        </tr>
        <tr align=center>
        	<td width="72" align="right">密码</td>
        	<td width="310"><input type="password" name="password"></td>
        </tr>
        <tr align=center>
        <td height="35" colspan="2">
        <div align="center">
          <input class="btn" type="submit" value="登 录"/>     
          <input type="button" class="btn" value="注 册" onClick="javascript:location.href='register.jsp'"/>
        </div>
        </td>
        </tr>
      </table>
      <s:property value="information"/>
   </div>
</div>


<div class="tab-pane" id="admin">
<div align="center"><font face="新宋体" color="#0000FF"><h4><strong>欢迎登录</strong></h4></font></div>
<div align="center">
      <table  align="center" width="390">
	    <tr align="center">
		</tr>
        <tr align=center>
        	<td width="72" align="right">管理员</td>
        	<td width="310"><input type="text" name="adminName">
        	</td>
        </tr>
        <tr align=center>
        	<td width="72" align="right">密码</td>
        	<td width="310"><input type="password"  name="password">
        	</td>
        </tr>
        <tr align=center>
        <td height="35" colspan="2">
        <div align="center">
          <input class="btn" name="提交" type="submit" value="登 录"/>     
        </div>
        </td>
        </tr>
      </table>
      <s:property value="information"/>
   </div>
</div>
</div>
</div>
</form>
		<script src="jquery-1.11.1.min.js"></script>
		<script src="bootstrap.min.js"></script>
</body>
</html>
