package com.aurionpro.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginController()
    {
        super();    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String loginType = request.getParameter("loginType");
		
		request.setAttribute("name", "Mustafa Poonawala");
		
		RequestDispatcher dispatcher = null;
		
		if(loginType.equals("customer"))
			dispatcher = request.getRequestDispatcher("/Customer.jsp");
		if(loginType.equals("admin"))
			dispatcher = request.getRequestDispatcher("/Admin.jsp");
		
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
