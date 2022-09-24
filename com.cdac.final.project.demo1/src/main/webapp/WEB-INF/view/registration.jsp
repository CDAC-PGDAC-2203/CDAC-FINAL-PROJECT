<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>CDAC APP | Register</title>
<link rel="icon" type="image/x-icon" href="img/cdac.jpeg">
<link href="css/bootstrap/bootstrap.min.css" rel="stylesheet"
	type="text/css">
<script src="js/jquery-3.6.1.js"></script>
<script src="js/bootstrap/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="css/styleRegistration.css" />
<script src="js/registration.js" defer></script>
</head>
<body>
	<div class="register-cover">

		<section class="Form my-5 mx-5">
			<div class="container-fluid d-flex justify-content-center">
				<div class="row no-gutters">
					<div class="_main_head_as">
						<a href="#"> <img
							src="img/cdac.jpeg"
							style="margin-top: 20px;">
						</a>
					</div>

					<h2 class="font-weight-bold py-1" style="color: rgb(65, 105, 225);">CDAC
						STUDENT PORTAL</h2>
					<h4 style="color: rgb(65, 105, 225);">Registration Form</h4>
					<div class="px-5">
						<form action="#" class="form">

							<!-- Progress bar -->
							<div class="progressbar">
								<div class="progress" id="progress"></div>
								<div class="progress-step progress-step-active"
									data-title="Verification"></div>
								<div class="progress-step" data-title="Personal Details"></div>
								<div class="progress-step" data-title="Address"></div>
							</div>

							<!-- Verification -->
							<div class="form-step form-step-active" style="margin-top: 50px;">
								<div class="input-group form-row" style="height: 4rem;">
									<input type="text" placeholder="C-CAT No." id="ccatNo"
										class="form-control my-3 p-4">
								</div>
								<div class="input-group form-row">
									<input type="text" placeholder="First Name" id="fName"
										class="form-control my-3 p-4">
								</div>
								<div class="form-row">
									<div>
										<button id="btn-next" type="button"
											class="btn1 btn-next mt-3 mb-5">Next</button>
									</div>
								</div>
							</div>

							<!-- Personal Details -->
							<div class="form-step" style="margin-top: 50px;">
								<div class="form-row" style="height: 4rem;">
									<div>
										<input type="text" placeholder="First Name" id="fNamePd"
											class="form-control my-3 p-4">
									</div>
								</div>
								<div class="form-row" style="height: 4rem;">
									<div>
										<input type="text" placeholder="Middle Name" id="mName"
											class="form-control my-3 p-4">
									</div>
								</div>
								<div class="form-row" style="height: 4rem;">
									<div>
										<input type="text" placeholder="Last Name" id="lName"
											class="form-control my-3 p-4">
									</div>
								</div>
								<div class="form-check">
									<input class="form-check-input" type="radio" name="gender"
										value="M"> <label class="form-check-label" for="male">Male</label>
								</div>
								<div class="form-check">
									<input class="form-check-input" type="radio" name="gender"
										value="F"> <label class="form-check-label"
										for="female">Female</label>
								</div>
								<div class="form-check">
									<input class="form-check-input" type="radio" name="gender"
										value="O" checked> <label class="form-check-label"
										for="others">Others</label>
								</div>
								<div class="form-row" style="height: 4rem;">
									<div>
										<input type="date" placeholder="Date of Birth" id="dob"
											class="form-control my-3 p-4" style="color: gray">
									</div>
								</div>
								<div class="form-row" style="height: 4rem;">
									<div>
										<input type="email" placeholder="Email Id" id="email"
											class="form-control my-3 p-4" style="color: gray">
									</div>
								</div>
								<div class="form-row" style="height: 4rem;">
									<div>
										<input type="text" placeholder="Phone No." id="phone"
											class="form-control my-3 p-4">
									</div>
								</div>
								<div class="form-row" style="height: 4rem;">
									<div>
										<input type="text" placeholder="Qualification"
											id="qualification" class="form-control my-3 p-4">
									</div>
								</div>
								<div class="form-row" style="height: 4rem;">
									<div>
										<input type="text" placeholder="Course" id="course"
											class="form-control my-3 p-4">
									</div>
								</div>
								<div class="form-row" style="height: 4rem;">

									<input type="file" placeholder="Photo" id="image_input"
										class="form-control p-4">

								</div>
								<div class="form-row" style="height: 4rem;">
									<div>
										<input type="text" placeholder="Guardian Name"
											id="guardianName" class="form-control my-3 p-4">
									</div>
								</div>
								<div class="form-row" style="height: 4rem;">
									<div>
										<input type="text" placeholder="Guardian Phone No."
											id="guardianPhone" class="form-control my-3 p-4">
									</div>
								</div>
								<div class="form-row">
									<div>

										<button id="btn-next" type="button" class="btn1 btn-next mt-3">Next</button>
									</div>
								</div>
							</div>

							<!-- Address Details -->
							<div class="form-step" style="margin-top: 50px;">
								<div class="form-row" style="height: 4rem;">
									<div>
										<input type="text" placeholder="Address Line 1" id="addL1"
											class="form-control my-3 p-4">
									</div>
								</div>
								<div class="form-row" style="height: 4rem;">
									<div>
										<input type="text" placeholder="Address Line 2" id="addL2"
											class="form-control my-3 p-4">
									</div>
								</div>
								<div class="form-row" style="height: 4rem;">
									<div>
										<input type="text" placeholder="State" id="state"
											class="form-control my-3 p-4">
									</div>
								</div>
								<div class="form-row" style="height: 4rem;">
									<div>
										<input type="text" placeholder="City" id="city"
											class="form-control my-3 p-4">
									</div>
								</div>
								<div class="form-row" style="height: 4rem;">
									<div>
										<input type="text" placeholder="Pin code" id="pincode"
											class="form-control my-3 p-4">
									</div>
								</div>
								<div class="form-row">
									<div>
										<button id="submit" type="submit" value="Submit"
											class="btn1 mt-3 mb-5">Submit</button>
									</div>
								</div>
							</div>
						</form>
					</div>

				</div>
			</div>
		</section>

	</div>
</body>
</html>