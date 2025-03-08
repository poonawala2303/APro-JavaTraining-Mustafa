<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <meta charset="ISO-8859-1">
    <title>Passbook</title>
</head>

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

footer {
	background-color: #343a40;
	color: white;
	text-align: center;
	padding: 1rem 0;
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
</style>

<body>
	<nav class="navbar navbar-dark bg-dark">
		<div class="container">
			<a class="navbar-brand" href="index.jsp">ABC Bank</a>
			<!--  <a href="logout.jsp" class="btn btn-primary float-right">Logout</a>-->
			<form action="LogoutController" method="GET">
				<button class="btn btn-primary">Logout</button>
			</form>
		</div>
	</nav>


	<div class="container flex-grow">

		<div class="filter-section mt-3">
			<form action="PassbookController" method="GET">
				<div class="row g-3">
					<div class="col-md-3">
						<label for="transactionType" class="form-label">Transaction
							Type</label> <select class="form-select" name="transactionType"
							id="transactionType">
							<option value="">All</option>
							<option value="credit"
								${param.transactionType == 'credit' ? 'selected' : ''}>Credit</option>
							<option value="debit"
								${param.transactionType == 'debit' ? 'selected' : ''}>Debit</option>
							<option value="transfer"
								${param.transactionType == 'transfer' ? 'selected' : ''}>Transfer</option>
						</select>
					</div>
					<div class="col-md-3">
						<label for="accountNumber" class="form-label">Account
							Number</label> <select class="form-select" name="accountNumber"
							id="accountNumber">
							<option value="">All</option>
							<c:forEach var="account" items="${sessionScope.accountNumbers}">
								<option value="${account}"
									${param.accountNumber == account ? 'selected' : ''}>${account}</option>
							</c:forEach>
						</select>
					</div>
					<div class="col-md-2">
						<label for="minAmount" class="form-label">Min Amount</label> <input
							type="number" step="0.01" class="form-control" name="minAmount"
							id="minAmount" value="${param.minAmount}" placeholder="Min">
					</div>
					<div class="col-md-2">
						<label for="maxAmount" class="form-label">Max Amount</label> <input
							type="number" step="0.01" class="form-control" name="maxAmount"
							id="maxAmount" value="${param.maxAmount}" placeholder="Max">
					</div>
					<div class="col-md-2 d-flex align-items-end">
						<button type="submit" class="btn filter-btn me-2">
							<i class="fas fa-filter"></i> Filter
						</button>
						<a href="PassbookController" class="btn clear-btn"><i
							class="fas fa-times"></i> Clear</a>
					</div>
				</div>
			</form>
		</div>

		<h2 class="text-center mb-4">Passbook</h2>

		<div class="text-center mb-2">
			<form action="PassbookController" method="GET">
				<button class="btn btn-primary btn-lg">
					<i class="fas fa-users"></i> View Transactions
				</button>
			</form>
		</div>

		<!-- Table to display transactions -->
		<table class="table table-bordered table-striped">
			<thead class="thead-dark">
				<tr>
					<th>Transaction ID</th>
					<th>Account Number</th>
					<th>Type</th>
					<th>Amount</th>
					<th>To Account Number</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="transaction" items="${transactions}">
					<tr>
						<td>${transaction.transactionId}</td>
						<td>${transaction.accountNumber}</td>
						<td>${transaction.btnType}</td>
						<td>${transaction.amount}</td>
						<td><c:if test="${not empty transaction.toAccountNumber}">
                                ${transaction.toAccountNumber}
                            </c:if> <c:if
								test="${empty transaction.toAccountNumber}">
                                N/A
                            </c:if></td>
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
</body>
</html>