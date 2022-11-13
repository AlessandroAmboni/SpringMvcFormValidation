<%--
  Created by IntelliJ IDEA.
  User: ale
  Date: 11/13/22
  Time: 6:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Title</title>
  <style>
    .error {
      color: red;
    }
  </style>
</head>
<body>
  <form:form action="processForm" modelAttribute="client">
    First name: <form:input path="name"/>
    <form:errors path="name" cssClass="error"/>
    <hr>
    Disponibility: <form:input path="disponibility"/>
    <form:errors path="disponibility" cssClass="error"/>
    <hr>
    Problem: (*) <form:input path="problem"/>
    <form:errors path="problem" cssClass="error"/>
    <br>
    <input type="submit" value="Submit"/>
  </form:form>
</body>
</html>
