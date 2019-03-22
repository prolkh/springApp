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

<form action="<%=cp%>/demo6/request" method="post">
i d :<input type="text" name="id"><br>
pwd :<input type="text" name="pwd"><br>
name:<input type="text" name="name"><br>
member-type :
	<select name="memberType">
		<c:forEach var="t" items="${memberTypes}">
			<option value="${t}">${t}</option>
		</c:forEach>
	</select>
	<br>
Education : 
	<select name="hak">
		<c:forEach var="h" items="${haks}">
			<option value="${h}">${h}</option>
		</c:forEach>
	</select>
	<br>
<button>submit</button>
</form>

</body>
</html>