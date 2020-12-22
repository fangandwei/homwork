<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'updatehw.jsp' starting page</title>
    
	
  </head>
  
  <body>
  <form action="${pageContext.request.contextPath }/updatehw.action" method="post">
    作业名称：<input type="text" name="hname"><br>
     作业内容： <textarea  name="text" rows="10" cols="20">
           
        </textarea>
     <input type="submit"  value="修改">
</form>
  </body>
</html>
