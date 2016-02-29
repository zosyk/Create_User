<%--
  Created by IntelliJ IDEA.
  User: Alekcandr
  Date: 2/28/2016
  Time: 1:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.servletContext.contextPath}/views/user/CreateUser.jsp"> Add USER</a>
<table border="1">
<tr>
    <td>Login and Email</td>
    <td>Actions</td>
</tr>
<c:forEach items="${users}" var="user" varStatus="status">
    <tr valign="top">
        <td>${user.login} ${user.email}</td>
        <td>
            <a href="${pageContext.servletContext.contextPath}/user/edit?id=${user.id}">Edit</a>
            <a href="${pageContext.servletContext.contextPath}/user/delete?id=${user.id}">Delete</a>

        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
