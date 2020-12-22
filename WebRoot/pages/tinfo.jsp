<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>按钮</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>		
	</head>
	<body>
		
		<div class="jumbotron text-center">
  <h1>老师的个人信息</h1>
</div>
 
<div class="container">
    <div class="text-center" >
    	<table class="table table-hover">
    <thead>
      <tr>
        <th>学校</th>
        <th>名字</th>
        <th>班级(如果你是班主任)</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td><s:property value="#session.tinfo[0].schoolname"/></td>
        <td><s:property value="#session.tinfo[0].name"/></td>
        <td><s:property value="#session.tinfo[0].classid"/></td>
      </tr>
     
    </tbody>
</table>
    </div>
    
</div>
	</body>
</html>
