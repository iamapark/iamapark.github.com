<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!-- �α��� ���°� �ƴ� ��� index.html�� �Ѱܹ�����. -->
	<c:if test="${sessionScope.MEMBERID == null}">
		<% response.sendRedirect("index.jsp"); %>
	</c:if>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>${sessionScope.MEMBERID}�� ����������</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="���� ������">
	<meta name="author" content="J.Y.Park">
</head>
<body>
	
	<!-- header -->
	<jsp:include page="header.jsp" />

	<section class="wrapper">
	
		���� ������
		
	</section>
	
</body>
</html>