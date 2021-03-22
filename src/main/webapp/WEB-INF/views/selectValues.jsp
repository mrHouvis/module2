<%--
  Created by IntelliJ IDEA.
  User: Денис
  Date: 22.03.2021
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Select values</title>
</head>
<body>

    <form:form action="selectValues" method="post">
        <table>
            <tr>
                <td>X=</td>
                <td><form:input path="x" /></td>
            </tr>
            <tr>
                <td>Y=</td>
                <td><form:input path="y" /></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>

</body>
</html>
