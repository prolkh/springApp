<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String cp=request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
	font-family:consolas;
}
</style>
</head>
<body>

<form action="<%=cp%>/demo7/request" method="post">
i d :<input type="text" name="id"><br>
pwd :<input type="password" name="pwd"><br>
name:<input type="text" name="name"><br>
age :<input type="text" name="age"><br>
<br>
<button>send</button>
</form>

</body>
</html>