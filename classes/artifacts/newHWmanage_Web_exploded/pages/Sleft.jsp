<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>left</title>
  <script type="text/javascript" src="../js/dtree.js"></script>

</head>
<body background="${pageContext.request.contextPath}/img/left.jpg">
    <a href="${pageContext.request.contextPath }/glzy.action" target="Sright.jsp">
        管理作业</a><br>
    <br>
    <br>
    <br>
   <a href="${pageContext.request.contextPath }/glxs.action" target="Sright.jsp">管理学生</a>
     <br>
    <br>
    <br>
    <br>
    <!-- 查看自己的个人信息 -->
     <a href="${pageContext.request.contextPath }/glls.action" target="Sright.jsp">管理老师</a>

</body>
</html>