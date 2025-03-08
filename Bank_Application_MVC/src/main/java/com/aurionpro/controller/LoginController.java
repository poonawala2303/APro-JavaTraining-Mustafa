package com.aurionpro.controller;

import java.io.IOException;
import java.util.List;

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

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() 
    {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
	    Database db = new Database();
	    db.connect();

	    String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    String role = request.getParameter("role");

	    Users user = db.validateUser(username, password);

	    if (user != null) 
	    {
	    	
	        if (role != null && role.equalsIgnoreCase(user.getRole().toString())) 
	        {
	            HttpSession session = request.getSession();
	            session.setAttribute("user", user);

	            RequestDispatcher dispatcher = null;

	            if (user.getRole() == Role.admin) 
	            {
	            	response.sendRedirect("admin.jsp");
	            } 
	            
	            else if (user.getRole() == Role.customer) 
	            {
	            	Customer customer = db.getCustomerByEmail(username + "@gmail.com");
	            	 if (customer != null) 
	            	 {
	                     session.setAttribute("customer", customer);
	                     List<Integer> accountNumbers = db.getAccountNumbersByCustomerId(customer.getCustomerId());
	                     session.setAttribute("accountNumbers", accountNumbers);
	                 }
	            	response.sendRedirect("customer.jsp");
	            }
	            
//	            dispatcher.forward(request, response);
	            
	        } 
	        
	        else 
	        {
	            response.sendRedirect(request.getContextPath() + "/error.jsp");
	        }
	        
	    } 
	    
	    else // Invalid Credentials
	    {
	    	request.setAttribute("error", "Invalid username or password");
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/error.jsp");
	        dispatcher.forward(request, response);
	    }
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
