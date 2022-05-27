<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 25/05/2022
  Time: 9:14 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body id="body">

<h1>Đây là danh sách</h1>

<a href="/customers?act=create">Tạo mới</a>
<c:forEach var="cus" items="${dskh}">
<h2>${cus.id},${cus.name},${cus.age} <a href="/customers?act=edit&id=${cus.id}">Sửa</a></h2>
</c:forEach>
</body>
</html>
