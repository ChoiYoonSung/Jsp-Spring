<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style type="text/css">
	*{
		margin:0;
		padding:0;
	}
	header{
		height:150px;
	}
	div#content-wrap{
		height:600px;
		position:relative;
	}
	aside{
		width:300px;
		height:100%;
	}
	section{
		position:absolute;
		left:300px;
		top:0;
		width:100%;
		height:100%;
	}
	footer{
		height:150px;
	}
</style>
</head>

<% request.setAttribute("msg", "from page"); %>
<% String msg = "local variable"; %>
<body>
	<header>
	<jsp:include page="/WEB-INF/views/include/header.jsp">
		<jsp:param value="<%=msg %>" name="msg"/>
	</jsp:include>
	</header>
	<div id="content-wrap">
		<aside>
		<jsp:include page="/WEB-INF/views/include/aside.jsp"></jsp:include>
		</aside>
		<section>
			<h1>Section</h1>
		</section>
		<footer>
		<jsp:include page="/WEB-INF/views/include/footer.jsp"></jsp:include>
		</footer>
	</div>
</body>
</html>