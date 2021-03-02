<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 02/03/2021
  Time: 10:39 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
<h2>sửa thông tin sinh viên</h2>
<input type="text" name="name" value="${s.name}">
<input type="text" name="address" value="${s.address}">
<input type="text" name="age" value="${s.age}">
    <button type="submit">edit</button>
</form>

</body>
</html>
