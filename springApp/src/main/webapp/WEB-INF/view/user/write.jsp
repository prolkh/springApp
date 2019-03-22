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
</head>
<body>

<form action="<%=cp%>/user/write" method="post">
	<p>name : <input type="text" name="name"></p>
	<p>age  : <input type="text" name="age"></p>
	<p><button type="submit" style="padding:4px;">submit</button>
</form>

</body>
</html>