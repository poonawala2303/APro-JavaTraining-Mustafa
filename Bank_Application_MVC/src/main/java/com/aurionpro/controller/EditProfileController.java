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
import com.aurionpro.model.Database;

@WebServlet("/EditProfileController")
public class EditProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditProfileController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Customer customer = (Customer) session.getAttribute("customer");
		
		if(customer == null)
		{
			request.setAttribute("error", "No customer data found. Please log in again.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("customer.jsp");
            dispatcher.forward(request, response);
            return;
		}
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String password = request.getParameter("password");
		
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setPassword(password);
		
		Database db = new Database();
		
		boolean customerUpdateSuccess = db.updateCustomer(customer);
        boolean userUpdateSuccess = db.updateUserPassword(customer.getEmail().split("@")[0], password);
		
		if(customerUpdateSuccess && userUpdateSuccess)
		{
			session.setAttribute("customer", customer);
			request.setAttribute("message", "Profile updated successfully!");
		}
		
		else
		{
			request.setAttribute("error", "Failed to update profile.");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("customer.jsp");
        dispatcher.forward(request, response);
		
	}

}
