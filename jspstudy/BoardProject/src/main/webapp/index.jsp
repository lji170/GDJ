<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>

	<div>
	<a href="${contextPath}/free/list.jsp">작성하러 가기</a>
	</div>
	
	<div>
		<table border="1">
			<thead>
				<tr>
					<td>게시글번호</td>
					<td>제목</td>
					<td>작성자</td>
					<td>조회수</td>
					<td>삭제</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${free}" var="free.no">
					<tr>
						<td>${free.frees_no}</td>
						<td><a href="${contextPath}/free/detail.jsp?free_no=${f.freeNo}">${free.title}</a></td>
						<td>${free.writer}</td>
						<td>${free.content}</td>
						<td>${free.ip}</td>
						<td>${free.hit}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>