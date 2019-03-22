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

<form action="<%=cp %>/demo2/request" method="post">
name : <input type="text" name="name"><br>
age  : <input type="text" name="age"><br>
hobby: <input type="checkbox" name="hobby[0]" value="game">game
	   <input type="checkbox" name="hobby[1]" value="movie">movie
	   <input type="checkbox" name="hobby[2]" value="music">music<br>
	<button>send</button>
</form>

</body>
</html>