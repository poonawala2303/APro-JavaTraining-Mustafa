<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <meta charset="ISO-8859-1">
    <title>View Customers</title>
    <style>
        body 
		{
			display: flex;
		    flex-direction: column;
		    min-height: 100vh;
		    background-color: #f8f9fa;
		}
		
		.flex-grow {
			flex-grow: 1;
		}
        
        .table {
            margin-top: 20px;
        }
        .filter-section {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            margin-bottom: 20px;
        }
        .filter-btn {
            background-color: #007bff;
            border: none;
            padding: 10px 20px;
            font-weight: bold;
            transition: all 0.3s ease;
        }
        .filter-btn:hover {
            background-color: #0056b3;
            transform: translateY(-2px);
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.15);
        }
        .clear-btn {
            background-color: #dc3545;
            border: none;
            padding: 10px 20px;
            font-weight: bold;
            transition: all 0.3s ease;
        }
        .clear-btn:hover {
            background-color: #b02a37;
            transform: translateY(-2px);
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.15);
        }
        .table {
            margin-top: 20px;
        }
        .account-table {
            margin: 0;
            font-size: 0.9em;
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="index.jsp">ABC Bank</a>
            <form action="LogoutController" method="GET">
                <button class="btn btn-primary">
                    Logout
                </button>
            </form>
        </div>
    </nav>
    
    

    <div class="container flex-grow">
        <h2 class="text-center mb-4">View Customers</h2>
        
        <!-- Button to fetch and display customers -->
        <div class="text-center">
            <form action="ViewCustomerController" method="GET">
                <button type="submit" class="btn btn-primary btn-lg">
                    <i class="fas fa-users"></i> Display Customers
                </button>
            </form>
        </div>
        
        <div class="filter-section mt-3">
            <form action="ViewCustomerController" method="GET">
                <div class="row g-3">
                    <div class="col-md-3">
                        <label for="firstName" class="form-label">First Name</label>
                        <input type="text" class="form-control" name="firstName" id="firstName" value="${param.firstName}" placeholder="Enter first name">
                    </div>
                    <div class="col-md-3">
                        <label for="lastName" class="form-label">Last Name</label>
                        <input type="text" class="form-control" name="lastName" id="lastName" value="${param.lastName}" placeholder="Enter last name">
                    </div>
                    <div class="col-md-2">
                        <label for="email" class="form-label">Email</label>
                        <input type="text" class="form-control" name="email" id="email" value="${param.email}" placeholder="Enter email">
                    </div>
                    <div class="col-md-2">
                        <label for="minAccounts" class="form-label">Min Accounts</label>
                        <input type="number" class="form-control" name="minAccounts" id="minAccounts" value="${param.minAccounts}" placeholder="Min">
                    </div>
                    <div class="col-md-1 d-flex align-items-end">
                        <button type="submit" class="btn filter-btn me-2"><i class="fas fa-filter"></i> Filter</button>
                        <a href="ViewCustomerController" class="btn clear-btn"><i class="fas fa-times"></i> Clear</a>
                    </div>
                </div>
            </form>
        </div>

        <!-- Table to display customer data -->
        <table class="table table-bordered table-striped mt-4">
            <thead class="thead-dark">
                <tr>
                	<th>Customer Id</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Bank Accounts</th>
                </tr>
            </thead>
            <tbody>
                
                <c:forEach var="customer" items="${customers}">
                    <tr>
                    	<td>${customer.customerId}</td>
                        <td>${customer.firstName}</td>
                        <td>${customer.lastName}</td>
                        <td>${customer.email}</td>
                        <td>
                        
                            <c:if test="${not empty customer.accounts}">
                                <table class="table account-table">
                                    <thead>
                                        <tr>
                                            <th>Account Number</th>
                                            <th>Balance</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="account" items="${customer.accounts}">
                                            <tr>
                                                <td>${account.accountNumber}</td>
                                                <td>${account.balance}</td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </c:if>
                            
                            <c:if test="${empty customer.accounts}">
                                No accounts found.
                            </c:if>
                            
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <footer class="bg-dark text-white text-center py-3">
        <div class="container">
            <p>&copy; 2025 ABC Bank. All Rights Reserved.</p>
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>