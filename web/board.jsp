<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!-- 로그인 상태가 아닐 경우 index.jsp로 넘겨버린다. -->
	<c:if test="${sessionScope.MEMBERID == null}">
		<% response.sendRedirect("index.jsp"); %>
	</c:if>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>${sessionScope.MEMBERID} - 게시판</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="게시판 페이지">
	<meta name="author" content="J.Y.Park">
</head>
<body>

	<!-- header -->
	<jsp:include page="header.jsp" />
	
	<section class="wrapper">
		게시판이 들어갈 자리
	</section>
</body>
</html>