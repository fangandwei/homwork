<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>left</title>

</head>
<body background="${pageContext.request.contextPath}/left.jpg">
      <a href="${pageContext.request.contextPath }/Tfindhmbyname.action" target="teacherright.jsp">查询作业信息</a>
      <br>
      <br>
      <br>
      <a href="${pageContext.request.contextPath}/pages/fabu.jsp" target="teacherright.jsp">修改作业</a>
      <br>
      <br>
      <br>
      <a href="${pageContext.request.contextPath }/pages/tdetail.jsp" target="teacherright.jsp">查询具体学生作业信息</a>
       <br>
    <br>
    <br>
    <!-- 查看自己的个人信息 -->
     <a href="${pageContext.request.contextPath }/tcatinfo.action" target="teacherright.jsp">我的信息</a>
     
</body>
</html>