<%--
  Created by IntelliJ IDEA.
  User: ale
  Date: 11/13/22
  Time: 6:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
    <title>Costumer Confirmation</title>
</head>
<body>
The client is confirmed: <br>
Client: ${client.name} <br>
Phone Number: ${client.phoneNumber} <br>
Disponibility: ${client.disponibility} <br>
Problem: ${client.problem} <br>
TX value: ${client.txValue} <br>
</body>
</html>
