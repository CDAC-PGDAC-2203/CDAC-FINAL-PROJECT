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
								<!-- NOTICE BOARD WILL BE DRAWN -->
							</marquee>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-4">
					<div class="card card-margin" style="height: 88%; width: 100%;">
						<h3 class="card-title my-3" style="text-align: center;">Schedule</h3>
						<div class="card-body pt-0">
							<table style = "margin-top: 10%; margin-left: auto; margin-right: auto; overflow-y: auto; box-shadow: 0 7px 25px rgba(0, 0, 0, 0.15);">
								<tr style="margin-top: auto; margin-bottom: auto; background-color: #f5f5f5;">
									<td style="padding: 20px;border:none;">
										<h4>Theory:</h4>
									</td>
									<td style="padding: 20px;border:none;">
										<h4 id="theory_time"></h4>
									</td>
								</tr>
								<tr style="margin-top: auto; margin-bottom: auto; background-color: #f5f5f5;">
									<td style="padding: 20px;border:none;">
										<h4>Lab:</h4>
									</td>
									<td style="padding: 20px;border:none;">
										<h4 id="lab_time"></h4>
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
									<select class="form-select mt-2" id="moduleList" required>
										<option selected disabled value="">Choose Subject</option>
									</select>
								</div>
								<div class="form-group">
									<p class="doubtContent mt-1">Doubt Content</p>
									<textarea class="form-control" id="Textarea" rows="3" id="doubtContent" name="content"></textarea>
								</div>
								<div class="form-group">
									<input type="file" id="image_input">
									<button type="submit" id="doubtSubmit" class="doubtSubmit">Submit</button>
									<p>ONLY PNG/JPG</p>
									<span id="msg"></span>
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
	
	<input type="hidden" id="photo" value="">

	<!-- FOOTER WILL BE DRAWN-->
	<footer class="text-center text-lg-start bg-light text-muted" id="studentFooter">
	</footer>
	<!-- Footer -->

	<script src="js/navBar.js"></script>
	<script src="js/dashboard.js"></script>
	<script src="js/footerStudent.js"></script>
	<script src="js/studentDashboardNavbarFooter.js"></script>
</body>