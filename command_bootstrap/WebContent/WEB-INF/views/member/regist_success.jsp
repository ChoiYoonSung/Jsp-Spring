<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<script>
	alert("회원등록에 성공하였습니다.");
	
	window.onload(function(){
		$.ajax({
			url:"/getMcode?mName=회원목록",
			type:"get",
			success:function(menu){
				window.opener.parent.location.href="/index.do?mCode="+menu.mcode;
				window.close;
			}
		});
	})
</script>