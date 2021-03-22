<%--
  Created by IntelliJ IDEA.
  User: Денис
  Date: 22.03.2021
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Operations</title>
</head>
<body>
    <c:forEach var="operation" items="${list}">
        ${operation}
    </c:forEach>
</body>
</html>
