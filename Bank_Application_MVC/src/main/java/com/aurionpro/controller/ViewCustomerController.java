package com.aurionpro.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.entity.Customer;
import com.aurionpro.model.Database;

@WebServlet("/ViewCustomerController")
public class ViewCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ViewCustomerController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Database db = new Database();
		db.connect();
		
		List<Customer> customers = db.getAllCustomers();
		
		request.setAttribute("customers", customers);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("viewCustomers.jsp");
        dispatcher.forward(request, response);
	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
