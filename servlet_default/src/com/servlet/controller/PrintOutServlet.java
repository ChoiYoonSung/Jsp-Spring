package com.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrintOutServlet
 */
@WebServlet("/print.html")
public class PrintOutServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Hello, World!");
		
//		response.setContentType("text/plain;charset=utf-8");
		response.setContentType("text/html;charset=utf-8");
//		response.setContentType("application/asdfasdfasdf;charset=utf-8");
		
		String bg = request.getParameter("bg");
		String color = request.getParameter("color");
		String message = request.getParameter("message");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>연습</title>");
		out.println("<style>");
		out.println("body{background:"+bg+"}");
		out.println("body{color:" +color+"}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.printf("<h1>%s</h1>", message);
		out.println("</body>");
		out.println("</html>");
	}
}
