<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>按钮</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="../css/css/signin.css" />
  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>		
	</head>
	<body class="container-fluid" style="margin-top: 10px;"> 
		<form class="border-top='20px'" role="form" action="${pageContext.request.contextPath }/fabuzuoye.action" method="post">
    <label for="name">作业名称</label>
       <textarea id="name" class="form-control"   name="textarea1" >
         <s:property value="#session.findbyname[0].hname"/>
       </textarea>
		
               <!--作业内容:<br>-->
               <label for="name1">作业内容</label>
       <textarea id="name1" class="form-control"   name="textarea2" cols="100" rows="20">
         <s:property value="#session.findbyname[0].text"/>
       </textarea>
        <input class="form-control btn-success"  type="submit" value="修改作业">
       </form>    
	</body>
</html>
