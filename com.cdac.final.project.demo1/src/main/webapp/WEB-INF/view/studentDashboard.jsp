<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<body>
	<!-- NAV BAR WILL BE DRAWN -->
	<nav class="navbar navbar-expand-lg navbar-light" id="navbar-1">
	</nav>

	<div class="container mt-3">
		<div class="row">
			<div class="col-lg-4">
				<div class="card card-margin" style="height: 88%; width: 100%;">
					<h3 class="card-title my-3">Current
						Performance</h3>
					<div class="card-body pt-0">
						<div class="circular-progress-1 mt-3" style="margin-left: auto; margin-right: auto;">
							<div class="value-container-1" id="currentPerformance">0%</div>
						</div>
					</div>
				</div>
			</div>

			<div class="col-lg-4">
				<div class="card card-margin" style="height: 88%; width: 100%;">
					<h3 class="card-title my-3" style="text-align: center;">Current
						Attendance</h3>
					<div class="card-body pt-0">
						<div class="circular-progress-2 mt-3" style="margin-left: auto; margin-right: auto;">
							<div class="value-container-2" id="currentAttendance">0%</div>
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
							<marquee direction="up" id="noticeBoard" scrollamount="5"
								loop="true" onmouseover="stop()" onmouseout="start()">
								
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


	<!-- FOOTER WILL BE DRAWN-->
	<footer class="text-center text-lg-start bg-light text-muted" id="studentFooter">
	</footer>
	<!-- Footer -->

	<script src="js/navBar.js"></script>
	<script src="js/dashboard.js"></script>
	<script src="js/footerStudent.js"></script>
	<script src="js/studentDashboardNavbarFooter.js"></script>
</body>