<%--
  Created by IntelliJ IDEA.
  User: gzy
  Date: 2019/12/13
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="/updateServlet" method="post">
        <input value="${title}" name="title">
        <input value="${date}" name="date">
        <input value="${content}" name="content">
        <button>确认修改</button>
    </form>
<%--    <a href="/updateServlet?title=${title}">确认修改</a>--%>
</div>
</body>
</html>
