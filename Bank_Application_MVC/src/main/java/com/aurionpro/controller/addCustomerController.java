package com.aurionpro.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.entity.Customer;
import com.aurionpro.entity.Role;
import com.aurionpro.entity.Users;
import com.aurionpro.model.Database;

@WebServlet("/addCustomerController")
public class addCustomerController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
   
    public addCustomerController() 
    {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Database db = new Database();
		db.connect();
		
		HttpSession session = request.getSession(false);
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		String newUsername = email.split("@")[0];
		
		Customer customer = new Customer(firstName,lastName,email,password);
		
		db.insertCustomer(customer);
		
		Users user = new Users(newUsername,password,Role.customer);
	    db.insertUser(user);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
