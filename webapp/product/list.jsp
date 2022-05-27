<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 26/05/2022
  Time: 3:05 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach var="pro" items="${products}">
    <h2>${pro.id},${pro.name},${pro.price},${pro.categoryId}</h2>
</c:forEach>
</body>
</html>
