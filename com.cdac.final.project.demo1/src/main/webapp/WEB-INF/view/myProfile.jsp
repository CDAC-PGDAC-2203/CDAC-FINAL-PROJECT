<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>CDAC APP | My Profile</title>
<link href="./css/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css">
<script src="./js/bootstrap/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="./css/styleNavbarAndFooter.css" />
<link rel="stylesheet" href="./css/myProfile.css" />
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
            <a class="nav-link" href="#">Dashboard</a>
          </li>
  
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown"
              aria-expanded="false">Join Link</a>
            <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
              <li id="theory">
                <a class="dropdown-item" href="#">Theory</a>
              </li>
              <li>
                <a class="dropdown-item" href="#">
                  Lab &raquo;
                </a>
                <ul class="dropdown-menu dropdown-submenu">
                  <li id="b1">
                    <a class="dropdown-item" href="#">B1</a>
                  </li>
                  <li id="b2">
                    <a class="dropdown-item" href="#">B2</a>
                  </li>
                  <li id="b3">
                    <a class="dropdown-item" href="#">B3</a>
                  </li>
                  <li id="b4">
                    <a class="dropdown-item" href="#">B4</a>
                  </li>
                </ul>
              </li>
            </ul>
          </li>
  
          <li id="exam" class="nav-item">
            <a class="nav-link" href="#">Exam</a>
          </li>
          <li id="result" class="nav-item">
            <a class="nav-link" href="#">Result</a>
          </li>
          <li id="feedback" class="nav-item">
            <a class="nav-link" href="#">Feedback</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown"
              aria-expanded="false"></a>
            <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
              <li id="myprofile"><a class="dropdown-item" href="#">My Profile</a></li>
              <li id="logout"><a class="dropdown-item" href="#">Logout</a></li>
            </ul>
          </li>
        </ul>
      </div>
    </nav>
      <!-- MyProfile -->
      <div class="container student-profile">
        <form method="post">
          <div class="row">
            <div class="col-md-4">
              <div class="profile-img">
                <img
                  src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS52y5aInsxSm31CvHOFHWujqUx_wWTS9iM6s7BAm21oEN_RiGoog"
                  alt="" />
                <div class="file btn btn-lg btn-primary" id="imageFile">
                  Change Photo
                  <input type="file" name="file" />
                </div>
              </div>
            </div>
            <div class="col-md-6">
              <div class="profile-head" id="profileHead">
                <h5 id="uName">
                  Kamana Mathur
                </h5>
                <h6 id="centerName">
                  CDAC ACTS Pune
                </h6>
                <h3 class="profile-course" id="profileCourseName">PG-DAC</h3>
                <h6 id="uPrn">
                  2203401200097
                </h6>
                <ul class="nav nav-tabs" id="myTab" role="tablist">
                  <li class="nav-item">
                    <a class="nav-link active" id="home-tab" data-toggle="tab" href="#" role="tab" aria-controls="home"
                      aria-selected="true">About</a>
                  </li>
    
                </ul>
              </div>
            </div>
            <div class="col-md-2">
              <input type="submit" class="profile-edit-btn" name="btnAddMore" value="Edit Profile" id="editBtn"/>
              <a id="changePassword" href="#">Change Password</a>
            </div>
          </div>
          <div class="row">
            <div class="col-md-4">
              <div class="profile-work">
    
              </div>
            </div>
            <div class="col-md-8">
              <div class="tab-content profile-tab" id="myTabContent">
                <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                  <div class="row">
                    <div class="col-md-6">
                      <label>Gender</label>
                    </div>
                    <div class="col-md-6" id="profileGender">
                      <p id="genderId">Female</p>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-6">
                      <label>Date of Birth</label>
                    </div>
                    <div class="col-md-6" id="profileDob">
                      <p id="dobId">04-07-1997</p>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-6">
                      <label>Email</label>
                    </div>
                    <div class="col-md-6" id="profileEmail">
                      <p id="emailId">kamana.mathur89@gmail.com</p>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-6">
                      <label>Phone</label>
                    </div>
                    <div class="col-md-6" id="profilePhone">
                      <p id="phoneNo">8976145876</p>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-6">
                      <label>Address</label>
                    </div>
                    <div class="col-md-6" id="adr">
                      <p id="addressId">Aakriti heights,Jodhpur</p>
                    </div>
                  </div>
                </div>
    
              </div>
            </div>
          </div>
        </form>
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
              <a href="#!" class="text-reset">Dashboard</a>
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
</body>
</html>