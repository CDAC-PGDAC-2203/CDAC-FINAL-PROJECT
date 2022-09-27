<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<body>
<style>
    body{
        background-color: rgb(65, 105, 225);
    }
    .main-container{
        /* border: 1px solid black; */
        height: 97vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    .login-box{
        /* border: 1px solid black; */
        /* width: 100px; */
        /* height: 100px; */
        padding: 4rem;
        background-color :aliceblue;
        box-shadow: 2px 2px 8px -4px;
    }
    .input-block{
        margin-bottom: 1.5rem;
        
        
    }
    .input-control{
        border: none;
        height: 3.5rem;
        width: 21rem;
        border-radius: 3px;
        padding-left: 10px;
    
    }
    .btn{
        font-size: 1rem;
        height: 3rem;
        width: 21rem;
        border: none;
        background-color: rgb(65, 105, 225);
        color: white;
    }
    .btn:hover{
        background-color: gold;
    }
   .input-control:focus{
       outline: none;
   }
  
   
</style>
	<!-- NAV BAR WILL BE DRAWN -->
	<nav class="navbar navbar-expand-lg navbar-light" id="navbar-1">
	</nav>

    <div class="main-container">
        <div class="login-box">
            <div class="input-block">
           <input id="oldPassword" type="password" placeholder="Current Password" class="input-control" required="required" aria-required="true">
             <p id="changeOldPassword_message" style="color: red;font-size: 11px; margin-top: 0px;"></p>
           </div>
           <div class="input-block">
           <input id="newPassword" type="password" placeholder="New Password" class="input-control" required="required" aria-required="true">
           <p id="changeNewPassword_message" style="color: red;font-size: 11px; margin-top: 0px;"></p>
        </div>
        <div class="input-block">
            <input id="newRetypePassword" type="password" placeholder="Retype New Password" class="input-control" required="required" aria-required="true">
            <p id="changeRetypePassword_message" style="color: red;font-size: 11px; margin-top: 0px;"></p>
         </div>
        <div class="input-box">
            <button class="btn" id="chPassword">Change Password</button>
        </div>
        <span id="message"></span>
       
        </div>
    </div>

	<!-- FOOTER WILL BE DRAWN-->
	<footer class="text-center text-lg-start bg-light text-muted" id="studentFooter">
	</footer>
	<!-- Footer -->    

  	<script src="js/navBar.js"></script>
  	<script src="js/footerStudent.js"></script>
	<script src="js/studentDashboardNavbarFooter.js"></script>
  	<script src="js/changePassword.js"></script>
</body>