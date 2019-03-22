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

<h3>Hobby</h3>

<form action="<%=cp%>/user6/request" method="post">
	<p>
		<input type="text" name="name" size="5">
	</p>
	<p>
		<select name="hobby" multiple="multiple">
			<option value="movie">movie</option>
			<option value="music">music</option>
			<option value="sleep">sleep</option>
			<option value="game">game</option>
		</select>
	</p>
	<button>submit</button>
</form>

</body>
</html>