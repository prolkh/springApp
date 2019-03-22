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

<form action="<%=cp %>/demo3/request" method="post">
name : <input type="text" name="name"><br>
age  : <input type="text" name="age"><br>
hobby: <label><input type="checkbox" name="hobby" value="game">game</label>
	   <input type="checkbox" name="hobby" value="movie" id="movie"><label for="movie">movie</label>
	   <input type="checkbox" name="hobby" value="music" id="music"><label for="music">music</label>
	   <br>
	<button>send</button>
</form>

</body>
</html>