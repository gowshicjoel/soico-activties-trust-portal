<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
	<link rel="shortcut icon" href="img/fav.png">
	<meta name="author" content="colorlib">
	<meta name="description" content="">
	<meta name="keywords" content="">
	<meta charset="UTF-8">
	<title>Sigaram Thodu</title>

	<link href="" rel="stylesheet">
	<link rel="stylesheet" href="font-awesome.min.css">
	<link rel="stylesheet" href="themify-icons.css">
	<link rel="stylesheet" href="bootstrap.css">
	<link rel="stylesheet" href="owl.carousel.css">
	<link rel="stylesheet" href="magnific-popup.css">
	<link rel="stylesheet" href="nice-select.css">
	<link rel="stylesheet" href="main.css">
</head>
<body>
<header class="default-header">
		<nav class="navbar navbar-expand-lg navbar-light">
			<div class="container">
				<a class="navbar-brand" href="index.html">
					<img src="img/logo.png" alt="">
				</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
				 aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
					<span class="fa fa-bars"></span>
				</button>

				<div class="collapse navbar-collapse justify-content-end align-items-center" id="navbarSupportedContent">
					<ul class="navbar-nav">
						<li><a href="index.html">Home</a></li>
                        <li><a href="about.html">About</a></li>
                        <li><a href="causes.html">Free Class</a></li>
                        <li><a href="event.html">Blood Donation</a></li>
                        <li>
                            <a class="active" href="blog.html">
                                Your Requests
                            </a>
                            
                        </li>
                    <li><a href="contact.html">Contact</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<section class="banner-area relative">
		<div class="overlay overlay-bg"></div>
		<div class="container">
			<div class="row justify-content-lg-end align-items-center banner-content">
				<div class="col-lg-5">
					<h1 class="text-white">Your Requests</h1>
					</div>
			</div>
		</div>
	</section>
	<section class="blog_area section-gap">
        <div class="row">
        <div class="col-12">
          <h2 class="contact-title">Your Requests</h2>
        </div>
        
        <div class="col-lg-8">
          <form class="form-contact contact_form" action="contact_process.php" method="post" id="contactForm"
            novalidate="novalidate">
            <div class="row">
              <div class="col-12">
                <div class="requests">
        <input type="radio" name="requests" value="Education"> Education<br>
        <input type="radio" name="requests" value="Medical"> Medical<br>
        <input type="radio" name="requests" value="Agriculture"> Agriculture
    </div>
                <div class="form-group">
                  <textarea class="form-control w-100" name="message" id="message" cols="30" rows="9" placeholder="Enter Message"></textarea>
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <input class="form-control" name="name" id="name" type="text" placeholder="Enter your name">
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <input class="form-control" name="email" id="email" type="email" placeholder="Enter email address">
                </div>
              </div>
              <div class="col-12">
                <div class="form-group">
                  <input class="form-control" name="subject" id="subject" type="text" placeholder="Enter Subject">
                </div>
              </div>
            </div>
            <div class="col-lg-5">
                <div class="form-group">
                    <input class="form-control" name="phone no" id="phone no" type="number" placeholder="Enter the phone no">
                </div>
            </div>
            <div class="input-group">
                            <label class="label">Are you             </label>
                            <div class="rs-select2 js-select-simple select--no-search">
                                <select name="subject">
                                    <option disabled="disabled" selected="selected">Choose option</option>
                                    <option>Volunteer</option>
                                    <option>Others</option>
                                </select>
                                <div class="select-dropdown"></div>
                            </div>
            </div>
            <div class="form-group mt-2 mb-5 mb-lg-0">
              <button type="submit" class="button button-contactForm primary-btn">Send Message</button>
            </div>
          </form>
        </div>
    </section>
    <footer class="footer">
		<div class="footer-area">
			<div class="container">
				<div class="row section_gap">
					<div class="col-lg-5 col-md-6 col-sm-6">
						<div class="single-footer-widget tp_widgets">
							<h4 class="footer_title large_title">About Us</h4>
							<p>
								Do you want to be even more successful? Learn to love learning and growth. The more effort you put into
								improving your skills, the bigger the payoff you will get. Realize that things will be hard at first, but the
								rewards will be worth it.
							</p>
							
								
						</div>
					</div>
					<div class="offset-lg-1 col-lg-2 col-md-6 col-sm-6">
						<div class="single-footer-widget tp_widgets">
							<h4 class="footer_title">Quick Links</h4>
							<ul class="list">
								<li><a href="#">Home</a></li>
																
							</ul>
						</div>
					</div>
					<div class="offset-lg-1 col-lg-3 col-md-6 col-sm-6">
						<div class="single-footer-widget tp_widgets">
							<h4 class="footer_title">Contact Us</h4>
							<div class="ml-5">
								<p class="sm-head">
									<span class="fa fa-location-arrow"></span>
									Head Office
								</p>
								<p>KGiSL_IIM, Saravanampatti,Coimbatore.</p>

								<p class="sm-head">
									<span class="fa fa-phone"></span>
									Phone Number
								</p>
								<p>
									+91 63800 71995
								</p>

								<p class="sm-head">
									<span class="fa fa-envelope"></span>
									Gmail
								</p>
								<p>
									sigaram_thodu@gmail.com
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</footer>
	<script src="/js/jquery-2.2.4.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
	 crossorigin="anonymous"></script>
	<script src="/js/bootstrap.min.js"></script>
	<script src="/js/jquery.ajaxchimp.min.js"></script>
	<script src="/js/parallax.min.js"></script>
	<script src="/js/owl.carousel.min.js"></script>
	<script src="/js/isotope.pkgd.min.js"></script>
	<script src="/js/jquery.nice-select.min.js"></script>
	<script src="/js/jquery.magnific-popup.min.js"></script>
	<script src="/js/countdown.js"></script>
	<script src="/js/jquery.sticky.js"></script>
	<script src="/js/main.js"></script>
</body>
</html>