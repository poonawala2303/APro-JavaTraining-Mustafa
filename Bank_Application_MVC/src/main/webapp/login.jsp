<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<meta charset="ISO-8859-1">
<title>Login</title>
</head>

<style>
	
	body 
{
	background-color: #A6F1E0;	
	display: flex;
    flex-direction: column;
    min-height: 100vh;
}

.flex-grow
{
	flex-grow: 1;
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
            
        </div>
    </nav>

<section id="contact" class="flex-grow">
<div class="logincol py-5">
	
		
    	<div class="row ms-5 me-5">
    	<h2 class="text-center">Login to the Application</h2>
    	
    	<div class="d-flex justify-content-center align-items-center col-md-6" style="float-start">
    		<img class="w-50 rounded-4" alt="image" src="https://5.imimg.com/data5/SELLER/Default/2024/4/409535413/HR/RX/QV/51398623/small-finance-bank-software-500x500.jpg">
    	</div>
    	
    	<div class="col-md-6 mt-3">
    		<form action="LoginController" method="post">
    			
    			<div class="input-group mb-3">
    				<span class="input-group-text" id="basic-addon1"><i class="bi bi-person"></i></span>
    				<input type="text" class="form-control" name="username" placeholder="Enter your username" required>
    			</div>
    			
    			<div class="input-group mb-3">
    			<span class="input-group-text" id="basic-addon1"><i class="bi bi-eye-fill"></i></span>
    				<input type="password" class="form-control" name="password" placeholder="Enter your password" required>
    			</div>
    			
    			<div class="input-group mb-3">
    			<span class="input-group-text" id="basic-addon1">Login As:</span>
    				<select class="form-select custom-dropdown" name="role" required>
    					<option value="admin">Admin</option>
    					<option value="customer">Customer</option>
    				</select>
    			</div>
    			
    			<div class="d-grid gap-2 col-6 mx-auto">
    			<button class="btn btn-success">Login</button>
    			<a href="signup.jsp" class="btn btn-outline-primary">Sign Up</a>
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
<script>
    // Hide loader when page is fully loaded
    window.addEventListener('load', function() {
        const loader = document.getElementById('loader');
        setTimeout(() => { // Optional delay for effect
            loader.classList.add('hidden');
        }, 500); // Adjust delay (in milliseconds) as desired
    });
	</script>
</body>
</html>