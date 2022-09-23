<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>CDAC APP | Exam</title>
<link href="css/bootstrap/bootstrap.min.css" rel="stylesheet"
	type="text/css">
<script src="js/bootstrap/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="css/styleNavbarAndFooter.css" />
<link rel="stylesheet" href="css/examPageMod2.css" />
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
			<b>Module : <span id="examPageMod2Name"></span></b>
		</h4>
		<br>
		<div class="question ml-sm-5 pl-sm-5 pt-2" style="margin-left: 10%;">
			<div id="mod2q1" class="py-2 h5">
				<b>Q1. What is the full form of DBMS?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod2q1opt1" class="options">Data of Binary
					Management System <input type="radio" name="radio"> <span
					class="checkmark"></span>
				</label> <label id="mod2q1opt2" class="options">Database Management
					System <input type="radio" name="radio"> <span
					class="checkmark"></span>
				</label> <label id="mod2q1opt3" class="options">Database Management
					Service <input type="radio" name="radio"> <span
					class="checkmark"></span>
				</label> <label id="mod2q1opt4" class="options">Data Backup
					Management System <input type="radio" name="radio"> <span
					class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod2q2" class="py-2 h5">
				<b>Q2. What is a database?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod2q2opt1" class="options">Organized collection
					of information that cannot be accessed updated and managed <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q2opt2" class="options">Collection of data
					or information without organizing <input type="radio" name="radio">
					<span class="checkmark"></span>
				</label> <label id="mod2q2opt3" class="options">Organized collection
					of data or information that can be accessed updated and managed <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q2opt4" class="options">Organized collection
					of data that cannot be updated <input type="radio" name="radio">
					<span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod2q3" class="py-2 h5">
				<b>Q3. In which of the following formats data is stored in the
					database management system?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod2q3opt1" class="options">Image <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q3opt2" class="options">Text <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q3opt3" class="options">Table <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q3opt4" class="options">Graph <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod2q4" class="py-2 h5">
				<b>Q4. Which of the following is not a type of database?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod2q4opt1" class="options">Hierarchical <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q4opt2" class="options">Network <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q4opt3" class="options">Distributed <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q4opt4" class="options">Decentralized <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod2q5" class="py-2 h5">
				<b>Q5. Which of the following is not an example of DBMS?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod2q5opt1" class="options">MySQL <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q5opt2" class="options">Microsoft Access <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q5opt3" class="options">IBM DB2 <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q5opt4" class="options">Google <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod2q6" class="py-2 h5">
				<b>Q6. Which of the following is a function of the DBMS?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod2q6opt1" class="options">Storing data <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q6opt2" class="options">Providing
					multi-users access control <input type="radio" name="radio">
					<span class="checkmark"></span>
				</label> <label id="mod2q6opt3" class="options">Data Integrity <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q6opt4" class="options">All of the above <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod2q7" class="py-2 h5">
				<b>Q7. Which of the following is a component of the DBMS?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod2q7opt1" class="options">Data <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q7opt2" class="options">Data Languages <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q7opt3" class="options">Data Manager <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q7opt4" class="options">All of the above <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod2q8" class="py-2 h5">
				<b>Q8. What is information about data called?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod2q8opt1" class="options">Hyper data <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q8opt2" class="options">Tera data <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q8opt3" class="options">Meta data <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q8opt4" class="options">Relations <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod2q9" class="py-2 h5">
				<b>Q9. RDBMS consist of collection of?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod2q9opt1" class="options">Records <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q9opt2" class="options">Keys <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q9opt3" class="options">Tables <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q9opt4" class="options">Fields <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod2q10" class="py-2 h5">
				<b>Q10. The ability to query data as well as insert delete and
					alter tuples is offered by</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod2q10opt1" class="options">TCL <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q10opt2" class="options">DCL <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q10opt3" class="options">DDL <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q10opt4" class="options">DML <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod2q11" class="py-2 h5">
				<b>Q11. Which command is used to remove a relation from an SQL?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod2q11opt1" class="options">Drop table <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q11opt2" class="options">Delete <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q11opt3" class="options">Purge <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q11opt4" class="options">Remove <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod2q12" class="py-2 h5">
				<b>Q12. Operations do not preserve non-matched tuples:</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod2q12opt1" class="options">Left outer join <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q12opt2" class="options">Inner join <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q12opt3" class="options">Natural join <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q12opt4" class="options">Right outer join <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod2q13" class="py-2 h5">
				<b>Q13. For designing a normal RDBMS which of the following
					normal form is considered adequate?</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod2q13opt1" class="options">4NF <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q13opt2" class="options">3NF <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q13opt3" class="options">2NF <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q13opt4" class="options">5NF <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod2q14" class="py-2 h5">
				<b>Q14. The oldest DB model is</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod2q14opt1" class="options">Network <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q14opt2" class="options">Physical <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q14opt3" class="options">Hierarchical <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q14opt4" class="options">Relational <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label>
			</div>
			<hr>
			<div id="mod2q15" class="py-2 h5">
				<b>Q15. Automatically Unique and Not Null values are in</b>
			</div>
			<div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
				<label id="mod2q15opt1" class="options">Foreign Key <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q15opt2" class="options">Primary Key <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q15opt3" class="options">Super Key <input
					type="radio" name="radio"> <span class="checkmark"></span>
				</label> <label id="mod2q15opt4" class="options">Candidate Key <input
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