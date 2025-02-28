package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LastNameController")
public class LastNameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String lName = request.getParameter("lastName");
//		Cookie cookie[] = request.getCookies();
		HttpSession session = request.getSession(false);
		
		// The boolean parameter 'false'  has been passed so that a new session is not created since the session already exists
		
//		String fName = cookie[0].getValue();
		String fName = (String) session.getAttribute("fNames");
		
		writer.print("Welcome: " + fName +" " +lName);
		
		System.out.println(session.getCreationTime());
		System.out.println(session.getId());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
