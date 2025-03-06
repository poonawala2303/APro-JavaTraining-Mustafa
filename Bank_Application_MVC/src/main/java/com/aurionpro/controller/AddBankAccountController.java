package com.aurionpro.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.model.Database;

@WebServlet("/AddBankAccountController")
public class AddBankAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddBankAccountController() 
    {
        super();   
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int customerId = Integer.parseInt(request.getParameter("custId"));
		double balance = Double.parseDouble(request.getParameter("balance"));
		
		int accountNumber = new Random().nextInt(900000) + 100000;
		
		Database db = new Database();
        db.connect();
        
        boolean success = db.insertBankAccount(accountNumber, customerId, balance);
        
        if(success)
        {
        	HttpSession session = request.getSession();
        	session.setAttribute("message", "Bank account added successfully! Account Number: " + accountNumber);
        }
		
        else
        {
        	HttpSession session = request.getSession();
        	session.setAttribute("error", "Failed to create bank account");
        }
        
//        RequestDispatcher dispatcher = request.getRequestDispatcher("addBankAccount.jsp");
//        dispatcher.forward(request, response);
        
        response.sendRedirect("addBankAccount.jsp");
        
	}

}
