<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

     
<c:if test="${sessionScope.MEMBERID != null}">
	<% response.sendRedirect("main.jsp"); %>
</c:if>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="메인페이지">
	<meta name="author" content="J.Y.Park">
	<title>Easy Mark</title>
</head>
<body>

	<!-- header -->
	<jsp:include page="header.jsp" />
	
	<!-- main section -->
	<section class="wrapper">
      		<div id="header_carousel">
				<div id="myCarousel" class="carousel slide">
					<ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel" data-slide-to="1"></li>
						<li data-target="#myCarousel" data-slide-to="2"></li>
					</ol>
					<!-- Carousel items -->
					<div class="carousel-inner">
						<div class="active item">
							<img style="width:960px; height:197px;" src="http://meghdootlaminart.com/images/inner_banner.jpg" />
						</div>
						<div class="item">
							<img style="width:960px; height:197px;" src="http://visitbeijing.or.kr/minihome_img/guesthouse/gh_top.jpg" />
						</div>
						<div class="item">
							<img style="width:960px; height:197px;" src="http://apamanpower.com/images/solutions-banner.jpg" />
						</div>
					</div>
					<!-- Carousel nav -->
					<a class="carousel-control left" 
						href="#myCarousel"
						data-slide="prev">&lsaquo;</a> 
					<a class="carousel-control right"
						href="#myCarousel" data-slide="next">&rsaquo;</a>
				</div>
			</div>
			<div class="form">
				<div id="form_wrapper" class="form_wrapper">
					<form action="EasyMark?action=login" class="login active" method="POST" name="loginForm">
						<h3>Login</h3>
						<div>
							<label>Username:</label>
							<input type="text" name="userId"/>
							<span class="error">This is an error</span>
						</div>
						<div>
							<label>Password: <a href="forgot_password.html" rel="forgot_password" class="forgot linkform">비밀번호를 까먹었다면?</a></label>
							<input type="password" name="password"/>
							<span class="error">This is an error</span>
						</div>
						<div class="bottom">
							<div class="remember"><input type="checkbox" /><span>Keep me logged in</span></div>
							<input type="button" value="Login" id="loginButton"></input>
							<a href="register.html" rel="register" class="linkform">계정이 없으시다구요? 지금 등록하세요!!</a>
							<a href="#" onclick="me2dayLogin(); return false;" >미투데이 계정으로 로그인하기</a>
							<div class="clear"></div>
						</div>
					</form>
					<form name="registerForm" action="EasyMark?action=register" class="register" method="POST">
						<h3>Register</h3>
						<div class="column">
							<div>
								<label>Username:</label>
								<input type="text" name="userId" id="userId"/>
								<span class="error">This is an error</span>
							</div>
							<div>
								<label>Password:</label>
								<input type="password" name="password" id="password"/>
								<span class="error">This is an error</span>
							</div>
							<div>
								<label>Confirm Password:</label>
								<input type="password" id="confirmPassword"/>
								<span class="error">This is an error</span>
							</div>							
						</div>
						<div class="column">
							<div>
								<label>Email:</label>
								<input type="text" name="email" id="email"/>
								<span class="error">This is an error</span>
							</div>						
							<div>
								<label>First Name:</label>
								<input type="text" name="firstName" id="firstName"/>
								<span class="error">This is an error</span>
							</div>
							<div>
								<label>Last Name:</label>
								<input type="text" name="lastName" id="lastName"/>
								<span class="error">This is an error</span>
							</div>

						</div>
						<div class="bottom">
							<div class="remember">
								<input type="checkbox" />
								<span>Send me updates</span>
							</div>
							<input type="button" value="Register" id="registerButton" />
							<a href="index.html" rel="login" class="linkform">이미 계정이 있으시다구요? 로그인하러 가기</a>
							<a href="#" onclick="me2dayRegister(); return false;" >미투데이 계정으로 등록하기</a>
							<div class="clear"></div>
						</div>
					</form>
					<form class="forgot_password">
						<h3>Forgot Password</h3>
						<div>
							<label>Username or Email:</label>
							<input type="text" />
							<span class="error">This is an error</span>
						</div>
						<div class="bottom">
							<input type="submit" value="Send reminder"></input>
							<a href="index.html" rel="login" class="linkform">로그인하러 가기</a>
							<a href="register.html" rel="register" class="linkform">계정이 없으시다구요? 지금 등록하세요!!</a>
							<div class="clear"></div>
						</div>
					</form>
				</div>
			</div>
		</section>
		
		
		<script src="js/jquery.js"></script>
	    <script src="js/index/bootstrap.min.js"></script>
		<script src="js/form/conversion.js"></script>
		<script src="js/httpRequest.js"></script>
		<script src="js/util/Util.js"></script>
		<script src="js/form/main.js"></script>
</body>
</html>