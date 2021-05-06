package com.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.service.IMemberService;
import com.servlet.service.MemberServiceImpl;
import com.servlet.vo.MemberVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>login</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action=\"login\" method=\"post\">");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td>I D : </td>");
		out.println("<td><input type=\"text\" name=\"memId\" value=\"\"></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>비밀번호 : </td>");
		out.println("<td><input type=\"text\" name=\"memPw\" value=\"\"></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<input type=\"submit\" value=\"회원 등록\">");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		MemberVO member = new MemberVO();
		member.setMemId(memId);
		member.setMemPw(memPw);
		
		IMemberService memberService = MemberServiceImpl.getInstance();
		int cnt = memberService.loginCheckId(memId);
		if(cnt == 0) {
			out.println("<script>document.addEventListener(\"DOMContentLoaded\", function(){" + 
					"      alert(\"입력한 아이디가 존재하지 않습니다.\")" + 
					"});</script>");
			doGet(request, response);
		}else {
			
		MemberVO mem = memberService.login(member);
		if(mem == null) {
			out.println("<script>document.addEventListener(\"DOMContentLoaded\", function(){" + 
					"      alert(\"비밀번호를 잘못 입력하셨습니다.\")" + 
					"});</script>");
			doGet(request, response);
		}else {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>login</title>");
			out.println("<script>document.addEventListener(\"DOMContentLoaded\", function(){" + 
					"      alert(\""+ memId +"님 환영합니다..\")" + 
					"});</script>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Main</h1>");
			out.println("</body>");
			out.println("</html>");
		}
		}
	}

}
