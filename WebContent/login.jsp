<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post" >

UserName : <input type="text" name="uname"> <br> <br> 

Password : <input type="text" name="uname"> <br> <br> 

<input type="submit" name="login" value="login"> <br> <br> 
</form>
</body>
</html>