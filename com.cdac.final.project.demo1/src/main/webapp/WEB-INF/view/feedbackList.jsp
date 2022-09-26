<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CDAC APP | Admin Feedback List</title>
<link href="${pageContext.request.contextPath}/css/bootstrap/bootstrap.min.css" rel="stylesheet"
	type="text/css">
<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styleNavbarAndFooter.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/feedBackList.css" />
<script src="${pageContext.request.contextPath}/js/commonAdminTiles.js"></script>
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
				<li class="nav-item active"><a class="nav-link" href="#" id="adminDashboard">Admin
						Home Page</a></li>

			</ul>
		</div>
	</nav>

	<!-- FeedbackList form -->
	<div class="main-container">
		<div class="course-box">
		 <h4 style="color: rgb(65, 105, 225);text-align: center;">Feedback list</h4>
			<div class="input-block" id="input-course">
				<input type="text" placeholder="Course Name" class="input-control"
					id="courseName" required>
				<h6 id="feedbackListValidMsg" style="color: red;"></h6>
			</div>
			<div class="input-box">
				<button class="btn" id="courseSubmit">Submit</button>
			</div>
			<div>
			<span id="message"></span>
			</div>
		</div>
	</div>

	<div class="feedback-table">
		<div class="container outerdiv">
			<h4 style="color: white;">
				<b>Feedback list :</b>
			</h4>
			<div class="inner-div" style="overflow-x: auto;">
				<table class="table table-striped">
					<thead>
						<tr style="font-family: helvetica;">
							<th scope="row">PRN No</th>
							<th scope="row">Faculty</th>
							<th scope="row">Module</th>
							<th scope="row">Parameter_1</th>
							<th scope="row">Parameter_2</th>
							<th scope="row">Parameter_3</th>
							<th scope="row">Parameter_4</th>
							<th scope="row">Parameter_5</th>
							<th scope="row">Parameter Total</th>
							<th scope="row">Suggestion</th>
						</tr>
					</thead>
					<tbody id="feedbackTableBody">
					</tbody>
				</table>

			</div>
		</div>
	</div>
</body>
</html>