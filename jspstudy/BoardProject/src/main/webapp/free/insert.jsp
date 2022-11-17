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

$(document).ready(function(){
	
	
	
	$('#btn_add').click(function(event){
		if(confirm('게시글이 등록되었습니다.?')){
			location.href = '${contextPath}/free/add.do?FreeNo=${free.freeNo}';
		} else {
			alert('취소되었습니다.');
		}
	});
	
	$('#btn_list').click(function(event){
		location.href = '${contextPath}/free/list.jsp';
	});
	
});


</script>
</head>
</html>