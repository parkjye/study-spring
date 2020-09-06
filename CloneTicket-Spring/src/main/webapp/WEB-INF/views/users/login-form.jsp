<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
</head>
<body>
<div class="container">
	<div class="loginWrap" style="width:50%; margin:0 auto;">
		<form action="login.do" method="post">
			<%-- 원래 가려던 목적지 정보를 url 이라는 파라미터 명으로 가지고 간다 --%>
			<input type="hidden" name="url" value="${url }" />
			
			<div class="form-group">
				<input class="form-control" type="text" name="users_id" id="users_id" placeholder="아이디" />
			</div>
			<div class="form-group">
				<input class="form-control" type="password" name="users_pwd" id="users_pwd" placeholder="비밀번호" />
			</div>
			<!--  
			<div class="form-group form-check">
			    <input type="checkbox" class="form-check-input" id="saveUsersId">
			    <label class="form-check-label" for="exampleCheck1">아이디 저장</label>
			</div>-->
			
			<button class="btn btn-outline-primary btn-lg btn-block" type="submit">로그인</button>
		</form>
	</div>
</div><!-- container -->
</body>
</html>