package com.aurionpro.controller;

import java.io.IOException;

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

@WebServlet("/SignupController")
public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SignupController() 
    {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Database db = new Database();
	    db.connect();
	    
	    String firstName = request.getParameter("firstname");
	    String lastName = request.getParameter("lastname");
	    String email = request.getParameter("email");
	    String password = request.getParameter("password");
	    
	    String newUsername = email.split("@")[0];
	    
	    Customer customer = new Customer(firstName, lastName, email, password);
	    db.insertCustomer(customer);
	    
	    Users user = new Users(newUsername,password,Role.customer);
	    db.insertUser(user);
	    
	    Customer newCustomer = db.getCustomerByEmail(newUsername);
	    
	    if (newCustomer != null) 
	    {
	        HttpSession session = request.getSession();
	        session.setAttribute("customer", newCustomer); // Store the customer object in the session
	    }

	    
	   response.sendRedirect("customer.jsp");
	    
	}

}
