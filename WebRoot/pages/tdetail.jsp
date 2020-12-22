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
	<body style="margin-top: 20px">
  <form action="${pageContext.request.contextPath }/TfinddetailS.action" method="post">
  <div class="input-group mb-3">
    <div class="input-group-prepend">
      <span class="input-group-text">请输入学生名字</span>
    </div>
    <input name="sname" type="text" class="form-control" placeholder="Username">
    <input type="submit" value="查询" />
  </div>
	<table class="table">
    <thead>
      <tr>
        <th>完成情况</th>
        <th>学生答案</th>
      </tr>
    </thead>
    <tbody>
    	<s:iterator value="#session.catdetail" var="list1">
		<tr>
			
				<s:if test="#list1.state==1">
				<td>已经完成</td>
				</s:if>
				<s:if test="#list1.state!=1">
				<td>未完成</td>
				</s:if>
			    <td><s:property value="#list1.mytext" /></td>
		</tr>
          </s:iterator>
      
    </tbody>
  </table>
</form>
	</body>
</html>
