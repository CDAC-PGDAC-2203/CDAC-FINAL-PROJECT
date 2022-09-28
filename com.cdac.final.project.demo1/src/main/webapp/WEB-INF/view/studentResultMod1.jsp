<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<body>
<style>
body {
     background: linear-gradient(#2EAAFA, #1F2F98);
    height: 414px;
}

.outer-div {
    padding: 20px;
    padding-top: 20px;
    padding-bottom: 10px;
    text-align: center;
    margin-top: 30px;
}

.inner-div {
    overflow-x: auto;
    display: flex;
    justify-content: center;
    align-items: center;
    width: 90%;
    margin-left: auto;
    margin-right: auto;
    margin-bottom: none;
}

tr {
    height: 4rem;
    font-size: 110%;
    background-color: white;
    text-align: justify;
    font-family: "Google Sans",Roboto,Arial,sans-serif;
}

th,td {
    vertical-align: middle;
    color: black;
    border: 1px solid darkgray;
}

.data {
    font-family: "Google Sans",Roboto,Arial,sans-serif;
    font-size: large;
}

h2 {
    overflow-x: auto;
    font-family: "Google Sans", Roboto,Arial,sans-serif;
    color: whitesmoke;
    font-weight: 400;
    text-align: left;
    margin-left: 6%;
}

</style>
	<!-- NAV BAR WILL BE DRAWN -->
	<nav class="navbar navbar-expand-lg navbar-light" id="navbar-1">
	</nav>

	<div class="outer-div" style="width: 100%;">
		<h2>
			<b>Result :</b>
		</h2>
		<br>
		<div class="inner-div">
			<table class="table table-striped">
				<tr>
					<th>PRN:</th>
					<td id="prn" class="data" colspan="2">
					</td>
				</tr>
				<tr>
					<th>Student Name:</th>
					<td id="studentname" class="data" colspan="2">
					</td>
				</tr>
				<tr>
					<th>Module:</th>
					<td id="module" class="data" colspan="2">
					</td>
				</tr>
				<hr>
				<br>
				<tr>
					<th style="width: 200px;">Lab Marks:</th>
					<td id="labmarks" class="data"></td>
					<td>
						<h5>/40</h5>
					</td>
				</tr>
				<tr>
					<th style="width: 200px;">Internal:</th>
					<td id="internalmarks" class="data"></td>
					<td>
						<h5>/20</h5>
					</td>
				</tr>
				<tr>
					<th style="width: 200px;">Total:</th>
					<td id="totalmarks" class="data"></td>
					<td>
						<h5>/60</h5>
					</td>
				</tr>
			</table>
		</div>
	</div>

	<!-- FOOTER WILL BE DRAWN-->
	<footer class="text-center text-lg-start bg-light text-muted" id="studentFooter">
	</footer>
	<!-- Footer -->

	<script src="js/navBar.js"></script>
	<script src="js/footerStudent.js"></script>
	<script src="js/studentDashboardNavbarFooter.js"></script>
	<script src="js/studentResultMod1.js"></script>
</body>