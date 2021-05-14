<%@page import="com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%!
	public int total(int kor, int eng, int math, int sci, int soc){
		int score = kor + eng + math + sci + soc;
		return score;
	}
%>

<%
	String korParam  = request.getParameter("kor");
	String engParam  = request.getParameter("eng");
	String mathParam  = request.getParameter("math");
	String sciParam  = request.getParameter("sci");
	String socParam  = request.getParameter("soc");
	
	float average = 0.0f;
	try{
		int kor = Integer.parseInt(korParam);
		int eng = Integer.parseInt(engParam);
		int math = Integer.parseInt(mathParam);
		int sci = Integer.parseInt(sciParam);
		int soc = Integer.parseInt(socParam);
		int score = total(kor, eng, math, sci, soc);
		
		average = score/5.0f;

	} catch(ParseException e){
		return;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script type="text/javascript">
	alert('<%=average %>');
</script>
</head>
<body>
</body>
</html>