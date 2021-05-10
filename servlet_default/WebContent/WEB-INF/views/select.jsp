<%@page import="com.servlet.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
	MemberVO member = (MemberVO)request.getAttribute("member");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	function up(){
		location.href="update?memId=<%=member.getMemId() %>";
	}
	function dl(){
		
		location.href="delete?memId=<%=member.getMemId() %>";
	}
	function goBack(){
		history.go(-1);
	}
</script>
</head>
<body>
	<table>
		<tr>
			<th>아이디</th>
			<th>전화번호</th>
			<th>이메일</th>
		</tr>
		<tr>
			<td><%=member.getMemId() %></td>
			<td><%=member.getMemPh() %></td>
			<td><%=member.getMemMail() %></td>
		</tr>
	</table>
	<input type="button" value="수정하기" onclick="up()">
	<input type="button" value="삭제하기" onclick="dl()">
	<input type="button" value="뒤로가기" onclick="goBack()">
</body>
</html>