<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<body>
	<style>
@import
	url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;700;900&display=swap')
	;

body {
	background: linear-gradient(#2EAAFA, #1F2F98);
	background-attachment: fixed;
	height: 800px;
	font-family: "Google Sans", Roboto, Arial, sans-serif;
}

.student-profile {
	width: 65%;
	/* height: 45%;  */
	padding: 3%;
	margin-top: 3%;
	margin-bottom: 3%;
	border-radius: 0.5rem;
	background: #fff;
}

.profile-img {
	text-align: center;
}

.profile-img img {
	width: 70%;
	height: 100%;
}

.profile-img .file {
	position: relative;
	overflow: hidden;
	margin-top: -20%;
	width: 70%;
	border: none;
	border-radius: 0;
	font-size: 15px;
	background: #212529b8;
}

.profile-img .file input {
	position: absolute;
	opacity: 0;
	right: 0;
	top: 0;
}

.profile-head h5 {
	color: #333;
}

.profile-head h6 {
	color: rgb(65, 105, 225);
}

.profile-edit-btn {
	border: none;
	width: 75%;
	padding: 2%;
	font-weight: 600;
	color: rgb(65, 105, 225);
	cursor: pointer;
}

.profile-edit-btn:hover {
	background-color: rgb(65, 105, 225);
	color: #fff;
}

@media only screen and (max-width: 1300px) {
	.profile-edit-btn {
		width: 95%;
		font-size: 10px;
	}
}

.profile-course {
	font-size: 15px;
	color: #818182;
	margin-top: 3%;
}

.profile-head .nav-tabs {
	margin-bottom: 5%;
}

.profile-head .nav-tabs .nav-link {
	font-weight: 600;
	border: none;
}

.profile-head .nav-tabs .nav-link.active {
	border: none;
	border-bottom: 2px solid rgb(65, 105, 225);
}

.profile-work {
	padding: 14%;
	margin-top: -15%;
}

.profile-work p {
	font-size: 12px;
	color: #818182;
	font-weight: 600;
	margin-top: 10%;
}

.profile-work a {
	text-decoration: none;
	color: #495057;
	font-weight: 600;
	font-size: 14px;
}

.profile-work ul {
	list-style: none;
}

.profile-tab label {
	font-weight: 600;
}

.profile-tab p {
	font-weight: 600;
	color: rgb(65, 105, 225);
}

#changePassword {
	text-decoration: none;
	color: rgb(65, 105, 225);
	font-size: 0.8rem;
	font-weight: 600;
}

#changePassword:hover {
	color: #969696;
}
</style>
	<!-- NAV BAR WILL BE DRAWN -->
	<nav class="navbar navbar-expand-lg navbar-light" id="navbar-1">
	</nav>

	<!-- MyProfile -->
	<div class="container student-profile">
		<form method="post">
			<div class="row">
				<div class="col-md-4" id="photo">
				</div>

				<div class="col-md-6">
					<div class="profile-head" id="profileHead">

						<h5 id="uName"></h5>
						<h6 id="centerName">CDAC ACTS Pune</h6>

						<h3 class="profile-course" id="profileCourseName"></h3>
						<h6 id="uPrn"></h6>

						<ul class="nav nav-tabs" id="myTab" role="tablist">
							<li class="nav-item"><a class="nav-link active"
								id="home-tab" data-toggle="tab" href="" role="tab"
								aria-controls="home" aria-selected="true">About</a></li>

						</ul>
					</div>
				</div>
				<div class="col-md-2">
					<input type="submit" class="profile-edit-btn" name="btnAddMore"
						value="Edit Profile" id="editBtn" disabled /> <a id="changePassword"
						href="">Change Password</a>
				</div>
			</div>


			<div class="row">
				<div class="col-md-4">
					<div class="profile-work"></div>
				</div>
				<div class="col-md-8">
					<div class="tab-content profile-tab" id="myTabContent">
						<div class="tab-pane fade show active" id="home" role="tabpanel"
							aria-labelledby="home-tab">
							<div class="row">
								<div class="col-md-6">
									<label>Gender</label>
								</div>
								<div class="col-md-6" id="profileGender">

									<p id="genderId"></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Date of Birth</label>
								</div>
								<div class="col-md-6" id="profileDob">

									<p id="dobId"></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Email</label>
								</div>
								<div class="col-md-6" id="profileEmail">

									<p id="emailId"></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Phone</label>
								</div>
								<div class="col-md-6" id="profilePhone">

									<p id="phoneNo"></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Address</label>
								</div>
								<div class="col-md-6" id="adr">
									<p id="addressId"></p>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</form>
	</div>
	
	<!-- FOOTER WILL BE DRAWN-->
	<footer class="text-center text-lg-start bg-light text-muted" id="studentFooter">
	</footer>
	<!-- Footer -->

	<script src="js/navBar.js"></script>
	<script src="js/footerStudent.js"></script>
	<script src="js/studentDashboardNavbarFooter.js"></script>
	<script src="js/myProfile.js"></script>
</body>