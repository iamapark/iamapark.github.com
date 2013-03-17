#Bootstrap으로 실습하는 홈페이지입니다.

##<구현한 기능>
1. 회원가입 기능
2. 로그인 기능
3. 미투데이 계정으로 회원가입
4. 미투데이 계정으로 로그인

##<개발 환경>
Tomcat 6.0
Java 1.6
Eclipse
CUBRID

##<설치 순서>
1. github에서 다운받고난 후, CUBRID에 edudb라는 데이터베이스를 생성해야 합니다.
2. WEB-INF/sql 폴더에 있는 sql 파일들을 edudb에서 실행시킵니다.
3. Tomcat 6.0 환경에서 실행합니다.

##<메인 페이지 화면>
<img src="http://farm9.staticflickr.com/8104/8520278327_1a4f51c65e_c.jpg" />


<script src="http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
<script src="http://code.jquery.com/jquery-1.8.2.min.js"></script>
<script src="http://cdn.oesmith.co.uk/morris-0.4.1.min.js"></script>

<div id="donut-example"></div>

<script>
  Morris.Donut({
  element: 'donut-example',
  data: [
    {label: "Download Sales", value: 12},
    {label: "In-Store Sales", value: 30},
    {label: "Mail-Order Sales", value: 20}
  ]
});
</script>
