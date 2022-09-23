<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>CDAC APP | Exam</title>
<link href="./css/bootstrap/bootstrap.min.css" rel="stylesheet"
	type="text/css">
<script src="./js/bootstrap/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="./css/styleNavbarAndFooter.css" />
<link rel="stylesheet" href="./css/examPageMod1.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light" id="navbar-1">
		<a class="navbar-brand" href="#"><img class="img-responsive"
			src="./img/cdac-logo.jpeg"></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse justify-content-end"
			id="navbarNav">
			<ul class="navbar-nav">

				<li id="dashboard" class="nav-item active"><a class="nav-link"
					href="#">Dashboard</a></li>

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">Join
						Link</a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdown">
						<li id="theory"><a class="dropdown-item" href="#">Theory</a>
						</li>
						<li><a class="dropdown-item" href="#"> Lab &raquo; </a>
							<ul class="dropdown-menu dropdown-submenu">
								<li id="b1"><a class="dropdown-item" href="#">B1</a></li>
								<li id="b2"><a class="dropdown-item" href="#">B2</a></li>
								<li id="b3"><a class="dropdown-item" href="#">B3</a></li>
								<li id="b4"><a class="dropdown-item" href="#">B4</a></li>
							</ul></li>
					</ul></li>

				<li id="exam" class="nav-item"><a class="nav-link" href="#">Exam</a>
				</li>
				<li id="result" class="nav-item"><a class="nav-link" href="#">Result</a>
				</li>
				<li id="feedback" class="nav-item"><a class="nav-link" href="#">Feedback</a>
				</li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false"></a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdown">
						<li id="myprofile"><a class="dropdown-item" href="#">My
								Profile</a></li>
						<li id="logout"><a class="dropdown-item" href="#">Logout</a></li>
					</ul></li>
			</ul>
		</div>
	</nav>

	<div class="container-box mt-sm-5 my-1">
		<h4 style="text-align: center;">
			<b>Module : <span id="examPageMod1Name"></span></b>
		</h4>
		<br>
		<div class="question ml-sm-5 pl-sm-5 pt-2" style="margin-left: 10%;">
			<div id="mod1q1" class="py-2 h5">
				<b>Q1. What is the number of primitive data types in Java?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod1q1opt1" class="options">6 <input type="radio"
					name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q1opt2" class="options">7 <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q1opt3" class="options">8 <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q1opt4" class="options">9 <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod1q2" class="py-2 h5">
				<b>Q2. What is the size of float and double in java?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod1q2opt1" class="options">32 and 64 <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q2opt2" class="options">32 and 32 <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q2opt3" class="options">64 and 64 <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q2opt4" class="options">64 and 32 <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod1q3" class="py-2 h5">
				<b>Q3. Automatic type conversion is possible in which of the
					cases?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod1q3opt1" class="options">byte to int <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q3opt2" class="options">int to long <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q3opt3" class="options">long to int <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q3opt4" class="options">double to int <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod1q4" class="py-2 h5">
				<b>Q4. Select the valid statement.</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod1q4opt1" class="options">char[] ch = new
					char(5) <input type="radio" name="radio"> <span
					class="checkmark"></span>
				</label> <label id="mod1q4opt2" class="options">char[] ch = new
					char[5] <input type="radio" name="radio"> <span
					class="checkmark"></span>
				</label> <label id="mod1q4opt3" class="options">char[] ch = new char
					<input type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q4opt4" class="options">char[] ch = new
					char[] <input type="radio" name="radio"> <span
					class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod1q5" class="py-2 h5">
				<b>Q5. When an array is passed to a method, what does the method
					receive?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod1q5opt1" class="options">Reference of array <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q5opt2" class="options">Copy of array <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q5opt3" class="options">Length of array <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q5opt4" class="options">None of the above <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod1q6" class="py-2 h5">
				<b>Q6. What is the implicit return type of constructor?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod1q6opt1" class="options">No return type <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q6opt2" class="options">A class object in
					which it is defined <input type="radio" name="radio"> <span
					class="checkmark"></span>
				</label> <label id="mod1q6opt3" class="options">int <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q6opt4" class="options">All of the above <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod1q7" class="py-2 h5">
				<b>Q7. Arrays in java are</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod1q7opt1" class="options">Object refereces <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q7opt2" class="options">Objects <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q7opt3" class="options">Primitive data type
					<input type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q7opt4" class="options">None of the above <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod1q8" class="py-2 h5">
				<b>Q8. A package is a collection of</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod1q8opt1" class="options">Editing tools <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q8opt2" class="options">Classes <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q8opt3" class="options">Classes and
					interfaces <input type="radio" name="radio"> <span
					class="checkmark"></span>
				</label> <label id="mod1q8opt4" class="options">Interfaces <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod1q9" class="py-2 h5">
				<b>Q9. When is the object created with new keyword?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod1q9opt1" class="options">At run time <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q9opt2" class="options">At compile time <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q9opt3" class="options">Depends on code <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q9opt4" class="options">All of the above <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod1q10" class="py-2 h5">
				<b>Q10. Identify the keyword among the following that makes a
					variable belong to a class,rather than being defined for each
					instance of the class.</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod1q10opt1" class="options">Final <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q10opt2" class="options">Static <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q10opt3" class="options">Volatile <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q10opt4" class="options">Abstract <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod1q11" class="py-2 h5">
				<b>Q11. In which of the following is toString() method defined?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod1q11opt1" class="options">java.lang.Object <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q11opt2" class="options">java.lang.String <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q11opt3" class="options">java.lang.util <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q11opt4" class="options">None of the above <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod1q12" class="py-2 h5">
				<b>Q12. compareTo() returns</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod1q12opt1" class="options">True <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q12opt2" class="options">False <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q12opt3" class="options">An int value <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q12opt4" class="options">A double value <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod1q13" class="py-2 h5">
				<b>Q13. Identify the return type of a method that does not
					return any value.</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod1q13opt1" class="options">int <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q13opt2" class="options">void <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q13opt3" class="options">double <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q13opt4" class="options">char <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod1q14" class="py-2 h5">
				<b>Q14. To which of the following does the class string belong
					to?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod1q14opt1" class="options">java.lang <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q14opt2" class="options">java.util <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q14opt3" class="options">java.awt <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q14opt4" class="options">java.applet <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod1q15" class="py-2 h5">
				<b>Q15. Output of Math.floor(3.6)?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod1q15opt1" class="options">3 <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q15opt2" class="options">3.0 <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q15opt3" class="options">4 <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod1q15opt4" class="options">4.0 <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
		</div>
		<br>
		<div class="d-flex align-items-center pt-3">
			<div id="prev" style="margin: auto;">
				<button class="btn btn-primary">End Exam</button>
			</div>
			<div id="prev" style="margin: auto;">
				<button class="btn btn-primary">Submit</button>
			</div>
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
						<h5 class="text-uppercase fw-bold mb-4">Courses</h5>
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
						<h5 class="text-uppercase fw-bold mb-4">Links</h5>
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
					<div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4 mt-4"
						style="padding-bottom: 20px;">
						<!-- Links -->
						<h5 class="text-uppercase fw-bold mb-4">Contact</h5>
						<p>
							<i class="fas fa-home"></i> Centre for Development of Advanced
							Computing, C-DAC Innovation Park 34, B/1, Panchwati Road, Pashan,
							Pune, Maharashtra 411008 <a
								href="https://www.google.com/maps/place/CENTRE+FOR+DEVELOPMENT+OF+ADVANCED+COMPUTING,+Panchawati+Rd,+Mansarovar,+Pashan,+Pune,+Maharashtra+411008/@18.5349721,73.8105031,19z/data=!4m5!3m4!1s0x3bc2bf0e5dca0f97:0xaed6c14da20b1d0f!8m2!3d18.5350147!4d73.8108441?shorturl=1">
								<img src="./img/2901214.png" style="height: 13px; width: 13px;" />
							</a>
						</p>
						<p>
							<i class="fas fa-phone"></i> Phone: +91-20-25503100<br> <i
								class="fas fa-fax"></i> Fax: +91-20-25503131
						</p>
					</div>
					<!-- Grid column -->

				</div>
				<!-- Grid row -->

			</div>
		</section>
		<!-- Section: Links  -->
		<!-- Copyright -->
		<div class="text-center p-4"
			style="background-color: rgba(0, 0, 0, 0.05);">
			© 2022 CDAC. All rights reserved: <a class="text-reset fw-bold"
				href="https://acts.cdac.in/">acts.cdac.in</a>
		</div>
		<!-- Copyright -->
	</footer>
	<!-- Footer -->
</body>
</html>