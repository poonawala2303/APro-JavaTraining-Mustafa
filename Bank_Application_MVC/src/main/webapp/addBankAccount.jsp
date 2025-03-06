<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<meta charset="ISO-8859-1">
<title>Add Bank Account</title>
</head>
<style>

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

	<section id="message">
	
		<c:if test="${not empty message}">
			<div class="alert alert-success alert-dismissible fade show" role="alert">
        ${message}
        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>
		</c:if>
		
		<c:if test="${not empty error}">
			 <div class="alert alert-danger alert-dismissible fade show" role="alert">
        ${error}
        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>
		</c:if>
	</section>

	<!--  adding new bank account -->
	
	 <section id="addBankAccount" class="flex-grow py-5">
    	<div class="row ms-5 me-5">
    	<h2 class="text-center">Add New Bank Account</h2>
    	
    	<div class="d-flex justify-content-center align-items-center col-md-6" style="float-start">
    		<img class="w-50 rounded-4" alt="image" src="https://cdn3d.iconscout.com/3d/premium/thumb/bank-account-3d-icon-download-in-png-blend-fbx-gltf-file-formats--user-profile-payment-pack-business-icons-6777652.png">
    	</div>
    	
    	<div class="col-md-6">
    		<form action="SearchCustomerController" method="post">
    			
    			<div class="mb-3">
    				<label for="custId" class="form-label">Enter Customer Id</label>
    				<input type="text" class="form-control" name="custId" id="custId" placeholder="Enter customer id">
    			</div>
    			
    			<div class= "d-grid gap-2 col-6 mx-auto mb-3">
    				<button type="submit" class="btn btn-primary">Search for Customer Details</button>
    			</div>
    			
    			
    			
    		</form>

				<div class="rounded-5 shadow p-4 bg-light mb-3">
					<c:if test="${not empty customer}">
						<div class="customer-details">
							<h4 class="text-center mb-4 text-primary">Customer Details</h4>
							<div class="row">
								
								<div class="col-md-6">
									<p class="mb-3">
										<strong class="text-secondary">Customer ID:</strong> <span
											class="text-dark">${customer.customerId}</span>
									</p>
									<p class="mb-3">
										<strong class="text-secondary">First Name:</strong> <span
											class="text-dark">${customer.firstName}</span>
									</p>
								</div>
								
								<div class="col-md-6">
									<p class="mb-3">
										<strong class="text-secondary">Last Name:</strong> <span
											class="text-dark">${customer.lastName}</span>
									</p>
									<p class="mb-3">
										<strong class="text-secondary">Email:</strong> <span
											class="text-dark">${customer.email}</span>
									</p>
								</div>
								
							</div>
						</div>
					</c:if>
				</div>

				<form action="AddBankAccountController" method="POST">
                    <div class="mb-3">
                        <label for="custId" class="form-label">Customer Id</label>
                        <input type="text" class="form-control" name="custId" id="custId" value="${customer.customerId}" readonly>
                    </div>

                    <div class="mb-3">
                        <label for="balance" class="form-label">Initial Balance</label>
                        <input type="text" class="form-control" name="balance" id="balance" placeholder="Enter initial balance">
                    </div>

                    <div class="d-grid gap-2 col-6 mx-auto">
                        <button type="submit" class="btn btn-outline-primary">Add Bank Account</button>
                    </div>
             </form>
    		
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