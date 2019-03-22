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

<h3>Calculator</h3>

<form action="<%=cp%>/user5/calc" method="post">
<p>
	<input type="text" name="num1" size="5">
	<select name="oper">
		<option value="+">plus</option>
		<option value="-">subtract</option>
		<option value="*">multiply</option>
		<option value="/">division</option>
	</select>
	<input type="text" name="num2" size="5" >
	<button>calculate</button>
</p>

</form>

</body>
</html>