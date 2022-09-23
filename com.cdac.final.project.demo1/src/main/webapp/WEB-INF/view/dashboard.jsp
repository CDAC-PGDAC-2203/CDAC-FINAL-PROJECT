<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>CDAC APP | Dashboard</title>
<link href="./css/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css">
<script src="./js/bootstrap/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="./css/styleNavbarAndFooter.css" />
<link rel="stylesheet" href="./css/dashboard.css" />
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
  <!-- Dashboard -->

    <div class="center_div">
        <div class="container-fluid outer-div">
            <div class="row">
                <div class="col-lg-4 col-12 left-div">
                    <div class="row" style="height: 25vh;">
                        <h3 class="performance-heading">Performance index</h3>
                </div>
               <div class="row" style="height: 30vh">
                     <!-- <p>performance index start</p> -->
                     <div class="col-lg-6">
                           <div class="skill">
                                <div class="outer">
                                   <div class="inner">
                                         <div id="number">
                                             65%
                                          </div>
                                   </div>
                               </div>
                         <svg xmlns="http://www.w3.org/2000/svg" version="1.1" width="160px" height="160px">
                           <defs>
                         <linearGradient id="GradientColor">
                            <stop offset="0%" stop-color="#e91e63" />
                            <stop offset="100%" stop-color="#673ab7" />
                         </linearGradient>
                      </defs>
                      <circle cx="80" cy="80" r="70" stroke-linecap="round" />
                       </svg>
                    </div>
                    <h6>Current performance</h6>
                  </div>
               </div>
               <div class="col-lg-6">
                <div class="skill">
                  <div class="outer">
                      <div class="inner">
                          <div id="number">
                              65%
                          </div>
                      </div>
                  </div>
                  <svg xmlns="http://www.w3.org/2000/svg" version="1.1" width="160px" height="160px">
                      <defs>
                         <linearGradient id="GradientColor">
                            <stop offset="0%" stop-color="#e91e63" />
                            <stop offset="100%" stop-color="#673ab7" />
                         </linearGradient>
                      </defs>
                      <circle cx="80" cy="80" r="70" stroke-linecap="round" />
              </svg>
              </div>
              <h6>Overall performance</h6>
             </div>
            </div>
                
            <!-- right div -->
            <div class="col-lg-8 col-12 right-div">
                <div class="row">
                        <!-- Schedule start -->
                        <div class="col-lg-4 top_first_div">
                           <!-- <p>schdeule</p> -->
                           <div class="container schedule-outer">
                            <div class="row">
                              <div class="col theory-div">
                                <h4 class="schedule-heading">Theory :</h4>
                              </div>
                              <div class="col lab-div">
                                <h4 class="schedule-heading" id="theory-timing">7:30AM</h4>
                              </div>
                              <div class="w-100"></div>
                              <div class="col theory-div">
                                <h4 class="schedule-heading">Lab :</h4>
                              </div>
                              <div class="col lab-div">
                                <h4 class="schedule-heading" id="lab-timing">3:30PM</h4>
                              </div>
                             
                            </div> 
                            <div class="row">
                                <button type="submit" id="submit" class="scheduleButton">Weekly-schedule</button>
                            </div>
                        </div>
                          <!-- Schedule end-->
                </div>

                <div class="col-lg-8">
                    <div class="notice-board-div">
                        <marquee direction = "down" id="noticeBoard" scrollamount="5" loop="true" onmouseover="stop()" onmouseout="start()">
                          <div class="desc" id="desc">The direction of text will be from bottom to top.</div>
                          <div class="desc" id="desc">The direction of text will be from bottom to top.</div>
                          <div class="desc" id="desc">The direction of text will be from bottom to top.</div>
                          <div class="desc" id="desc">The direction of text will be from bottom to top.</div>
                          <div class="desc" id="desc">The direction of text will be from bottom to top.</div>
                          <div class="desc" id="desc">The direction of text will be from bottom to top.</div>
                          <div class="desc" id="desc">The direction of text will be from bottom to top.</div>
                          <div class="desc" id="desc">The direction of text will be from bottom to top.</div>
                        </marquee>
                    </div>
                </div>

            </div>

                <div class="row">
                    <div class="col-lg-4 bottom_first_div">
                        <!-- <p>doubt forum</p> -->
                         <div class="doubt-div">
                            <h4 class="doubtForum">Doubt Forum</h4>
                           <form>
                            <div class="form-group">
                                <select class="form-select mt-2" id="chooseSub" required>
                                   <option selected disabled value="">Choose Subject</option>
                                   <option value="Cop">Concept of Programming</option>
                                   <option value="DBT">Database Technologies</option>
                                   <option value="j2se">J2SE</option>
                                   <option value="j2ee">J2EE</option>
                                   <option value="wpt">Web programming</option>
                                   <option value=".net">MS .NET</option>
                                </select>
                          </div>
                        <div class="form-group">
                             <!-- <label for="Textarea" id="content" class="doubtContent mt-2">Doubt content</label>
                             -->
                             <p class="doubtContent mt-1">Doubt Content</p>
                             <textarea class="form-control" id="Textarea" rows="3"></textarea>
                        </div>
                        <div class="form-group">
                            <input type="file">
                            <button type="submit" id="submit" class="doubtSubmit">Submit</button>
                        </div>
                       
                          </form>
                      </div>
                    </div>

                <!-- attendance bar graph -->

                <div class="col-lg-8 bottom_second_div">
                        <!-- <p>attendance</p> -->
              <!-- chart start -->
              <div class="attendance-div">
                <div class="chart">
                  <ul class="numbers">
                    <li><span>100%</span></li>
                    <li><span>50%</span></li>
                    <li><span>0%</span></li>
                  </ul>
                  <ul class="bars">
                    <li>
                      <div class="bar" data-percentage="50"></div><span>Module 01</span>
                    </li>
                    <li>
                      <div class="bar" data-percentage="30"></div><span>Module 02</span>
                    </li>
                    <li>
                      <div class="bar" data-percentage="60"></div><span>Module 03</span>
                    </li>
                    <li>
                      <div class="bar" data-percentage="100"></div><span>Module 04</span>
                    </li>
                    <li>
                      <div class="bar" data-percentage="80"></div><span>Module 05</span>
                    </li>
                  </ul>
                </div>
              </div>
              <!-- <!-- chart end -->



        
                      
                    </div>

                </div>
            </div>
        </div>
        </div>
    </div>
    <script>
        let number = document.getElementById("number");
        let counter = 0;
        setInterval(() => {
            if(counter == 65){
                clearInterval();
            }else{
            counter += 1;
            number.innerHTML = counter + "%";
            }
        }, 30);
    </script>
     <script type="text/javascript">
        $(function () {
          $('.bars li .bar').each(function (key, bar) {
            var percentage = $(this).data('percentage');
            $(this).animate({
              'height': percentage + '%'
            }, 1000)
          });
        });
      </script>
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