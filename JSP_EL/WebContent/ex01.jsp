<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.MemberVO.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
	List<MemberVO> memList = new ArrayList<MemberVO>();
	for(int i = 1; i < 11; i++){
		MemberVO member = new MemberVO("id"+i, "password", "010-1212-3434", "mail"+i+"@mail.com");
		memList.add(member);
	}

	pageContext.setAttribute("memList", memList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>id</th>
				<th>ph</th>
				<th>mail</th>
			</tr>
		</thead>
		<tbody>
		<%
			if(memList != null) for(MemberVO member : memList){
				pageContext.setAttribute("member", member);
				%>
			<tr>
				<td>${member.id }</td>
				<td>${member.ph }</td>
				<td>${member.mail }</td>
			</tr>
				<%
			}
		%>
		</tbody>
	</table>
</body>
</html>