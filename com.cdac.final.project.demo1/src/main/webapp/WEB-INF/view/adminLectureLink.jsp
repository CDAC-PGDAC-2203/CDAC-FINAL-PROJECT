<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>CDAC App | Admin | Leacture Link</title>
	<link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/img/cdac.jpeg">
	<link href="${pageContext.request.contextPath}/css/styleNavbarAndFooter.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/styleAdmin.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/bootstrap/bootstrap.min.css" rel="stylesheet">
	<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap.bundle.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/jquery-3.6.1.js"></script>
	<script src="${pageContext.request.contextPath}/js/commonAdminTiles.js"></script>
</head>
<body class="body">
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
				<li id="dashboard" class="nav-item active"><a class="nav-link"
					href="" id="adminDashboard">Admin Home Page</a></li>
			</ul>
		</div>
	</nav>
    <section class="mt-2 mx-5">
        <div class="container-fluid" style="display: flex;justify-content: center;">
            <div class="row row1">
               
                <h4 style=" color: rgb(65, 105, 225);text-align: center;">Upload Lecture Link</h4>
                <div style="display: flex;justify-content: center;">
                    <form>
                        <div class="form-row" style="display: flex;justify-content: space-evenly;">
                            <div style="width: 40%;"> 
                                <input id="subject" type="text" placeholder="Course Name"class="form-control my-3 p-3">
                                <p id="LectureSubjectValidMsg" style="color: red; font-size: 11px; margin-top: -15px; margin-left:-10px"></p>
                            </div>
                            <div style="width: 40%;">    
                                <input id="session_date" type="date" placeholder="Session Date"class="form-control my-3 p-3" style="color: gray;"> 
                                <p id="LectureDateValidMsg" style="color: red; font-size: 11px; margin-top: -15px; margin-left:-45px"></p>
                            </div>   
                        </div>
                        <div class="form-row" style="display: flex;justify-content: space-evenly;">
                            <div style="width: 40%;"> 
                                <input id="theory_link" type="text" placeholder="Theory Link"class="form-control my-3 p-3">
                                <p id="LectureTheoryLinkValidMsg" style="color: red; font-size: 11px; margin-top: -15px; margin-left:-15px"></p>
                            </div>
                            <div style="width: 40%;">     
                                <input id="theory_time" type="text" placeholder="Theory Time"class="form-control my-3 p-3">  
                                <p id="LectureTheoryTimeValidMsg" style="color: red; font-size: 11px; margin-top: -15px; margin-left:-13px"></p>
                            </div>    
                        </div>
                        <div class="form-row" style="display: flex;justify-content: space-evenly;">
                            <div style="width: 40%;"> 
                                <input id="b1_link" type="text" placeholder="B1 Link"class="form-control my-3 p-3">
                                <p id="LectureB1LinkValidMsg" style="color: red; font-size: 11px; margin-top: -15px; margin-left:-35px"></p>
                            </div>
                            <div style="width: 40%;">    
                                <input id="b1_time" type="text" placeholder="B1 Time"class="form-control my-3 p-3">  
                                <p id="LectureB1TimeValidMsg" style="color: red; font-size: 11px; margin-top: -15px; margin-left:-33px"></p>
                            </div>    
                        </div>
                        <div class="form-row" style="display: flex;justify-content: space-evenly;">
                            <div style="width: 40%;"> 
                                <input id="b2_link" type="text" placeholder="B2 Link"class="form-control my-3 p-3">
                                 <p id="LectureB2LinkValidMsg" style="color: red; font-size: 11px; margin-top: -15px; margin-left:-35px"></p>
                            </div>
                            <div style="width: 40%;">    
                                <input id="b2_time" type="text" placeholder="B2 Time"class="form-control my-3 p-3">  
                                <p id="LectureB2TimeValidMsg" style="color: red; font-size: 11px; margin-top: -15px; margin-left:-33px"></p>
                            </div>    
                        </div>
                        <div class="form-row" style="display: flex;justify-content: space-evenly;">
                            <div style="width: 40%;"> 
                                <input id="b3_link" type="text" placeholder="B3 Link"class="form-control my-3 p-3">
                                 <p id="LectureB3LinkValidMsg" style="color: red; font-size: 11px; margin-top: -15px; margin-left:-35px"></p>
                            </div>
                            <div style="width: 40%;">    
                                <input id="b3_time" type="text" placeholder="B3 Time"class="form-control my-3 p-3">  
                                <p id="LectureB3TimeValidMsg" style="color: red; font-size: 11px; margin-top: -15px; margin-left:-33px"></p>
                            </div>    
                        </div>
                        <div class="form-row" style="display: flex;justify-content: space-evenly;">
                            <div style="width: 40%;"> 
                                <input id="b4_link" type="text" placeholder="B4 Link"class="form-control my-3 p-3">
                                <p id="LectureB4LinkValidMsg" style="color: red; font-size: 11px; margin-top: -15px; margin-left:-35px"></p>
                            </div>
                            <div style="width: 40%;">    
                                <input id="b4_time" type="text" placeholder="B4 Time"class="form-control my-3 p-3">  
                                <p id="LectureB4TimeValidMsg" style="color: red; font-size: 11px; margin-top: -15px; margin-left:-33px"></p>
                            </div>    
                        </div>
                        <div class="form-row">
                            <div style="width: 100%;"> 
                                <button id="lecture_link_upload" type="button" class="btn1 mt-3 mb-3">Upload</button> 
                            </div>    
                        </div>
                        <span id="message"></span>
                    </form>
                </div>
            </div>
        </div>
    </section>
    <footer class="text-center text-lg-start bg-light text-muted">
    	<div class="text-center p-3 mt-1"
			style="background-color: rgba(0, 0, 0, 0.05);">
			© 2022 CDAC. All rights reserved: <a class="text-reset fw-bold"
				href="https://acts.cdac.in/">acts.cdac.in</a>
		</div>
    </footer>
  </body>
</html>