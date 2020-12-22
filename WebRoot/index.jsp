<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html>
<html>
	<head>
		<title>首页</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
   <link href="${pageContext.request.contextPath}/css/css/signin.css" rel="stylesheet">
  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>		
	</head>
	<body class="text-center">
		 
    <form class="form-signin" action="login.action" method="post">
     
      <img class="mb-4" src="${pageContext.request.contextPath}/img/timg.jpg" alt="" width="100" height="100">
      <h1 class="h3 mb-3 font-weight-normal">请选择身份登录</h1>
        <select class="h3 mb-3" name="select" style="height: 38px">
                  <option id="1">学生登录</option>
                  <option id="2">老师登录</option>
                  <option id="3">管理员登录</option>
        </select>
        <div style="color: red">
         <s:fielderror ><s:property value="error"/></s:fielderror> 
         </div>
      <label class="sr-only">用户名</label>
      <input name="name" type="text" id="inputEmail" class="form-control" placeholder="用户名" required autofocus>
      <label  for="inputPassword" class="sr-only">Password</label>
      <input name="password" type="password" id="inputPassword" class="form-control" placeholder="密码" required>
      <div class="checkbox mb-3">
        <label>
          <input type="checkbox" value="remember-me"> 记住我
        </label>  
      </div>
      <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
      <a href="${pageContext.request.contextPath }/pages/zhuce.jsp">学生注册</a>
   <a  href="${pageContext.request.contextPath }/pages/teacherzhuce.jsp">老师注册</a>
      <!-- 需要维护作业和老师的关系 以及作业与学生的关系-->
   <a  href="${pageContext.request.contextPath}/pages/tfabuzuoye.jsp" target="_blank">发布作业</a>
      <p class="mt-5 mb-3 text-muted">&copy; feng</p>
    </form>
  </body>
</html>
