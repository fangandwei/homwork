<%@page import="java.util.*"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>

		<meta charset="UTF-8">
		<title>按钮</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
		<style>


			ul{

				list-style: none;

			}


		</style>


  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

	</head>
		<body class="container">
	<!-- 查老师信息   查出来放在学生注册页面 -->
		<%
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql:///test";
		String user = "root";
		String password = "1234";
		Connection c = DriverManager.getConnection(url, user, password);
		PreparedStatement pre = c.prepareStatement("select * from tea");
	    PreparedStatement pre2 = c.prepareStatement("select * from stu");
		
		ResultSet rs = pre.executeQuery();
		ResultSet rs2= pre2.executeQuery();
		ArrayList namelist=new ArrayList();
	    ArrayList namelist2=new ArrayList();
		while (rs.next()) {
			String name = rs.getString("name");
			namelist.add(name);
		}
			while (rs2.next()) {
			String name = rs2.getString("name");
			namelist2.add(name);
		}
		
		request.setAttribute("namelist", namelist);
		request.setAttribute("namelist2", namelist2);
	%>
	<!--动态添加 checkbox-->
	<script type="text/javascript">
	var data = new Array();
	var data2 = new Array();
	 <%  ArrayList list=(ArrayList)request.getAttribute("namelist");
	   
	     
	       for(int i=0;i<list.size();i++){%>
	              data[<%=i%>] = '<%=list.get(i)%>';
	              
	      <%}
%> 
	 <%  ArrayList list2=(ArrayList)request.getAttribute("namelist2");
	   
	     
	       for(int i=0;i<list2.size();i++){%>
	              data2[<%=i%>] = '<%=list2.get(i)%>';
	              
	      <%}
%> 
window.onload=function(){
     var mydiv=      document.getElementById("mydiv");
     var mydiv2=      document.getElementById("mydiv2");
    var ul=document.createElement("ul");
     var ul2=document.createElement("ul");
    for(var i=0;i<data.length;i++){
        // 加入复选框
        var checkBox=document.createElement("input");
        
        checkBox.setAttribute("type","checkbox");
        checkBox.setAttribute("name", "teachers");
        checkBox.setAttribute("value", data[i]);

        var li=document.createElement("li");
        li.appendChild(checkBox);        
        li.appendChild(document.createTextNode(data[i]));
        ul.appendChild(li);        
    } 
        for(var i=0;i<data2.length;i++){
        // 加入复选框
        var checkBox=document.createElement("input");
        
        checkBox.setAttribute("type","checkbox");
        checkBox.setAttribute("name", "students");
        checkBox.setAttribute("value", data2[i]);

        var li2=document.createElement("li");
        li2.appendChild(checkBox);        
        li2.appendChild(document.createTextNode(data2[i]));
        ul2.appendChild(li2);        
    }    

    mydiv.appendChild(ul);
    mydiv2.appendChild(ul2); 

}
</script>

	<!--<form  class="form-row"  action="tfabuzuoye.action" method="post">
		 作业名字：<input type="text" name="hname"><br> 
		 作业内容：<textarea rows="20" cols="100" name="htext"></textarea><br><br><br>
	       你是哪位老师？请选择：<br><br>
          <div id="mydiv"></div>
	     你的学生为？请选择：
	   <div id="mydiv2"></div>
	   <input type="submit" value="发布作业">
	</form>-->
	
	<form class="form-row" action="tfabuzuoye.action" method="post">
  <label for="email"> 作业名字：</label>
  <input name="hname" type="text" class="form-control" id="email">
  <label for="pwd">作业内容：</label>
  <textarea name="htext" type="password" class="form-control" id="pwd">
  </textarea>
  
  <label for="email1"> 你是哪位老师？请选择：</label>
  <div id="mydiv" id="email1"></div>

   <label for="email2">  你的学生为？请选择：</label>
  <div id="mydiv2" id="email2"></div>
  <button type="submit" class="form-control btn btn-success">发布作业</button>
</form>
	
	
</body>
</html>
