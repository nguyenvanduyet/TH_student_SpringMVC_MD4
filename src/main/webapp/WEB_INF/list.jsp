<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 02/03/2021
  Time: 10:12 SA
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> danh sách sinh viên</h1>
<form method="post" action="/student/search">
    <input type="text" name="name" placeholder="enter name">
    <input type="submit" value="search">

</form>
<h2><a href="/student/create">Create</a></h2>
<table>
    <tr>
        <td>Name</td>
        <td>Address</td>
        <td>Age</td>
    </tr>
    <c:forEach items="${list}" var="s">
    <tr>
        <td>${s.name}</td>
        <td>${s.address}</td>
        <td>${s.age}</td>
        <td><a href="/student/edit/${s.id}">edit</a></td>
        <td><a href="/student/delete/${s.id}">delete</a></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
