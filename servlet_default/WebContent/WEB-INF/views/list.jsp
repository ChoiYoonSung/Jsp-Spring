<%@page import="com.servlet.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
	List<MemberVO> memList = (List<MemberVO>)request.getAttribute("memList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	function joinMember(){
		location.href='<%=request.getContextPath() %>/join';
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
		<%
		if(memList != null){
			
		for(int i = 0; i < memList.size(); i++){
			%>
		<tr>
			<td><a href="select?memId=<%=memList.get(i).getMemId() %>"><%=memList.get(i).getMemId() %></a></td>
			<td><%=memList.get(i).getMemPh() %></td>
			<td><%=memList.get(i).getMemMail() %></td>
		</tr>
			<%
			}
		}else{
			%>
		<tr>
			<td><h3>회원이 없습니다.</h3></td>
		</tr>
			<%
		}
		%>
	</table>
	<input type="button" value="가입하기" onclick="joinMember()">
</body>
</html>