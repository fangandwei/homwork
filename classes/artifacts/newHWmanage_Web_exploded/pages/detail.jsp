<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
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
	<div class="row clearfix">
		<div class="col-md-12 column">
			<form role="form" action="${pageContext.request.contextPath }/catDetail.action" method="post">
				<div class="form-group">
					 <label for="exampleInputEmail1">请输入老师名字</label><input  name="name1" type="text" class="form-control" id="exampleInputEmail1" />
				</div>
				</div> <button type="submit " class="btn btn-success" style="margin-left: 20px;">查询</button>
			</form>
	</div>
	</div>
				<div class="row clearfix">
					
					 <div class="col-md-12 column">
					 	<h1 align="center">老师出的题</h1>
				<form role="form" action="${pageContext.request.contextPath }/tijiao.action" method="post">
				<div class="form-group">
					 <label for="exampleInputEmail1">请在提交前手动输入作业名字</label><input name="hname" type="text" class="form-control" id="exampleInputEmail1" />
				</div>
				<textarea name="textarea" cols="150" rows="10">
        
       <s:property value="#name1"  />
     
       </textarea>
				</div> <button type="submit" class="btn btn-success" style="margin-left: 20px;">提交</button></div>
			</form>
			
			
</div>
	</body>
</html>
