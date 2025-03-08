<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<meta charset="ISO-8859-1">
<title>Customer Dashboard</title>
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
            <form action="LogoutController" method="GET">
                <button class="btn btn-primary">Logout</button>
            </form>
        </div>
    </nav>

    <section id="contact" class="flex-grow">
        <div class="container">
            <h2 class="text-center mt-1 mb-2">Welcome, ${customer.firstName} ${customer.lastName}</h2>
            <div class="card mb-4">
                <div class="card-body">
                    <p><strong>Customer ID:</strong> ${customer.customerId}</p>
                    <p><strong>Email:</strong> ${customer.email}</p>
                </div>
            </div>

            <c:if test="${not empty message}">
                <div class="alert alert-success">${message}</div>
            </c:if>
            <c:if test="${not empty error}">
                <div class="alert alert-danger">${error}</div>
            </c:if>

            <div class="row">
                <h2 class="text-center mb-3 mt-1">Customer Operations</h2>

                <form action="addNewTransaction.jsp" method="GET">
                    <div class="mb-3 text-center">
                        <label for="accountNumber" class="form-label">Select Account</label>
                        <select class="form-select w-50 mx-auto" name="accountNumber" id="accountNumber" required>
                            <c:forEach var="account" items="${sessionScope.accountNumbers}">
                                <option value="${account}">${account}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="col-md-12 mb-3 text-center">
                        <button type="submit" class="btn btn-primary btn-lg btn-block custom-btn">
                            <i class="fas fa-wallet"></i> New Transaction
                        </button>
                    </div>
                </form>

                <div class="col-md-6 mb-3 text-center">
                    <a href="passbook.jsp" class="btn btn-primary btn-lg btn-block custom-btn">
                        <i class="fas fa-user-plus"></i> Passbook
                    </a>
                </div>

                <div class="col-md-6 mb-3 text-center">
                    <button class="btn btn-primary btn-lg btn-block custom-btn" data-bs-toggle="modal" data-bs-target="#editProfileModal">
                        <i class="fas fa-user"></i> Edit Profile
                    </button>
                </div>
                
            </div>
        </div>
    </section>


	<!-- Edit profile modal -->
	
	<div class="modal fade" id="editProfileModal" tabindex="-1" aria-labelledby="editProfileModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
            
                <div class="modal-header">
                    <h5 class="modal-title" id="editProfileModalLabel">Edit Profile</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                
                <div class="modal-body">
                    <form action="EditProfileController" method="POST">
                        
                        <div class="mb-3">
                            <label for="firstName" class="form-label">First Name</label>
                            <input type="text" class="form-control" name="firstName" id="firstName" value="${customer.firstName}" required>
                        </div>
                        
                        <div class="mb-3">
                            <label for="lastName" class="form-label">Last Name</label>
                            <input type="text" class="form-control" name="lastName" id="lastName" value="${customer.lastName}" required>
                        </div>
                        
                        <div class="mb-3">
                            <label for="password" class="form-label">Password</label>
                            <input type="password" class="form-control" name="password" id="password" value="${customer.password}" required>
                        </div>
                        
                        <button type="submit" class="btn btn-primary">Save Changes</button>
                        
                    </form>
                </div>
                
            </div>
        </div>
    </div>


    <footer class="bg-dark text-white">
        <div class="container">
            <p>© 2025 ABC Bank. All Rights Reserved.</p>
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</html>