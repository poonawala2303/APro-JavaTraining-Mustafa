<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <meta charset="ISO-8859-1">
    <title>New Transaction</title>
    <script>
        function toggleToAccountField() {
            var transactionType = document.getElementById("transactionType").value;
            var toAccountField = document.getElementById("toAccountField");
            toAccountField.style.display = transactionType === "transfer" ? "block" : "none";
            document.getElementById("toAccountNumber").required = transactionType === "transfer";
        }
    </script>
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
/* Loader Styles */
.loader {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background: rgba(0, 0, 0, 0.5); /* Semi-transparent overlay */
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    z-index: 9999; /* Ensures it’s on top */
    transition: opacity 0.5s ease; /* Smooth fade-out */
}

.spinner {
    width: 60px;
    height: 60px;
    border: 6px solid #f3f3f3; /* Light gray border */
    border-top: 6px solid #007bff; /* Blue top for spinning effect */
    border-radius: 50%;
    animation: spin 1s linear infinite; /* Continuous spin */
}

.loader p {
    color: #fff;
    font-size: 18px;
    margin-top: 10px;
    font-weight: bold;
    text-shadow: 0 0 5px rgba(0, 0, 0, 0.5);
}


@keyframes spin {
    0% { transform: rotate(0deg); }
    100% { transform: rotate(360deg); }
}


.loader.hidden {
    opacity: 0;
    visibility: hidden;
}
</style>

<body>
	
	<div id="loader" class="loader">
        <div class="spinner"></div>
        <p>Loading...</p>
    </div>

    <nav class="navbar navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="index.jsp">ABC Bank</a>
            <form action="LogoutController" method="GET">
                <button class="btn btn-primary">Logout</button>
            </form>
        </div>
    </nav>

    <div class="row container mt-4 flex-grow">
       
        <%
            String accountNumberStr = request.getParameter("accountNumber");
            if (accountNumberStr != null) {
                session.setAttribute("accountNumber", Integer.parseInt(accountNumberStr));
            }
        %>
        
        <div class="d-flex justify-content-center align-items-center col-md-6" style="float-start">
    		<img class="w-50 rounded-4" alt="image" src="https://pixcap.com/cdn/library/templates/ef09534c-d67e-4447-b4d3-54f7e8dcfc3a/thumbnail/ebac4493-59ec-4ad5-9482-746801478404_transparent_400_400.webp	">
    	</div>

        <div class="card col-md-6">
            <div class="card-body">
                <h4 class="card-title">New Transaction</h4>
                <form action="NewTransactionController" method="POST">
                    <div class="mb-3">
                        <label for="transactionType" class="form-label">Transaction Type</label>
                        <select class="form-select" name="transactionType" id="transactionType" onchange="toggleToAccountField()" required>
                            <option value="credit">Credit</option>
                            <option value="debit">Debit</option>
                            <option value="transfer">Transfer</option>
                        </select>
                    </div>

                    <div class="mb-3" id="toAccountField" style="display: none;">
                        <label for="toAccountNumber" class="form-label">To Account Number (for transfer)</label>
                        <input type="number" class="form-control" name="toAccountNumber" id="toAccountNumber" placeholder="Enter destination account number">
                    </div>

                    <div class="mb-3">
                        <label for="amount" class="form-label">Amount</label>
                        <input type="number" step="0.01" class="form-control" name="amount" id="amount" placeholder="Enter amount" required>
                    </div>

                    <div class="d-grid gap-2">
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <footer class="bg-dark text-white text-center py-3 mt-4">
        <div class="container">
            <p>&copy; 2025 ABC Bank. All Rights Reserved.</p>
        </div>
    </footer>
</body>
	<script>
    // Hide loader when page is fully loaded
    window.addEventListener('load', function() {
        const loader = document.getElementById('loader');
        setTimeout(() => { // Optional delay for effect
            loader.classList.add('hidden');
        }, 500); // Adjust delay (in milliseconds) as desired
    });
	</script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</html>