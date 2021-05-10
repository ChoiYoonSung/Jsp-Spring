package com.servlet.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.service.IMemberService;
import com.servlet.service.MemberServiceImpl;
import com.servlet.view.HTMLView;
import com.servlet.vo.MemberVO;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/select")
public class SelectMemberServlet extends HttpServlet {
	private IMemberService memberService = new MemberServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = "/WEB-INF/views/select.jsp";
		String memId = request.getParameter("memId");
		
		MemberVO member = null;
		String script = "";
		try {
			member = memberService.selectMember(memId);
		} catch (SQLException e) {
			e.printStackTrace();
			script = "alert('서버장애 불가');" + "history.go(-1);";
		};
		
		request.setAttribute("member", member);
	    request.setAttribute("script", script);
	    request.getRequestDispatcher(view).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
