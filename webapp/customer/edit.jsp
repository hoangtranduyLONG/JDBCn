<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 27/05/2022
  Time: 8:30 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <input type="text" name="id" value="${customer.id}">
    <input type="text" name="name" value="${customer.name}">
    <input type="number" name="age" value="${customer.age}">
    <input type="submit" value="sửa">
</form>
</body>
</html>
