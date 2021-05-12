<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>

<%
	pageContext.setAttribute("msg", "pageContext");
	request.setAttribute("msg", "request");
	session.setAttribute("msg", "session");
	application.setAttribute("msg", "application");
%>

<h1>${param.msg }</h1>