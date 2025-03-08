<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error - ABC Bank</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    
    <style>
        body {
            background-color: #f8f9fa;
        }
        .error-container {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .error-card {
            max-width: 500px;
            text-align: center;
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
        }
        .error-img {
            width: 100%;
            max-width: 300px;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>

    <div class="container">
        <div class="error-container">
            <div class="error-card">
                <img class="error-img" src="https://cdn-icons-png.flaticon.com/512/564/564619.png" alt="Error Image">
                <h2 class="text-danger">Oops! Something went wrong</h2>
                <p class="text-muted">An unexpected error occurred while processing your request. Please try again later.</p>
                <a href="login.jsp" class="btn btn-primary">Go Back to Login</a>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
