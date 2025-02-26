package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormServelet")
public class FormServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String fName = request.getParameter("firstName");
		String lName = request.getParameter("lastName");
		String gender = request.getParameter("gender");
		String[] language = request.getParameterValues("language");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String state = request.getParameter("stateChoice");
		String zip = request.getParameter("zip");
		String card = request.getParameter("cardChoice");
		
		writer.print("First name: <b>" + fName + "</b><br>");
		writer.print("Last name: <b>" + lName + "</b><br>");
		writer.print("Gender: <b>" + gender + "</b><br>");
		writer.print("Languages: ");
		for(String lang : language)
		{
			writer.print("<b>" +lang + "</b>&nbsp;");
		}
		writer.print("<br>");
		writer.print("Email: <b>" + email + "</b><br>");
		writer.print("Address: <b>" + address + "</b><br>");
		writer.print("State: <b>" + state + "</b><br>");
		writer.print("Zip: <b>" + zip + "</b><br>");
		writer.print("Card: <b>" + card + "</b><br>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
