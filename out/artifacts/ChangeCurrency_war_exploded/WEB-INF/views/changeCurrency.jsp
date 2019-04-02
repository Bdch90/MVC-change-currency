<%--
  Created by IntelliJ IDEA.
  User: Trangs
  Date: 4/2/2019
  Time: 9:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action = "/changeCurrency">
    <h1>Change currency</h1>
    <label>VND : </label>
    <input name = "vnd" type="text">
    <button type="submit">Change</button>
    <label> USD : ${usd}</label>
</form>
</body>
</html>
