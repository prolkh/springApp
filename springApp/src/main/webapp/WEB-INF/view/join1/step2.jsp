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


<form action="<%=cp%>/join1/step2/" method="post">
<p>i d : <input type="text" name="id"><br>
<p>pwd : <input type="password" name="pwd"><br>
<p>tel : <input type="text" name="tel"><br>

<p>
	<button type="button" onclick="location.href='<%=cp%>/join1/main';">before</button>
	<button type="submit">Sign Up</button>
</p>
<p>${msg}</p>
</form>

</body>
</html>