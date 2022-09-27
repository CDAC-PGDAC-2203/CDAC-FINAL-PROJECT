<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<body>
	<style>
.ouetrmostdiv {
	height: 464px;
	width: 100%;
}

.outerdiv {
	padding: 20px;
	padding-top: 30px;
	padding-bottom: 15px;
	text-align: center;
	background-color: lightgray;
	margin-top: 30px;
	border-radius: 1%;
}

.mod-list {
	margin-bottom: 20px;
	font-size: 25px;
	font-family: "Google Sans", Roboto, Arial, sans-serif;
	background-color: gold;
	color: black;
	border: 1px solid gray;
	width: 30%;
	height: 45px;
	margin-left: auto;
	margin-right: auto;
	border-radius: 45%;
}

.btn1 {
	border-radius: 45%;
	height: 45px;
	width: 120px;
	background-color: gold;
	border: none;
}

.btn1:hover {
	color: whitesmoke;
}

td {
	border-radius: 5%;
	font-family: "Google Sans", Roboto, Arial, sans-serif;
	font-size: 18px;
}

.btn { /* just for this demo. */
	margin-top: 4px;
}

.btn-arrow-right {
	position: relative;
	padding-right: 18px;
	padding-left: 30px;
}

.btn-arrow-right:before, .btn-arrow-right:after {
	/* make two squares (before and after), looking similar to the button */
	content: "";
	position: absolute;
	top: 13%; /* move it down because of rounded corners */
	width: 27px; /* same as height */
	height: 27px; /* button_outer_height / sqrt(2) */
	background: inherit; /* use parent background */
	border: inherit; /* use parent border */
	border-left-color: none; /* hide left border */
	border-bottom-color: none; /* hide bottom border */
	border-radius: 0px 4px 0px 0px;
	/* round arrow corner, the shorthand property doesn't accept "inherit" so it is set to 4px */
	-webkit-border-radius: 0px 4px 0px 0px;
	-moz-border-radius: 0px 4px 0px 0px;
}

.btn-arrow-right:before, .btn-arrow-right:after {
	transform: rotate(42deg);
	/* rotate right arrow squares 45 deg to point right */
	-webkit-transform: rotate(42deg);
	-moz-transform: rotate(42deg);
	-o-transform: rotate(42deg);
	-ms-transform: rotate(42deg);
}

.btn-arrow-right:before, .btn-arrow-right:after {
	/* align the "after" square to the right */
	right: -15px;
}

.btn-arrow-right:after, .btn-arrow-left:before {
	/* bring arrow pointers to front */
	z-index: 1;
}

.btn-arrow-right:before, .btn-arrow-left:after {
	/* hide arrow tails background */
	background-color: gold;
}
</style>
	
	<!-- NAV BAR WILL BE DRAWN -->
	<nav class="navbar navbar-expand-lg navbar-light" id="navbar-1">
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
								<img src="./img/2901214.png" style="height: 13px; width: 13px;" />
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
	<script src="js/navBar.js"></script>
	<script src="js/studentDashboardNavbar.js"></script>
</body>