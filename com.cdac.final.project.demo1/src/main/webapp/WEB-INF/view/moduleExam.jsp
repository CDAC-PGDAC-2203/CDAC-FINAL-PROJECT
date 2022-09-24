<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>CDAC APP | Module Exam</title>
<link href="css/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css">
<script src="js/bootstrap/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="css/styleNavbarAndFooter.css" />
<link rel="stylesheet" href="css/moduleExam.css" />
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


	<div class="outermostdiv">
		<div class="container outerdiv">
			<div class="mod-list">Module List</div>
			<div class="inner-div">
				<table class="table table-striped">
					<tbody>
						<tr style="font-family: helvetica;">
							<td scope="row">
								<button type="button" class="btn btn-warning btn-arrow-right">
									Module 1</button>
							</td>
							<td style="color: black; text-align: center; padding-top: 18px;">
								Core Java</td>
							<td><button id="mod1exam" class="btn1">Start Exam</button></td>
						</tr>
						<tr style="font-family: helvetica;">
							<td scope="row">
								<button type="button" class="btn btn-warning btn-arrow-right">
									Module 2</button>
							</td>
							<td style="color: black; text-align: center; padding-top: 18px;">
								Database Technologies</td>
							<td><button id="mod2exam" class="btn1">Start Exam</button></td>
						</tr>
						<tr style="font-family: helvetica;">
							<td scope="row">
								<button type="button" class="btn btn-warning btn-arrow-right">
									Module 3</button>
							</td>
							<td style="color: black; text-align: center; padding-top: 18px;">
								Concepts of Programming</td>
							<td><button id="mod3exam" class="btn1">Start Exam</button></td>
						</tr>
						<tr style="font-family: helvetica;">
							<td scope="row">
								<button type="button" class="btn btn-warning btn-arrow-right">
									Module 4</button>
							</td>
							<td style="color: black; text-align: center; padding-top: 18px;">
								Software Development Methodologies</td>
							<td><button id="mod4exam" class="btn1">Start Exam</button></td>
						</tr>
						<tr style="font-family: helvetica;">
							<td scope="row">
								<button type="button" class="btn btn-warning btn-arrow-right">
									Module 5</button>
							</td>
							<td style="color: black; text-align: center; padding-top: 18px;">
								Operating Systems</td>
							<td><button id="mod5exam" class="btn1">Start Exam</button></td>
						</tr>
						<tr style="font-family: helvetica;">
							<td scope="row">
								<button type="button" class="btn btn-warning btn-arrow-right">
									Module 6</button>
							</td>
							<td style="color: black; text-align: center; padding-top: 18px;">
								Alogirthms and Data Structures</td>
							<td><button id="mod6exam" class="btn1">Start Exam</button></td>
						</tr>
						<tr style="font-family: helvetica;">
							<td scope="row">
								<button type="button" class="btn btn-warning btn-arrow-right">
									Module 7</button>
							</td>
							<td style="color: black; text-align: center; padding-top: 18px;">
								Web Programming Technology</td>
							<td><button id="mod7exam" class="btn1">Start Exam</button></td>
						</tr>
						<tr style="font-family: helvetica;">
							<td scope="row">
								<button type="button" class="btn btn-warning btn-arrow-right">
									Module 8</button>
							</td>
							<td style="color: black; text-align: center; padding-top: 18px;">
								Advanced Java</td>
							<td><button id="mod8exam" class="btn1">Start Exam</button></td>
						</tr>
					</tbody>
				</table>
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
								<img
								src="./img/2901214.png"
								style="height: 13px; width: 13px;" />
							</a>
						</p>
						<p>
							<i class="fas fa-phone"></i> Phone: +91-20-25503100 <br>
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
		<div class="text-center p-4"
			style="background-color: rgba(0, 0, 0, 0.05);">
			� 2022 CDAC. All rights reserved: <a class="text-reset fw-bold"
				href="https://acts.cdac.in/">acts.cdac.in</a>
		</div>
		<!-- Copyright -->
	</footer>
	<!-- Footer -->
</body>
</html>