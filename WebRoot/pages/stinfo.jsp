<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
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
<!-- 展示学生-->
<%--    <s:property value="hwlist"/> --%>
<table class="table">
    <thead class="thead-dark">
    <tr>
        <th>学生id</th>
        <th>密码</th>
        <th>名字</th>
        <th>学号</th>
        <th>操作</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#session.students" var="list" status="index">
        <tr>
            <td><s:property value="#list.id"/></td>
            <td><s:property value="#list.password"/></td>
            <td><s:property value="#list.name"/></td>
            <td><s:property value="#list.studentId"/></td>
            <td><a href="${pageContext.request.contextPath }/upstu.action?id=${sessionScope.students[index.index].id}">修改</a>
            </td>
            <td><a href="${pageContext.request.contextPath }/delstu.action?id=${sessionScope.students[index.index].id}">删除</a>
            </td>
        </tr>
    </s:iterator>
    </tbody>
</table>


</body>
<script>


</script>

</html>