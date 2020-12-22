<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags"  prefix="s"%>
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

	
<!-- 老师-->
  <!--  private Integer id;
	private String name;
	private String password;
	 -->
<%--    <s:property value="hwlist"/> --%>
   <table class="table">
    <thead class="thead-dark">
      <tr>
        <th>老师id</th>
        <th>老师名字</th>
        <th>密码</th>
        <th>操作</th>
        <th></th>
      </tr>
    </thead>
		<tbody>
           <s:iterator value="#session.teachers" var="list"  status="index">
		<tr>
				<td><s:property value="#list.id" /></td>
			        <td><s:property value="#list.name" /></td>
			          <td><s:property value="#list.password" /></td>
<td><a href="${pageContext.request.contextPath }/uptea.action?id=${sessionScope.teachers[index.index].id}">修改</a></td>
<td><a href="${pageContext.request.contextPath }/deltea.action?id=${sessionScope.teachers[index.index].id}">删除</a></td>
		</tr>
          </s:iterator>
          </tbody>
	</table>



</body>
</html>