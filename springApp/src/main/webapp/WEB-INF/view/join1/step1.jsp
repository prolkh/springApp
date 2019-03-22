<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String cp=request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{font-family:consolas;}
</style>
</head>
<body>


<form action="<%=cp%>/join1/step1/" method="post">
<p>name : <input type="text" name="name" value="${user.name}"><br>
<p>email: <input type="text" name="email" value="${user.email}"><br>
<p><button>next step</button></p>
<p>${msg}</p>
</form>



</body>
</html>