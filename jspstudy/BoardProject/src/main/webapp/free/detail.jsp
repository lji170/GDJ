<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../assets/js/jquery-3.6.1.min.js"></script>
<script>
	
		$('#btn_list').click(function(event){
			location.href = '${contextPath}/free/list.jsp';
		});

</script>
</head>
<body>

		<h1>${free.title}</h1>
	<pre>${free.content}</pre>
	
	
	<hr>
	
	<div>
		<input type="button" value="수정" id="btn_edit">
		<input type="button" value="목록" id="btn_list">
		
	</div>	
</body>
</html>