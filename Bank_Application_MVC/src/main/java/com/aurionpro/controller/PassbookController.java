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

import com.aurionpro.entity.Transaction;
import com.aurionpro.model.Database;


@WebServlet("/PassbookController")
public class PassbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PassbookController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
        @SuppressWarnings("unchecked")
		List<Integer> accountNumbers = (List<Integer>) session.getAttribute("accountNumbers");
        
        if (accountNumbers == null || accountNumbers.isEmpty()) {
            request.setAttribute("error", "No accounts found for this customer.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("customer.jsp");
            dispatcher.forward(request, response);
            return;
        }
        
        String transactionType = request.getParameter("transactionType");
        String accountNumberStr = request.getParameter("accountNumber");
        String minAmountStr = request.getParameter("minAmount");
        String maxAmountStr = request.getParameter("maxAmount");
        
        Integer accountNumber = (accountNumberStr != null && !accountNumberStr.isEmpty()) ? Integer.parseInt(accountNumberStr) : null;
        Double minAmount = (minAmountStr != null && !minAmountStr.isEmpty()) ? Double.parseDouble(minAmountStr) : null;
        Double maxAmount = (maxAmountStr != null && !maxAmountStr.isEmpty()) ? Double.parseDouble(maxAmountStr) : null;
        
        Database db = new Database();
        db.connect();
        
        List<Transaction> transactions = db.getFilteredTransactions(accountNumbers, transactionType, accountNumber, minAmount, maxAmount);
        request.setAttribute("transactions", transactions);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("passbook.jsp");
        dispatcher.forward(request, response);
        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
