<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Login</title>
</head>

<style>
	.logincol
	{
		background-color: #A6F1E0;	
	}
	
	body 
{
	display: flex;
    flex-direction: column;
    min-height: 100vh;
}

.flex-grow
{
	flex-grow: 1;
}
</style>

<body>

	<nav class="navbar navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="index.jsp">ABC Bank</a>
            
        </div>
    </nav>

<section id="contact" class="flex-grow">
<div class="logincol py-5">
	
		
    	<div class="row ms-5 me-5">
    	<h2 class="text-center">Login to the Application</h2>
    	
    	<div class="d-flex justify-content-center align-items-center col-md-6" style="float-start">
    		<img class="w-50 rounded-4" alt="image" src="https://5.imimg.com/data5/SELLER/Default/2024/4/409535413/HR/RX/QV/51398623/small-finance-bank-software-500x500.jpg">
    	</div>
    	
    	<div class="col-md-6">
    		<form action="LoginController" method="post">
    			
    			<div class="mb-3">
    				<label for="username" class="form-label">Username</label>
    				<input type="text" class="form-control" name="username" placeholder="Enter your username" required>
    			</div>
    			
    			<div class="mb-3">
    				<label for="password" class="form-label">Password</label>
    				<input type="password" class="form-control" name="password" placeholder="Enter your password" required>
    			</div>
    			<div class="mb-3">
    				<label for="contact" class="form-label">Login As:</label>
    				<select class="form-select custom-dropdown" name="role" required>
    					<option value="admin">Admin</option>
    					<option value="customer">Customer</option>
    				</select>
    			</div>
    			
    			<div class="d-grid gap-2 col-6 mx-auto">
    			<button class="btn btn-success">Login</button>
    			<a href="index.jsp" class="btn btn-outline-primary">Go to Home</a>
    			</div>
    		</form>
    	</div>
    	
    	</div>
    
    
</div>
</section>

    <footer class="bg-dark text-white text-center py-3">
    	<div class="container">
            <p>&copy; 2025 ABC Bank. All Rights Reserved.</p>
        </div>
    </footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>