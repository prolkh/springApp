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
<p>
	<c:forEach var="map" items="${map}" varStatus="status">
		${status.count}번째 수 : 
		<c:forEach var="value" items="${map.value}">
			${value}&nbsp;
		</c:forEach>
		<br>
	</c:forEach>
</p>
</body>
</html>