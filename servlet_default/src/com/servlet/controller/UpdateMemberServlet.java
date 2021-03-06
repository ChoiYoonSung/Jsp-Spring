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
import com.servlet.vo.MemberVO;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/update")
public class UpdateMemberServlet extends HttpServlet {
	private IMemberService memberService = new MemberServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String view = "/WEB-INF/views/update.jsp";
		request.setAttribute("memId", request.getParameter("memId"));
		request.getRequestDispatcher(view).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String view = "/WEB-INF/views/success.jsp";
		
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		String memPh = request.getParameter("memPh");
		String memMail = request.getParameter("memMail");
		
		MemberVO member = new MemberVO();
		member.setMemId(memId);
		member.setMemPw(memPw);
		member.setMemPh(memPh);
		member.setMemMail(memMail);
		
		String script = "";
		try {
			memberService.updateMember(member);
			script = "alert('수정 성공');"
	                  + "location.href='" + request.getContextPath() + "/select?memId="+memId+"';";
		} catch (SQLException e) {
			script = "alert('서버장애 불가');" + "history.go(-1);";
			e.printStackTrace();
		}
		
		request.setAttribute("script", script);
		request.getRequestDispatcher(view).forward(request, response);
	}

}
