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
				<li class="nav-item active"><a class="nav-link" id="adminDashboard" href="">Admin
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
	<!-- <script src="js/activeDoubtList.js" type="text/javascript"></script> -->
	<script>
	$(document).ready(()=>{
	    $.ajax({
	        url: "/portal/doubts",
	        type: "GET",
	        beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
	        success: (data) => {

	            data.forEach((element) =>{
	                var tableRow = "<tr style='font-family: helvetica;'>" 
	                             + "<td scope='row'>" + element.userPrn + "</td>"
	                             + "<td scope='row'>" + element.userName + "</td>"
	                             + "<td scope='row'>" + element.email + "</td>"
	                             + "<td scope='row'>" + element.subjectName + "</td>"
	                             + "<td scope='row'>" + element.doubtContent + "</td>"
	                             + "<td scope='row'>" + element.attachment +"</td>"
	                             + "<td scope='row'><button id='" + element.doubtId + "' onclick='update_doubt_flag(" +  element.doubtId + ")'>Solved</button></td>"
	                             + "</tr>";
	                $("#doubtTable").append(tableRow);
	            });
	        },
	        error: (error) => {
	           //append FAILURE MESSAGE ON Ui
	        }
	     });

	    $("#adminDashboard").click((e)=>{
	        e.preventDefault();
	        $.ajax({
	            url: "/portal/admin",
	            type: "GET",
	            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
	            success: (data) => {
	               $("body").html(data);
	            }
	         }); 
	    });

	});
	
	function update_doubt_flag(value){
        var doubtId = value;
        $.ajax({
           url: "/portal/doubt/"+doubtId,
           type: "PUT",
           beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
           success: (data) => {
        	   $.ajax({
                   url: "/portal/admin/doubts",
                   type: "GET",
                   beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
                   success: (data) => {
                       $("body").html(data);
                   }
                });
           },
           error: (error) => {
              alert("Internal Server Error!");
           }
        }); 
    }
	</script>
</body>