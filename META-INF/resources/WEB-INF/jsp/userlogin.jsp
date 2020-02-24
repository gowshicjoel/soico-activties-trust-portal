<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login </title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" type="image/png" href="img/loginimages/icons/favicon.ico"/>
	<link rel="stylesheet" type="text/css" href="/vendor/loginvendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="/fonts/loginfonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="/fonts/loginfonts/iconic/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" type="text/css" href="/vendor/loginvendor/animate/animate.css">
	<link rel="stylesheet" type="text/css" href="/vendor/loginvendor/css-hamburgers/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="/vendor/loginvendor/animsition/css/animsition.min.css">
	<link rel="stylesheet" type="text/css" href="/vendor/loginvendor/select2/select2.min.css">
	<link rel="stylesheet" type="text/css" href="/vendor/loginvendor/daterangepicker/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="/css/logincss/util.css">
	<link rel="stylesheet" type="text/css" href="/css/logincss/main.css">
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<form class="login100-form validate-form">
					<span class="login100-form-title p-b-26">
						Welcome
					</span>
					<span class="login100-form-title p-b-48">
						<i class="zmdi zmdi-font"></i>
					</span>

					<div class="wrap-input100 validate-input" data-validate = "Valid email is: a@b.c">
						<input class="input100" type="text" name="email">
						<span class="focus-input100" data-placeholder="Email"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Enter password">
						<span class="btn-show-pass">
							<i class="zmdi zmdi-eye"></i>
						</span>
						<input class="input100" type="password" name="pass">
						<span class="focus-input100" data-placeholder="Password"></span>
					</div>

					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">
								Login
							</button>
						</div>
					</div>

					<div class="text-center p-t-115">
						<span class="txt1">
							Don’t have an account?
						</span>

						<a class="txt2" href="userregister">
							Sign Up
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	

	<div id="dropDownSelect1"></div>
	
	<script src="/vendor/loginvendor/jquery/jquery-3.2.1.min.js"></script>
	<script src="/vendor/loginvendor/animsition/js/animsition.min.js"></script>
	<script src="/vendor/loginvendor/bootstrap/js/popper.js"></script>
	<script src="/vendor/loginvendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="/vendor/loginvendor/select2/select2.min.js"></script>
	<script src="/vendor/loginvendor/daterangepicker/moment.min.js"></script>
	<script src="/vendor/loginvendor/daterangepicker/daterangepicker.js"></script>
	<script src="/vendor/loginvendor/countdowntime/countdowntime.js"></script>
	<script src="/js/loginjs/main.js"></script>

</body>
</html>