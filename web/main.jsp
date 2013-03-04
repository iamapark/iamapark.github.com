<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!-- 로그인 상태가 아닐 경우 index.html로 넘겨버린다. -->
	<c:if test="${sessionScope.MEMBERID == null}">
		<% response.sendRedirect("index.jsp"); %>
	</c:if>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>${sessionScope.MEMBERID}님 개인페이지</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="개인 페이지">
	<meta name="author" content="J.Y.Park">
</head>
<body>
	
	<!-- header -->
	<jsp:include page="header.jsp" />

	<section class="wrapper">
	
		개인 페이지
		
	</section>
	
</body>
</html>