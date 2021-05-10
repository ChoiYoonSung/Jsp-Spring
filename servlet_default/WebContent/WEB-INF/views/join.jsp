<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	function goBack(){
		history.go(-1);
	}
</script>
</head>
<body>
	<form action="join" method="post">
		아이디 : <input type="text" name="memId" value="">
		비밀번호 : <input type="password" name="memPw" value="">
		휴대전화 : <input type="tel" name="memPh" value="">
		이메일 : <input type="email" name="memMail" value="">
		<input type="submit" value="회원가입">
	</form>
		<input type="button" value="뒤로가기" onclick="goBack()">
</body>
</html>