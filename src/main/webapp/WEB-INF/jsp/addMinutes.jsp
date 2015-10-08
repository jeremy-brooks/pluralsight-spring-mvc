<%--
  Created by IntelliJ IDEA.
  User: jbrooks
  Date: 08/10/2015
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>${title}</title>
</head>
<body>
<h1>${title}</h1>
<form:form commandName="exercise">
    <table>
        <tr>
            <td>Minutes exercised for today:</td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Enter exercise"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
