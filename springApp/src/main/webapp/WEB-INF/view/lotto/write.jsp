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
<script type="text/javascript">
function sendOk() {
	var f= document.lottoForm;
	if(! /^[1-5]{1}$/.test(f.num.value)){
		alert("1~5 number please");
		return;
	}
	
	f.submit();
}

</script>

</head>
<body>

<h3>Lotto</h3>
<form name="lottoForm" action="<%=cp%>/lotto/buy" method="post">
<p>
	lotto count : <input type="text" name="num" size="1">
	<input type="hidden" name="num1">
	<button type="button" onclick="sendOk();">buy</button>
</p>
</form>


</body>
</html>