<%--
  Created by IntelliJ IDEA.
  User: ale
  Date: 11/12/22
  Time: 8:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName"/>
        <hr>
        Last name: <form:input path="lastName"/>
        <hr>
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>
