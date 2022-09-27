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
           <input id="oldPassword" type="password" placeholder="Current Password" class="input-control" required>
           </div>
           <div class="input-block">
           <input id="newPassword" type="password" placeholder="New Password" class="input-control">
        </div>
        <div class="input-block">
            <input id="newRetypePassword" type="password" placeholder="Retype New Password" class="input-control">
         </div>
        <div class="input-box">
            <button class="btn" id="chPassword">Change Password</button>
        </div>
        <span id="message"></span>
       
        </div>
    </div>
    
       <!-- Footer -->
  <footer class="text-center text-lg-start bg-light text-muted">

    <!-- Section: Links  -->
    <section class="">
      <div class="container text-center text-md-start mt-5">
        <!-- Grid row -->
        <div class="row mt-3">
          <!-- Grid column -->
          <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4 mt-4">
            <!-- Links -->
            <h5 class="text-uppercase fw-bold mb-4">
              Courses
            </h5>
            <p id="pg-dac">
              <a href="#!" class="text-reset">PG-DAC</a>
            </p>
            <p id="pg-dbda">
              <a href="#!" class="text-reset">PG-DBDA</a>
            </p>
            <p id="pg-desd">
              <a href="#!" class="text-reset">PG-DESD</a>
            </p>
          </div>
          <!-- Grid column -->

          <!-- Grid column -->
          <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4 mt-4">
            <!-- Links -->
            <h5 class="text-uppercase fw-bold mb-4">
              Links
            </h5>
            <p id="dashboard">
              <a href="" class="text-reset">Dashboard</a>
            </p>
            <p id="exam">
              <a href="#!" class="text-reset">Exam</a>
            </p>
            <p id="result">
              <a href="#!" class="text-reset">Result</a>
            </p>
            <p id="feedback">
              <a href="#!" class="text-reset">Feedback</a>
            </p>
          </div>
          <!-- Grid column -->

          <!-- Grid column -->
          <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4 mt-4" style="padding-bottom: 20px;">
            <!-- Links -->
            <h5 class="text-uppercase fw-bold mb-4">Contact</h5>
            <p><i class="fas fa-home"></i>
              Centre for Development of Advanced Computing,
              C-DAC Innovation Park 34, B/1,
              Panchwati Road, Pashan,
              Pune, Maharashtra 411008
              <a href="https://www.google.com/maps/place/CENTRE+FOR+DEVELOPMENT+OF+ADVANCED+COMPUTING,+Panchawati+Rd,+Mansarovar,+Pashan,+Pune,+Maharashtra+411008/@18.5349721,73.8105031,19z/data=!4m5!3m4!1s0x3bc2bf0e5dca0f97:0xaed6c14da20b1d0f!8m2!3d18.5350147!4d73.8108441?shorturl=1">
                <img src="./img/2901214.png" style="height: 13px; width: 13px;" />
              </a>
            </p>
            <p>
              <i class="fas fa-phone"></i>
              Phone: +91-20-25503100
              <br>
              Fax: +91-20-25503131
            </p>
          </div>
          <!-- Grid column -->

        </div>
        <!-- Grid row -->

      </div>
    </section>
    <!-- Section: Links  -->
    <!-- Copyright -->
    <div class="text-center p-4" style="background-color: rgba(0, 0, 0, 0.05);">
      © 2022 CDAC. All rights reserved:
      <a class="text-reset fw-bold" href="https://acts.cdac.in/">acts.cdac.in</a>
    </div>
    <!-- Copyright -->
  </footer>
  <!-- Footer -->
  	<script src="js/navBar.js"></script>
	<script src="js/studentDashboardNavbar.js"></script>
  	<script src="js/changePassword.js"></script>
</body>