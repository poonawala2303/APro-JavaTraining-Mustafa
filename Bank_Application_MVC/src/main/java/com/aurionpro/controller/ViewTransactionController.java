package com.aurionpro.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.entity.Transaction;
import com.aurionpro.model.Database;

@WebServlet("/ViewTransactionController")
public class ViewTransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ViewTransactionController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Database db = new Database();
//        db.connect();
//        
//        List<Transaction> transactions = db.getAllTransactions();
//        
//        request.setAttribute("transactions", transactions);
//        
//        RequestDispatcher dispatcher = request.getRequestDispatcher("viewTransactions.jsp");
//        dispatcher.forward(request, response);
		
		Database db = new Database();
        db.connect();

        // Get filter parameters
        String transactionType = request.getParameter("transactionType");
        String accountNumberStr = request.getParameter("accountNumber");
        String minAmountStr = request.getParameter("minAmount");
        String maxAmountStr = request.getParameter("maxAmount");

        // Parse filter values
        Integer accountNumber = (accountNumberStr != null && !accountNumberStr.isEmpty()) ? Integer.parseInt(accountNumberStr) : null;
        Double minAmount = (minAmountStr != null && !minAmountStr.isEmpty()) ? Double.parseDouble(minAmountStr) : null;
        Double maxAmount = (maxAmountStr != null && !maxAmountStr.isEmpty()) ? Double.parseDouble(maxAmountStr) : null;

        // Fetch filtered transactions
        List<Transaction> transactions = db.getFilteredTransactions(transactionType, accountNumber, minAmount, maxAmount);
        request.setAttribute("transactions", transactions);

        RequestDispatcher dispatcher = request.getRequestDispatcher("viewTransactions.jsp");
        dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
