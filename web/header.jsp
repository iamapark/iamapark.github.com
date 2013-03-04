<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
    	
	<!-- Bootstrap -->
    <link href="css/index/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="css/index/main.css" rel="stylesheet" media="screen">
    <link href="css/index/bootstrap-responsive.min.css" rel="stylesheet" media="screen">
    <link rel="stylesheet" type="text/css" href="css/form/form_style.css" />
	<script src="js/form/cufon-yui.js" type="text/javascript"></script>
	<script src="js/form/ChunkFive_400.font.js" type="text/javascript"></script>

<header class="container-narrow">

   <nav class="masthead">
     <ul class="nav nav-pills pull-right">
     
     	<c:choose>
     		<%-- 사용자 로그인 상태일 때 --%>
     		<c:when test="${sessionScope.MEMBERID != null }">
     			<li><a href="main.jsp">${sessionScope.MEMBERID}</a></li>
     			<li><a href="board.jsp">Board</a></li>
				<li><a href="logout.jsp">Logout</a></li>
     		</c:when>
     		
     		<%-- 관리자 로그인 상태일 때 --%>
     		<c:when test="${sessionScope.ADMINID != null }">
     			<li><a href="Admin/index.html">Admin</a></li>
			</c:when>
			
			<%-- 비 로그인 상태일 때 --%>
     		<c:otherwise>
     			<li class="active"><a href="#">Home</a></li>
     		</c:otherwise>
     	</c:choose>
     </ul>
     <h1 class="muted"><a href="">EasyMark</a></h1>
   </nav>
   <hr>
</header>