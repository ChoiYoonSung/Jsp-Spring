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

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/delete")
public class DeleteMemberServlet extends HttpServlet {
	private IMemberService memberService = new MemberServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = "/WEB-INF/views/success.jsp";
		String memId = request.getParameter("memId");
		
		String script="";
		try {
			memberService.deleteMember(memId);
			script="alert('삭제 성공');"
	                  + "location.href='" + request.getContextPath() + "/list';";
		} catch (SQLException e) {
			script = "alert('서버장애 불가');" + "history.go(-1);";
			e.printStackTrace();
		}
		request.setAttribute("script", script);
		request.getRequestDispatcher(view).forward(request, response);
	}
}
