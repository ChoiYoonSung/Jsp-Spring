package com.servlet.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.exception.InvalidPasswordException;
import com.servlet.exception.NotFoundIDException;
import com.servlet.service.IMemberService;
import com.servlet.service.MemberServiceImpl;
import com.servlet.view.HTMLView;
import com.servlet.vo.MemberVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HTMLView.loginView(response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 입력
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		
		//처리
		String script = "";
		IMemberService memberService = MemberServiceImpl.getInstance();
		try {
			MemberVO member = memberService.login(memId, memPw);
			
			script = "alert("+memId+"님 환영합니다.)"
					+ "location.href="+request.getContextPath()+"/main";
		} catch (NotFoundIDException e) {
			script = "alert(" + e.getMessage() + ")"
					+ "history.go(-1)";
		} catch (InvalidPasswordException e) {
			script = "alert(" + e.getMessage() + ")"
					+ "location.href='login'";
		} catch (SQLException e) {
			script = "alert('서버장애로 인해 접속할 수 없습니다.')"
					+ "location.href='login'";
			e.printStackTrace();
		}
		
		//출력
		HTMLView.html(response, script);
		
		
		MemberVO member = new MemberVO();
		member.setMemId(memId);
		member.setMemPw(memPw);
		
		
		int cnt = memberService.loginCheckId(memId);
//		MemberVO mem = memberService.login(member);
	}

}
