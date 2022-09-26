<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>CDAC APP | Student Portal </title>
<link rel="icon" type="image/x-icon" href="img/cdac.jpeg">

<!-- Framework Links -->
<link href="css/bootstrap/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery-3.6.1.js"></script>
<script src="js/bootstrap/bootstrap.bundle.min.js"></script>

<!-- Custom CSS -->
<link rel="stylesheet" href="css/login.css" />
<link rel="stylesheet" href="css/feedBackList.css" />
<link rel="stylesheet" href="css/dashboard.css" type="text/css"/>
<link rel="stylesheet" href="css/styleNavbarAndFooter.css" type="text/css" />

<!-- Custom JS -->
<script src="js/activeDoubtList.js"></script>
<script src="js/login.js"></script>
<script src="js/dashboard.js"></script>
<script src="js/commonAdminTiles.js"></script>

	
</head>
<body>
	  <section class="form-01-main">
        <div class="form-cover">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              <div class="form-sub-main">
                <div class="_main_head_as">
                  <a href="#">
                    <img src="img/cdac.jpeg">
                  </a>
                </div>
                <div>
                  <div style="margin-top: -10px;">
                 <p style="color: rgb(65, 105, 225); font-size: 14px;"><b>CENTER FOR DEVELOPMENT OF ADVANCED COMPUTING</b></p>
                 
                 <h5 style="color: blue; display: inline-block;">CDAC&nbsp;</h5><h5 style="color: red; display: inline-block; ">ACTS - PUNE</h5>
                 <hr size="2px">
                 <h4 style="color: rgb(65, 105, 225);">Student Portal</h4>
                 </div>
				<form id="loginForm" method="POST" action="">
                <div class="form-group">
                    <input id="prnNo" name="prn" class="form-control _ge_de_ol" type="text" placeholder="PRN No" required="" aria-required="true">
                </div>
  
                <div class="form-group">                                              
                  <input id="password" type="password" class="form-control" name="password" placeholder="********" required="required">
                  <i toggle="#password" class="fa fa-fw fa-eye toggle-password field-icon"></i>
                </div>
  
                <div class="form-group">
                  <div class="btn_uy">
                    <button id="login" type="submit">Login</button>
                  </div>
                </div>
                </form>
                  <div class="check_box_main">
                    Not registered?
                    <a href="${pageContext.request.contextPath}/register" class="pas-text" id="register">Register</a>
                  </div>
              </div>
            </div>
          </div>
        </div>
        </div>
        </div>
      </section>
</body>
</html>