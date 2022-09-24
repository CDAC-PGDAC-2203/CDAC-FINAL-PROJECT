<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>CDAC APP | Login</title>
<link href="css/bootstrap/bootstrap.min.css" rel="stylesheet">
<script src="js/bootstrap/bootstrap.bundle.min.js"></script>
<script src="js/jquery-3.6.1.js"></script>
<script src="js/login.js"></script>
	<style>
        *{
            padding: 0;
            margin: 0;
            box-sizing:border-box;
        }
        body{
            background:rgb(65, 105, 225);
            height:600px;
        }
        .row{
            background: white;
            border-radius: 30px;
            box-shadow: 12px 12px 22px rgb(100, 99, 99);
        }
        img{
            border-top-left-radius: 30px;
            border-bottom-left-radius: 30px;
        }
        .btn1{
            border: none;
            outline: none;
            height: 50px;
            width:100%;
            background-color:rgb(65, 105, 225);
            color: white;
            border-radius: 4px;
            font-weight: bold;
        }
        .btn1:hover{
            background:rgb(35, 81, 221);
            border:1px solid;
        }
        a:link {
            text-decoration: none;
        }
    </style>
</head>
<body>
	 <section class="Form my-4 mx-5">
        <div class="container-fluid">
            <div class="row no-gutters">
                <div class="col-lg-5 mt-4" style="text-align: center;">
                    <img src="./img/cdac.jpeg" width="100" height="100" class="img-fluid">
                    <h4 style="color:rgb(35, 81, 221);">CENTER FOR DEVELOPMENT OF ADVANCED COMPUTING</h4>
                </div>
                <div class="col-lg-7 px-5 pt-4">
                    <h1 class="font-weight-bold py-3">CDAC STUDENT PORTAL</h1>
                    <h4>Sign in to your acccout</h4>
                    <form id="loginForm" method="POST" action="">
                        <div class="form-row">
                            <div class="col-lg-7"> 
                                <input id="prnNo" type="text" placeholder="PRN No."class="form-control my-3 p-4"> 
                            </div>    
                        </div>
                        <div class="form-row">
                            <div class="col-lg-7"> 
                                <input id="password" type="password" placeholder="Password"class="form-control my-3 p-4"> 
                            </div>    
                        </div>
                        <div class="form-row">
                            <div class="col-lg-7"> 
                                <button id="login" type="submit" class="btn1 mt-3 mb-5">Login</button> 
                            </div>    
                        </div>
                    </form>
                    <h5>
                   		 Not registered? <a id="register" href="${pageContext.request.contextPath}/register">Register</a>
                	</h5>
                </div>
            </div>
        </div>
    </section>
    <footer class="text-center text-lg-start bg-light text-muted">
    	<div class="text-center p-4"
			style="background-color: rgba(0, 0, 0, 0.05);">
			© 2022 CDAC. All rights reserved: <a class="text-reset fw-bold"
				href="https://acts.cdac.in/">acts.cdac.in</a>
		</div>
    </footer>
</body>
</html>