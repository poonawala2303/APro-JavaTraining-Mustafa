<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.custom-btn {
	padding: 15px 20px;
	font-size: 18px;
	font-weight: bold;
	border-radius: 10px;
	transition: all 0.3s ease;
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
	border: none;
}

.custom-btn:hover {
	transform: translateY(-2px);
	box-shadow: 0 6px 8px rgba(0, 0, 0, 0.15);
	background-color: #0056b3;
}

.row.justify-content-center {
	margin-top: 50px;
	padding: 20px;
}

.mb-3 {
	margin-bottom: 1.5rem !important;
}

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
</style>
<body>
	
	<nav class="navbar navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="index.jsp">ABC Bank</a>
            <a href="login.jsp" class="btn btn-primary float-right">Logout</a>
        </div>
    </nav>

	<section id="contact" class="flex-grow">
		<div class="container">


			<div class="row">
				
				<h2 class="text-center mb-3 mt-5">Admin Dashboard</h2>
				<h3 class="text-center mb-5">Admin Operations</h3>
				
				<div class="col-md-6 mb-3 text-center">
					<a href="addNewCustomer.jsp" class="btn btn-primary btn-lg btn-block custom-btn">
						<i class="fas fa-user-plus"></i> Add New Customer
					</a>
				</div>

				<div class="col-md-6 mb-3 text-center">
					<a href="addBankAccount.jsp" class="btn btn-primary btn-lg btn-block custom-btn">
						<i class="fas fa-piggy-bank"></i> Add Bank Account
					</a>
				</div>

				<div class="col-md-6 mb-3 text-center">
					<a href="viewCustomers.jsp" class="btn btn-primary btn-lg btn-block custom-btn">
						<i class="fas fa-users"></i> View Customers
					</a>
				</div>

				<div class="col-md-6 mb-3 text-center">
					<a href="viewTransactions.jsp" class="btn btn-primary btn-lg btn-block custom-btn">
						<i class="fas fa-exchange-alt"></i> View Transactions
					</a>
					
				</div>
			
			</div>


		</div>
	</section>
	
	<footer class="bg-dark text-white">
        <div class="container">
            <p>&copy; 2025 ABC Bank. All Rights Reserved.</p>
        </div>
    </footer>
</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</html>