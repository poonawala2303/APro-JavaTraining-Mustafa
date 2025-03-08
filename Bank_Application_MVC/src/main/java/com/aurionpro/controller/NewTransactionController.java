package com.aurionpro.controller;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.entity.Transaction;
import com.aurionpro.model.Database;

@WebServlet("/NewTransactionController")
public class NewTransactionController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public NewTransactionController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        Object accountNumberObj = session.getAttribute("accountNumber");

        if (accountNumberObj == null) 
        {
            request.setAttribute("error", "No account selected. Please select an account from the dashboard.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("customer.jsp");
            dispatcher.forward(request, response);
            
            return;
        }

        int originAccountNumber = (int) accountNumberObj;
        String transactionType = request.getParameter("transactionType");
        double amount = Double.parseDouble(request.getParameter("amount"));
        Integer toAccountNumber = null;

        Database db = new Database();

        // Validate origin account
        if (!db.accountExists(originAccountNumber)) {
            request.setAttribute("error", "Origin account does not exist.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("customer.jsp");
            dispatcher.forward(request, response);
            return;
        }

        if ("transfer".equals(transactionType)) {
            String toAccountNumberStr = request.getParameter("toAccountNumber");
            if (toAccountNumberStr == null || toAccountNumberStr.isEmpty()) {
                request.setAttribute("error", "Destination account number is required for transfer.");
                RequestDispatcher dispatcher = request.getRequestDispatcher("customer.jsp");
                dispatcher.forward(request, response);
                return;
            }
            toAccountNumber = Integer.parseInt(toAccountNumberStr);

            // Validate destination account
            if (!db.accountExists(toAccountNumber)) {
                request.setAttribute("error", "Destination account does not exist.");
                RequestDispatcher dispatcher = request.getRequestDispatcher("customer.jsp");
                dispatcher.forward(request, response);
                return;
            }

            // Check sufficient balance for transfer
            double originBalance = db.getAccountBalance(originAccountNumber);
            if (originBalance < amount) {
                request.setAttribute("error", "Insufficient balance in origin account.");
                RequestDispatcher dispatcher = request.getRequestDispatcher("customer.jsp");
                dispatcher.forward(request, response);
                return;
            }

            // Perform transfer: debit origin, credit destination
            boolean debitSuccess = db.updateAccountBalance(originAccountNumber, amount, "debit");
            boolean creditSuccess = db.updateAccountBalance(toAccountNumber, amount, "credit");

            if (!debitSuccess || !creditSuccess) {
                request.setAttribute("error", "Failed to update account balances during transfer.");
                RequestDispatcher dispatcher = request.getRequestDispatcher("customer.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else {
            // Handle credit or debit
            boolean balanceUpdateSuccess = db.updateAccountBalance(originAccountNumber, amount, transactionType);
            if (!balanceUpdateSuccess) {
                request.setAttribute("error", transactionType.equals("debit") ? "Insufficient balance." : "Failed to update balance.");
                RequestDispatcher dispatcher = request.getRequestDispatcher("customer.jsp");
                dispatcher.forward(request, response);
                return;
            }
        }

        // Record the transaction
        Transaction transaction = new Transaction(0, originAccountNumber, transactionType, amount, toAccountNumber);
        boolean transactionSuccess = db.insertTransaction(transaction);

        if (transactionSuccess) {
            request.setAttribute("message", "Transaction completed successfully!");
            RequestDispatcher dispatcher = request.getRequestDispatcher("customer.jsp");
            dispatcher.forward(request, response);
        } else {
            request.setAttribute("error", "Failed to record the transaction.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("customer.jsp");
            dispatcher.forward(request, response);
        }

        
    }
}