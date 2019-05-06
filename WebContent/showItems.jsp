<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import = "java.io.*,java.util.*,java.sql.*"%>
    <%@ page import = "java.util.ArrayList" %>
    <%@ page import = "java.util.List" %>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList  itemList =(ArrayList) request.getAttribute("itemList");

%>


<table border="1">
    <tr>
        <th>ID</th>
        <th>Type</th>
    </tr>
    <c:forEach items="${itemList}" var="item" >
        <tr>
            <td>${item.id}</td>
            <td>${item.type}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>