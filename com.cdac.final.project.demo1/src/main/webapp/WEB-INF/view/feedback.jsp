<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<body>

	<style>
@import
	url('https://fonts.googleapis.com/css?family=Poppins:400,500,600,700&display=swap')
	;

* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Poppins', sans-serif;
}

html, body {
	height: 100%;
	place-items: center;
	text-align: center;
	background: linear-gradient(#2EAAFA, #1F2F98);
}

.row {
	background: white;
	border-radius: 30px;
}

navbar {
	width: 100%;
}

.edit:hover {
	text-decoration: underline;
}

.star-widget input {
	display: none;
}

.star-widget label {
	font-size: 15px;
	color: #444;
	padding-top: 8px;
	padding-left: 10px;
	padding-right: 20px;
	transition: all 0.2s ease;
	float: right;
}

input:not(:checked) ~ label:hover, input:not(:checked) ~ label:hover ~
	label {
	color: #fd4;
}

input:checked ~ label {
	color: #fd4;
}

input#rate-5:checked ~ label {
	color: #fe7;
	text-shadow: 0 0 20px #952;
}

.container form {
	display: none;
}

input:checked ~ form {
	display: block;
}

form header {
	width: 100%;
	font-size: 25px;
	color: #fe7;
	font-weight: 500;
	margin: 5px 0 20px 0;
	text-align: center;
	transition: all 0.2s ease;
}

form .textarea {
	height: 100px;
	width: 100%;
	overflow: hidden;
}

form .textarea textarea {
	height: 100%;
	width: 100%;
	outline: none;
	border: 1px solid #333;
	padding: 10px;
	font-size: 17px;
	resize: none;
}

.textarea textarea:focus {
	border-color: #444;
}

form .btn {
	height: 45px;
	width: 100%;
	margin: 15px 0;
}

form .btn button {
	height: 100%;
	width: 100%;
	border: 1px solid #444;
	outline: none;
	background: #222;
	color: #999;
	font-size: 17px;
	font-weight: 500;
	text-transform: uppercase;
	cursor: pointer;
	transition: all 0.3s ease;
}

form .btn button:hover {
	background: #1b1b1b;
}

.btn1 {
	border: none;
	outline: none;
	height: 50px;
	width: 100%;
	background-color: rgb(65, 105, 225);
	color: white;
	border-radius: 4px;
	font-weight: bold;
}

