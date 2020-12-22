<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'updatehw.jsp' starting page</title>
    
	
  </head>
  <!-- private Integer id;
	private Classes classes;
	private School school;
	private String password;
	private String name;
	private String studentId;
 -->
  <body>
  <form action="${pageContext.request.contextPath }/upsture.action" method="post">
     学生名字：<input type="text" name="name"><br>
     学生密码：<input  type="text" name="password"><br>
      学号:<input type="text" name="studentId"><br>
     <input type="submit"  value="修改">
</form>
</body>
</html>
