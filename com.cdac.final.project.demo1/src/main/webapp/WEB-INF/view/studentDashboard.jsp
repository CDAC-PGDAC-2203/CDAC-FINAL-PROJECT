<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<body>
	<nav class="navbar navbar-expand-lg navbar-light" id="navbar-1">
		<a class="navbar-brand" href=""><img class="img-responsive"
			src="${pageContext.request.contextPath}/img/cdac-logo.jpeg"></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse justify-content-end"
			id="navbarNav">
			<ul class="navbar-nav">

				<li id="dashboardNav" class="nav-item active"><a
					class="nav-link" href="">Dashboard</a></li>

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="" id="navbarDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">
						Join Link</a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdown" id="lectureLinkDropdown">
						
					</ul>
				</li>

				<li id="exam" class="nav-item"><a class="nav-link" href="#">Exam</a>
				</li>
				<li id="result" class="nav-item"><a class="nav-link" href="#">Result</a>
				</li>
				<li id="feedback" class="nav-item"><a class="nav-link" href="#">Feedback</a>
				</li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="" id="navbarDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false"></a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdown">
						<li id="student_profile"><button class="dropdown-item"
								type="button">My Profile</button></li>
						<li id="logout"><a class="dropdown-item" href="">Logout</a></li>
					</ul></li>
			</ul>
		</div>
	</nav>

	<div class="container mt-3">
		<div class="row">
			<div class="col-lg-4">

				<div class="card card-margin" style="height: 88%; width: 100%;">

					<h3 class="card-title my-3" style="text-align: center;">Current
						performance</h3>

					<div class="card-body pt-0">
						<div class="circular-progress-1">
           						 <div class="value-container-1">0%</div>
        				</div>
					</div>
				</div>
			</div>

			<div class="col-lg-4">
				<div class="card card-margin" style="height: 88%; width: 100%;">
					<h3 class="card-title my-3" style="text-align: center;">Overall
						performance</h3>

					<div class="card-body pt-0">
						<div class="circular-progress-2">
								<div class="value-container-2">0%</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-lg-4">
				<div class="card card-margin">
					<h3 class="card-title my-3"
						style="text-align: center; width: 100%;">Notice Board</h3>
					<div class="card-body pt-0">
						<div class="notice-board-div">
							<marquee direction="down" id="noticeBoard" scrollamount="5"
								loop="true" onmouseover="stop()" onmouseout="start()">
								<div class="desc" id="desc">The direction of text will be
									from bottom to top.</div>
								<div class="desc" id="desc">The direction of text will be
									from bottom to top.</div>
								<div class="desc" id="desc">The direction of text will be
									from bottom to top.</div>
								<div class="desc" id="desc">The direction of text will be
									from bottom to top.</div>
								<div class="desc" id="desc">The direction of text will be
									from bottom to top.</div>
							</marquee>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-4">
					<div class="card card-margin" style="height: 88%; width: 100%;">


						<h3 class="card-title my-3" style="text-align: center;">Schdeule</h3>

						<div class="card-body pt-0">



							<table
								style="margin-top: 10%; margin-left: auto; margin-right: auto; overflow-y: auto;"
								cellpadding="15">
								<tr
									style="margin-top: auto; margin-bottom: auto; background-color: #f5f5f5;">
									<td>
										<h4>Theory:</h4>
									</td>
									<td>
										<h4 id="theory_time">7:30AM</h4>
									</td>
								</tr>
								<tr
									style="margin-top: auto; margin-bottom: auto; background-color: #f5f5f5;">
									<td>
										<h4>Lab:</h4>
									</td>
									<td>
										<h4 id="lab_time">3:30PM</h4>
									</td>
								</tr>
							</table>

						</div>
					</div>
				</div>

				<div class="col-lg-4">
					<div class="card card-margin" style="height: 88%; width: 100%;">

						<h3 class="card-title"
							style="text-align: center; margin-top: 5px;">Doubt Forum</h3>

						<div class="card-body pt-0">

							<form>
								<div class="form-group">
									<select class="form-select mt-2" id="chooseSub" required>
										<option selected disabled value="">Choose Subject</option>
										<option value="Cop">Concept of Programming</option>
										<option value="DBT">Database Technologies</option>
										<option value="ADS">Algorithms and Data Structures</option>
										<option value="SDM">Software development
											methadologies</option>
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
									<input type="file" id="attachment">
									<button type="submit" id="submit" class="doubtSubmit">Submit</button>
									<p>only png/jpg</p>
								</div>

							</form>
						</div>
					</div>
				</div>

				<div class="col-lg-4">
					<div class="card card-margin" style="width: 120%;">
						<h3 class="card-title my-3" style="text-align: center;">Attendance</h3>
						<div class="card-body pt-0">
							<div class="chart">
								<ul class="bars" id="attendaceBars">

								</ul>
							</div>
						</div>
					</div>
				</div>
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
								src="D:\CDAC\PG-DAC 0322\11 Project\ui\navbar and footer\2901214.png"
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
			© 2022 CDAC. All rights reserved: <a class="text-reset fw-bold"
				href="https://acts.cdac.in/">acts.cdac.in</a>
		</div>
		<!-- Copyright -->
	</footer>
	<!-- Footer -->
	<script>

    let number2 = document.getElementById("number2");
    let counter2 = 0;
    setInterval(() => {
        if (counter2 == 5) {
            clearInterval();
        } else {
            counter2 += 1;
            number2.innerHTML = counter2 + "%";
        }
    }, 30);

    
  </script>
	<script src="js/dashboard.js"></script>
</body>