<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CDAC APP | Admin Dashboard</title>
<link href="./css/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css">
<script src="./js/bootstrap/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="./css/styleNavbarAndFooter.css" />
<link rel="stylesheet" href="./css/adminDashboard.css" />
</head>
<body>
   <!-- navbar -->
     <nav class="navbar navbar-expand-lg navbar-light" id="navbar-1">
        <a class="navbar-brand" href="#"><img class="img-responsive" src="./img/cdac-logo.jpeg"></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
          aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
    
        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
          <ul class="navbar-nav">
    
            <li id="dashboard" class="nav-item active">
              <a class="nav-link" href="#">Logout</a>
            </li>
            
          </ul>
        </div>
      </nav>

      <div class="container py-4">
        
        <div class="row">
            <div class="col-sm-4 py-3" style="height:200px;">
                <div class="card card-body h-100">
                  <a href=""><button class="admin-button">Generate PRN</button></a> 
                </div>
            </div>
            <div class="col-sm-4 py-3 h-200">
                <div class="card card-body h-100 ">
                  <a href=""><button class="admin-button">Active doubts</button></a>
                </div>
            </div>
            <div class="col-sm-4 py-3 h-200">
                <div class="card h-100 card-body">
                   <a href=""><button class="admin-button">Update Active flag</button></a>
                </div>
            </div>
            <div class="col-sm-4 py-3" style="height:200px;">
                <div class="card card-body h-100 border-primary">
                    <a href=""><button class="admin-button">Upload Attendance</button></a>
                </div>
            </div>
            <div class="col-sm-4 py-3 h-200">
                <div class="card h-100 card-body">
                    <a href=""><button class="admin-button">Set Result</button></a>
                </div>
            </div>
            <div class="col-sm-4 py-3 h-200">
                <div class="card card-body text-white h-100">
                    <a href=""><button class="admin-button">Feedback List</button></a>
                </div>
            </div>
            <div class="col-sm-4 py-3" style="height:200px;">
                <div class="card card-body h-100 text-white">
                   <a href=""> <button class="admin-button">Faculty List</button></a>
                </div>
            </div>
            <div class="col-sm-4 py-3 h-200">
                <div class="card card-body h-100 text-white">
                    <a href=""><button class="admin-button">Update Faculty Flag</button></a>
                </div>
            </div>
            <div class="col-sm-4 py-3 h-200">
                <div class="card card-body text-white h-100">
                    <a href=""><button class="admin-button">Upload Exam Paper</button></a>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-4 py-3" style="height:200px;">
                <div class="card card-body text-white h-100">
                   <a href=""><button class="admin-button">Upload links</button></a>
                </div>
            </div>
            <div class="col-sm-4 py-3" style="height:200px;">
                <div class="card card-body text-white h-100">
                    <a href=""><button class="admin-button">Set Notice</button></a>
                </div>
            </div>
        </div>
    </div>

    <footer class="text-center text-lg-start bg-light text-muted">
    	<div class="text-center p-4"
			style="background-color: rgba(0, 0, 0, 0.05);">
			© 2022 CDAC. All rights reserved: <a class="text-reset fw-bold"
				href="https://acts.cdac.in/">acts.cdac.in</a>
		</div>
    </footer>
</body>
</html>