$(document).ready(function(){
	init();
	$('#userId').focusin(userIdFocusIn);
	$('#userId').focusout(userIdFocusOut);
	
	$('#confirmPassword').focusout(confirmPasswordFocusOut);
	
	$('#registerButton').click(registerButtonClicked);
	$('#loginButton').click(loginButtonClicked);
});

var init = function(){
	$('#registerButton').attr('disabled', 'disabled');
};


var userIdFocusIn = function(){
	var $userId = $(this);
	$userId.next().css('visibility', 'hidden');
	$userId.next().css('visibility', 'visible').css('color', 'blue').text('아이디를 입력하세요.');
};

var userIdFocusOut = function(){
	var $userId = $(this);
	if($userId.val() == ''){
		$userId.next().css('visibility', 'visible').text('아이디를 입력해주세요.	');
	}else{
		$userId.next().css('visibility', 'hidden');
		var params = "userId=" + $userId.val();
		sendRequest('EasyMark?action=check', params, function(){
			
			if(httpRequest.readyState == 4){
				if(httpRequest.status == 200){
					var response = httpRequest.responseText;
					var result = JSON.parse(response).result;
					if(result == 'true'){
						$userId.next().css('visibility', 'visible').css('color', 'blue').text('중복된 아이디입니다.');
					}else if(result == 'false'){
						$userId.next().css('visibility', 'visible').css('color', 'blue').text('가입이 가능한 아이디입니다.');
						$('#registerButton').removeAttr('disabled');
					}
				}
			}
			
		}, "POST");
	}
};

var registerButtonClicked = function(){
	var $userId = $('#userId');
	var $password = $('#password');
	var $confirmPassword = $('#confirmPassword');
	var $email = $('#email');
	var $firstName = $('#firstName');
	var $lastName = $('#lastName');
	
	if($userId.val() == ''){
		alert("아이디를 입력하세요");
		$userId.focus();
		return;
	}else if($password.val() == ''){
		alert("비밀번호를 입력하세요.");
		$password.focus();
		return;
	}else if($confirmPassword.val() == ''){
		alert("비밀번호를 한 번 더 입력하세요.");
		$confirmPassword.focus();
		return;
	}else if($password.val() != $confirmPassword.val()){
		alert("비밀번호를 올바르게 입력해야 합니다.");
		$confirmPassword.focus();
		return;
	}else if($email.val() == ''){
		alert("이메일 주소를 입력하세요.");
		$email.focus();
		return;
	}else if($firstName.val() == ''){
		alert("성을 입력하세요.");
		$firstName.focus();
		return;
	}else if($lastName.val() == ''){
		alert("이름을 입력하세요.");
		$lastName.focus();
		return;
	}else{
		document.registerForm.submit();	
	}
};

var confirmPasswordFocusIn = function(){
	console.log('confirmPasswordFocusIn()');
	$confirmPassword.next().css('visibility', 'hidden');
};

var confirmPasswordFocusOut = function(){
	console.log('confirmPasswordFocusOut()');
	var $password = $('#password');
	var $confirmPassword = $('#confirmPassword');
	
	if($password.val() != $confirmPassword.val()){
		$confirmPassword.next().css('visibility', 'visible').css('color', 'blue').text('비밀번호가 다릅니다.');
	}else if($password.val() == $confirmPassword.val()){
		$confirmPassword.next().css('visibility', 'hidden');
	}
};

var loginButtonClicked = function(){
	document.loginForm.submit();
};

var me2dayRegister = function(){
	$.ajax({
		url: 'Proxy/proxy.jsp',
		dataType:'json',
		data: {
				url: 'http://me2day.net/api/get_auth_url.json?akey=acf3c1a58ff4366e4dadbe67378c7af2',
	   		  }
	}).done(function(data){
		location.href = data.url;
	});
};

var me2dayLogin = function(){
	$.ajax({
		url: 'Proxy/proxy.jsp',
		dataType:'json',
		data: {
				url: 'http://me2day.net/api/get_auth_url.json?akey=8d41ef461f4c6e08dc8e235c2337db37',
	   		  }
	}).done(function(data){
		location.href = data.url;
	});
};