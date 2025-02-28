package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FIrstNameController")
public class FIrstNameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String fName = request.getParameter("firstName");
		
//		Cookie firstNameCookie = new Cookie("firstName", fName);
		
		HttpSession session = request.getSession();
		session.setAttribute("fNames", fName);
		
//		response.addCookie(firstNameCookie);
		writer.print("Welcome: " + fName);
		writer.print("<form action='LastNameController' method='post'>");
		writer.print("Last Name: <input name='lastName' type='text' placeholder='Enter last name'>");
		writer.print("<button>Next</button>");
		writer.print("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
