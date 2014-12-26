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
  <div class="container">
<s:action name="orderDisAction" executeResult="true">
</s:action>
  <h4 class="page-header" align="center">本场馆预订情况</h4>
    <div class="container">
    <table class="table table-bordered">
    <thead>
    <tr>
    	<td><div align="center">预订人</div></td>
    	<td><div align="center">预订时间</div></td>
    	<td><div align="center">删除订单</div></td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#session.information">
    <s:if test="userName!=null">
	  <tr>
         <td><div align="center"><s:property value="userName"></s:property></div></td>
         <td><div align="center"><s:property value="booktime"></s:property></div></td>
         <td><div align="center"><s:a href="deleteBookAction.action?userName=%{userName}" onclick="return confirm('你确定要删除该订单吗？');">删除</s:a></div>
      </tr>
   </s:if>
   </s:iterator>
    </tbody>
    </table>
    </div>
  </div>
		<script src="jquery-1.11.1.min.js"></script>
		<script src="bootstrap.min.js"></script>
  </body>
</html>
