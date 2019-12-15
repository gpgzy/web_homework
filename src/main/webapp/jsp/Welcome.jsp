<%--
  Created by IntelliJ IDEA.
  User: gzy
  Date: 2019/12/12
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>管理员登录成功</h1>
<div>
    <p>
        <c:forEach items="${news}" var="n">
            <a href="/getServlet?title=${n.title}"> ${n.title}  ${n.date}</a>
            <%--        <p>${n.content}</p>--%>
            <a href ="/updateServlet?title=${n.title}">修改</a>
            <br>
        </c:forEach>
    </p>

</div>

<a href="/jsp/addnews.html">增加一条新闻</a>
<a href=".html"></a>

</html>
