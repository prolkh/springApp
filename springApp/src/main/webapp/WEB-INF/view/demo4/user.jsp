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

<a href="<%=cp %>/header/result">okay</a>

<!-- 파라미터 자동 인코딩이 가능한 c:url -->
<a href='<c:url value="/header/result"/>'>okay</a>

<c:url var="url" value="/header/result">
	<c:param name="name" value="자바"/>
</c:url>
<a href='${url}'>okay</a><br><br>

<a href='${url}'>header get</a> <br>

<a href="<%=cp%>/cookie/set">cookie set</a><br>
<a href="<%=cp%>/cookie/get">cookie get</a><br>

</body>
</html>