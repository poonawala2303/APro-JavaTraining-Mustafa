<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>

<style>
	.custom-green-btn 
	{
	    background-color: rgb(34, 177, 76);
	    color: white; 
	    border: none; 
	    padding: 10px 20px;
	    border-radius: 5px; 
	}
	.custom-green-btn:hover 
	{
	    background-color: rgb(30, 160, 70);
	}
	.aboutSection
	{
		background-color: #A6F1G0;
	}
</style>

<body>
	
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="#">ABC Bank</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item"><a class="nav-link" href="#">Home</a></li>
                    <li class="nav-item"><a class="nav-link" href="#services">Services</a></li>
                    <li class="nav-item"><a class="nav-link" href="#about">About</a></li>
                    <li class="nav-item"><a class="nav-link" href="#contact">Contact</a></li>
                </ul>
            </div>
        </div>
    </nav>
	
	<header class="bg-success text-white text-center py-5">
        <div class="container">
            <h1>Welcome to ABC Bank</h1>
            <p>Your trusted financial partner</p>
            <form action="login.jsp" method="get">
            	<button class="btn custom-green-btn d-grid gap-2 col-4 mx-auto">Start Banking</button>
            </form>
        </div>
    </header>
    
    <!-- services section -->
    
    <section id="servics" class="py-5">
    	<div class="container text-center">
    		<h2>Our Services</h2>
    		<div class="row mt-4">
    			
    			<div class="col-md-4">
    				<div class="card p-3">
    					<h4>Seamless Banking</h4>
    					<p>Online Banking 24/7</p>
    				</div>
    			</div>
    			
    			<div class="col-md-4">
    				<div class="card p-3">
    					<h4>Transfer Conveniently</h4>
    					<p>Transfer money without any hassle</p>
    				</div>
    			</div>
    			
    			<div class="col-md-4">
    				<div class="card p-3">
    					<h4>Investment Plans</h4>
    					<p>Secure your future with our financial advice.</p>
    				</div>
    			</div>
    			
    		</div>
    	</div>
    </section>
    
    <!-- about section -->
    
    <section id="about" class="aboutSection py-3">
    	<div class="container text-center text-dark">
    		<h2>About us</h2>
    		
    		<div class="about">
    		
    			<p>ABC Bank is a new generation private sector bank with 200 branches across India. It is a scheduled commercial bank regulated by the Reserve Bank of India. It is professionally managed and governed. ABC Bank has contemporary technology and infrastructure including state of the art internet banking for personal as well as business banking customers.
    			</p>
    			
    			<p>
    			We are the largest banking and financial services organization in India, with an asset base of over Rs. 61 million. We serve over 50 crore customers through our vast network of over 5,500 branches, 3,580 ATMs/ADWMs, 2,900 BC outlets, with an undeterred focus on innovation, and customer centricity, which stems from the core values of the Bank - Service, Transparency, Ethics, Politeness and Sustainability
    			</p>
    			
    		</div>
    		
    	</div>
    
    </section>
    
    <!-- contact us section -->
    
    <section id="contact" class="py-5">
    	<div class="row ms-5 me-5">
    	<h2 class="text-center">Contact Us</h2>
    	
    	<div class="d-flex justify-content-center align-items-center col-md-6" style="float-start">
    		<img class="w-50 rounded-4" alt="image" src="https://5.imimg.com/data5/SELLER/Default/2024/4/409535413/HR/RX/QV/51398623/small-finance-bank-software-500x500.jpg">
    	</div>
    	
    	<div class="col-md-6">
    		<form action="">
    			
    			<div class="mb-3">
    				<label for="name" class="form-label">Name</label>
    				<input type="text" class="form-control" id="name" placeholder="Enter your name">
    			</div>
    			
    			<div class="mb-3">
    				<label for="email" class="form-label">Email</label>
    				<input type="email" class="form-control" id="email" placeholder="Enter your email">
    			</div>
    			<div class="mb-3">
    				<label for="contact" class="form-label">Contact</label>
    				<input type="text" class="form-control" id="contact" placeholder="Enter your contact number">
    			</div>
    			
    			<div class="d-grid gap-2 col-6 mx-auto">
    			<button class="btn btn-outline-primary" type="button">Submit</button>
    			</div>
    		</form>
    	</div>
    	
    	</div>
    </section>
    
    <footer class="bg-dark text-white text-center py-3">
    	<p>&copy; 2025 ABC 	Bank. All Rights Reserved.</p>
    </footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>

</html>