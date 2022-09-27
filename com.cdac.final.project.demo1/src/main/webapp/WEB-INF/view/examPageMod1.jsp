<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<body>
	<style>
	@import url('https://fonts.googleapis.com/css2?family=Montserrat&display=swap');

	*{
	    margin: 0;
	    padding: 0;
	    box-sizing: border-box;
	}

	body {
	     background: linear-gradient(#2EAAFA, #1F2F98);
	     background-attachment: fixed;
	}

	.container-box{
	    background-color: lightgray;
	    color: black;
	    border-radius: 10px;
	    padding: 20px;
	    margin-left: auto;
	    margin-right: auto;
	    font-family: 'Montserrat', sans-serif;
	    max-width: 60%;
	}
	.container-box > p{
	    font-size: 32px;
	}
	.question{
	    width: 75%;
	}
	.options{
	    position: relative;
	    padding-left: 40px;
	}
	#options label{
	    display: block;
	    margin-bottom: 15px;
	    font-size: 18px;
	    cursor: pointer;
	}
	.options input{
	    opacity: 0;
	}
	.checkmark {
	    position: absolute;
	    top: -1px;
	    left: 0;
	    height: 25px;
	    width: 25px;
	    background-color: black;
	    border: 1px solid #ddd;
	    border-radius: 50%;
	}
	.options input:checked ~ .checkmark:after {
	    display: block;
	}
	.options .checkmark:after{
	    content: "";
		width: 10px;
	    height: 10px;
	    display: block;
		background: white;
	    position: absolute;
	    top: 50%;
		left: 50%;
	    border-radius: 50%;
	    transform: translate(-50%,-50%) scale(0);
	    transition: 300ms ease-in-out 0s;
	}
	.options input[type="radio"]:checked ~ .checkmark{
	    background: rgb(65, 105, 225);
	    transition: 300ms ease-in-out 0s;
	}
	.options input[type="radio"]:checked ~ .checkmark:after{
	    transform: translate(-50%,-50%) scale(1);
	}
	.btn-primary{
	    background-color: black;
	    color: #ddd;
	    border: 1px solid #ddd;
	    margin-bottom: 15px;
	}
	.btn-primary:hover,
	.btn-success:hover{
	    background-color: rgb(65, 105, 225);
	}
	.btn-success{
	    padding: 5px 25px;
	    background-color: rgb(65, 105, 225);
	    color: #ddd;
	    border: 1px solid #ddd;
	}
	@media(max-width:576px){
	    .question{
	        width: 100%;
	        word-spacing: 2px;
	    } 
	}

	footer {
	    width: 100%;
	}
	
	</style>

	<!-- NAV BAR WILL BE DRAWN -->
	<nav class="navbar navbar-expand-lg navbar-light" id="navbar-1">
	</nav>

	<div class="container-box mt-sm-5 my-1">
		<h4 style="text-align: center;">
			<b>Module : <span id="examPageMod1Name"></span></b>
		</h4>
		<br>
		<div id="paperStart">
		</div>
		<br>
		<div class="d-flex align-items-center pt-3">
			<div id="prev" style="margin: auto;">
				<button class="btn btn-primary" id="closeExam">Close Screen</button>
			</div>
			<div id="prev" style="margin: auto;">
				<button class="btn btn-primary" id="submitExam">Submit</button>
			</div>
		</div>
		<span id="msg"></span>
	</div>


	<!-- FOOTER WILL BE DRAWN-->
	<footer class="text-center text-lg-start bg-light text-muted"
		id="studentFooter"> </footer>
	<script src="js/navBar.js"></script>
	<script src="js/footerStudent.js"></script>
	<script src="js/studentDashboardNavbarFooter.js"></script>
	<script src="js/mod1Paper.js"></script>
</body>
