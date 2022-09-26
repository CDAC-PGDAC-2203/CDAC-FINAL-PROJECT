<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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
				<li class="nav-item active"><a class="nav-link" id="adminDashboard" href="#">Admin
						Home Page</a></li>
			</ul>
		</div>
	</nav>
	<div class="feedback-table">
		<div class="container outerdiv">
			<h4 style="color: white;">
				<b>All Active Doubts :</b>
			</h4>
			<div class="inner-div" style="overflow-x: auto;">
				<table class="table table-striped">
					<thead>
						<tr style="font-family: helvetica;">
							<th scope="row">PRN No</th>
							<th scope="row">Name</th>
							<th scope="row">Email</th>
							<th scope="row">Subject Name</th>
							<th scope="row">Doubt content</th>
							<th scope="row">Attachment</th>
							<th scope="row"></th>
						</tr>
					</thead>
					<tbody id="doubtTable">				
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>