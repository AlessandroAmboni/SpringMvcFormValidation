<%--
  Created by IntelliJ IDEA.
  User: ale
  Date: 11/12/22
  Time: 8:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student Confirmation Page</title>
</head>
<body>
The Student is confirmed: ${student.firstName} ${student.lastName}
<hr>
Country: ${student.country}
<hr>
Favorite Language: ${student.favoriteLanguage}
<hr>
Operating Systems:
<ul>
    <c:forEach items="${student.operatingSystems}" var="os">
        <li>${os}</li>
    </c:forEach>
</ul>
</body>
</html>
