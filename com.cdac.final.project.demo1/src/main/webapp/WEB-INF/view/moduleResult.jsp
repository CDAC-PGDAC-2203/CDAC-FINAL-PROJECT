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

.modClass {
	width: 25%;
}

.btn-warning {
	width: 50%;
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
								Concepts of Programming</td>
							<td><button id="mod1result" class="btn1">View
									Result</button></td>
						</tr>
						<tr style="font-family: helvetica;">
							<td scope="row">
								<button type="button" class="btn btn-warning btn-arrow-right">
									Module 2</button>
							</td>
							<td style="color: black; text-align: center; padding-top: 18px;">
								Database Technologies</td>
							<td><button id="mod2result" class="btn1">View
									Result</button></td>
						</tr>
						<tr style="font-family: helvetica;">
							<td scope="row">
								<button type="button" class="btn btn-warning btn-arrow-right">
									Module 3</button>
							</td>
							<td style="color: black; text-align: center; padding-top: 18px;">
								Operating Systems</td>
							<td><button id="mod3result" class="btn1">View
									Result</button></td>
						</tr>
						<tr style="font-family: helvetica;">
							<td scope="row">
								<button type="button" class="btn btn-warning btn-arrow-right">
									Module 4</button>
							</td>
							<td style="color: black; text-align: center; padding-top: 18px;">
								Software Development Methodologies</td>
							<td><button id="mod4result" class="btn1">View
									Result</button></td>
						</tr>
						<tr style="font-family: helvetica;">
							<td scope="row">
								<button type="button" class="btn btn-warning btn-arrow-right">
									Module 5</button>
							</td>
							<td style="color: black; text-align: center; padding-top: 18px;">
								Core Java</td>
							<td><button id="mod5result" class="btn1">View
									Result</button></td>
						</tr>
						<tr style="font-family: helvetica;">
							<td scope="row">
								<button type="button" class="btn btn-warning btn-arrow-right">
									Module 6</button>
							</td>
							<td style="color: black; text-align: center; padding-top: 18px;">
								Alogirthms and Data Structures</td>
							<td><button id="mod6result" class="btn1">View
									Result</button></td>
						</tr>
						<tr style="font-family: helvetica;">
							<td scope="row">
								<button type="button" class="btn btn-warning btn-arrow-right">
									Module 7</button>
							</td>
							<td style="color: black; text-align: center; padding-top: 18px;">
								Web Programming Technology</td>
							<td><button id="mod7result" class="btn1">View
									Result</button></td>
						</tr>
						<tr style="font-family: helvetica;">
							<td scope="row">
								<button type="button" class="btn btn-warning btn-arrow-right">
									Module 8</button>
							</td>
							<td style="color: black; text-align: center; padding-top: 18px;">
								Advanced Java</td>
							<td><button id="mod8result" class="btn1">View
									Result</button></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	
	<!-- FOOTER WILL BE DRAWN-->
	<footer class="text-center text-lg-start bg-light text-muted" id="studentFooter">
	</footer>
	<!-- Footer -->

	<script src="js/navBar.js"></script>
	<script src="js/footerStudent.js"></script>
	<script src="js/studentDashboardNavbarFooter.js"></script>
</body>