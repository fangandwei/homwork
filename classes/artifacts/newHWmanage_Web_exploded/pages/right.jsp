<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
	<table class="table">
    <thead class="thead-dark">
      <tr>
        <th>我的作业</th>
        <th>完成情况</th>
        <th>我的答案</th>
      </tr>
    </thead>
		<tbody>
           <s:iterator value="#session.homeworks" var="list">
		<tr>
			
				<td><s:property value="#list.name" /></td>
				<s:if test="#list.state==1">
				<td>已经完成</td>
				</s:if>
				<s:if test="#list.state!=1">
				<td>未完成</td>
				</s:if>
			    <td><s:property value="#list.text1" /></td>
		</tr>
          </s:iterator>
          </tbody>
	</table>

	</body>
</html>