.btn1:hover {
	background: rgb(35, 81, 221);
	border: 1px solid;
}
</style>

	<!-- NAV BAR WILL BE DRAWN -->
	<nav class="navbar navbar-expand-lg navbar-light" id="navbar-1">
	</nav>

	<section class="Form my-4 mx-5">
		<div class="container-fluid">
			<div class="row" style="width: 50%; margin: auto">
				<div class=" px-5 pt-3">
					<div class="pb-3">
						<h4>Feedback Form</h4>
					</div>
					<form>
						<div class="form-row">
							<div class="d-flex justify-content-around pb-2">
								<div>
									<label for="faculty" class="">Faculty:</label> <select
										style="color: rgb(65, 105, 225);">
										<option>faculty 1</option>
										<option>faculty 2</option>
										<option>faculty 3</option>
										<option>faculty 4</option>
									</select>
								</div>
								<div>
									<label for="faculty" class="">Module:</label> <select
										style="color: rgb(65, 105, 225);">
										<option>Module 1</option>
										<option>Module 2</option>
										<option>Module 3</option>
										<option>Module 4</option>
									</select>
								</div>
							</div>
							<table class="table">
								<thead>
									<tr>
										<th scope="col">#</th>
										<th scope="col">Field</th>
										<th scope="col">Rating</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<th scope="row">1</th>
										<td>Knowledge</td>
										<td>
											<div class="star-widget">
												<input type="radio" name="1rate" id="1rate-5"> <label
													for="1rate-5" class="fas fa-star"></label> <input
													type="radio" name="1rate" id="1rate-4"> <label
													for="1rate-4" class="fas fa-star"></label> <input
													type="radio" name="1rate" id="1rate-3"> <label
													for="1rate-3" class="fas fa-star"></label> <input
													type="radio" name="1rate" id="1rate-2"> <label
													for="1rate-2" class="fas fa-star"></label> <input
													type="radio" name="1rate" id="1rate-1"> <label
													for="1rate-1" class="fas fa-star"></label>
											</div>
										</td>
									</tr>
									<tr>
										<th scope="row">2</th>
										<td>Communication</td>
										<td>
											<div class="star-widget">
												<input type="radio" name="2rate" id="2rate-5"> <label
													for="2rate-5" class="fas fa-star"></label> <input
													type="radio" name="2rate" id="2rate-4"> <label
													for="2rate-4" class="fas fa-star"></label> <input
													type="radio" name="2rate" id="2rate-3"> <label
													for="2rate-3" class="fas fa-star"></label> <input
													type="radio" name="2rate" id="2rate-2"> <label
													for="2rate-2" class="fas fa-star"></label> <input
													type="radio" name="2rate" id="2rate-1"> <label
													for="2rate-1" class="fas fa-star"></label>
											</div>
										</td>
									</tr>
									<tr>
										<th scope="row">3</th>
										<td>Punctuality</td>
										<td>
											<div class="star-widget">
												<input type="radio" name="3rate" id="3rate-5"> <label
													for="3rate-5" class="fas fa-star"></label> <input
													type="radio" name="3rate" id="3rate-4"> <label
													for="3rate-4" class="fas fa-star"></label> <input
													type="radio" name="3rate" id="3rate-3"> <label
													for="3rate-3" class="fas fa-star"></label> <input
													type="radio" name="3rate" id="3rate-2"> <label
													for="3rate-2" class="fas fa-star"></label> <input
													type="radio" name="3rate" id="3rate-1"> <label
													for="3rate-1" class="fas fa-star"></label>
											</div>
										</td>
									</tr>
									<tr>
										<th scope="row">4</th>
										<td>Teaching</td>
										<td>
											<div class="star-widget">
												<input type="radio" name="4rate" id="4rate-5"> <label
													for="4rate-5" class="fas fa-star"></label> <input
													type="radio" name="4rate" id="4rate-4"> <label
													for="4rate-4" class="fas fa-star"></label> <input
													type="radio" name="4rate" id="4rate-3"> <label
													for="4rate-3" class="fas fa-star"></label> <input
													type="radio" name="4rate" id="4rate-2"> <label
													for="4rate-2" class="fas fa-star"></label> <input
													type="radio" name="4rate" id="4rate-1"> <label
													for="4rate-1" class="fas fa-star"></label>
											</div>
										</td>
									</tr>
									<tr>
										<th scope="row">3</th>
										<td>Guidance</td>
										<td>
											<div class="star-widget">
												<input type="radio" name="5rate" id="5rate-5"> <label
													for="5rate-5" class="fas fa-star"></label> <input
													type="radio" name="5rate" id="5rate-4"> <label
													for="5rate-4" class="fas fa-star"></label> <input
													type="radio" name="5rate" id="5rate-3"> <label
													for="5rate-3" class="fas fa-star"></label> <input
													type="radio" name="5rate" id="5rate-2"> <label
													for="5rate-2" class="fas fa-star"></label> <input
													type="radio" name="5rate" id="5rate-1"> <label
													for="5rate-1" class="fas fa-star"></label>
											</div>
										</td>
									</tr>
								</tbody>
							</table>
							<div class="textarea">
								<textarea cols="30" placeholder="Suggestion...."></textarea>
							</div>
							<button id="submit" type="submit" class="btn1 mt-3 mb-5">Submit</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>

	<!-- FOOTER WILL BE DRAWN-->
	<footer class="text-center text-lg-start bg-light text-muted" id="studentFooter">
	</footer>
	<!-- Footer -->

	<script src="js/navBar.js"></script>
	<script src="js/footerStudent.js"></script>
	<script src="js/studentDashboardNavbarFooter.js"></script>
</body>