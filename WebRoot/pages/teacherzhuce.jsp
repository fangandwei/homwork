<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>按钮</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>		
	</head>
	<body class="container">
	<s:fielderror ><s:property value="error"/></s:fielderror>
<form class="form-row" action="${pageContext.request.contextPath }/Tzhuce.action" method="post" style="margin-top: 20px">
  <label for="email"> 姓名：</label>
  <input name="name" type="text" class="form-control" id="email">
   
   <label for="email2"> 密码：</label>
  <input name="password" type="password" class="form-control" id="email2">
 
<label for="email3"> 班级：(班主任才填)</label>
   <select name="classess" class="form-control" id="email3">
      <option>1501</option>
      <option>1502</option>
      <option>1503</option>
      <option>1504</option>
      <option>1505</option>
      <option>1506</option>
      <option>1507</option>
      <option>1508</option>
      <option>1509</option>
      <option>1510</option>
      <option>1511</option>
   </select>
  <label for="email6"> 你的学校：</label>
  <select  name="schooll" class="form-control" id="email6">
     <option id="1">山西农业大学</option>
     <option id="2">山西师范大学</option>
  </select> 
<button type="submit" class="form-control btn btn-success">注册</button>
  </form>
</html>