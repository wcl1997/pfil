<?php


$text = "<span style='color:red; font-size: 35px; line-height: 40px; magin: 10px;'>Error! Please try again.</span>";

if(isset($_POST['name']))
{
	$name=$_POST['name'];
	$email=$_POST['email'];
	$message=$_POST['message'];

	$to = "youremail@gmail.com";
	$subject = "Zerotheme - Testing Contact Form";
	$message = " Name: " . $name ."\r\n Email: " . $email . "\r\n Message:\r\n" . $message;
	 
	$from = "Zerotheme";
	$headers = "From:" . $from . "\r\n";
	$headers .= "Content-type: text/plain; charset=UTF-8" . "\r\n"; 
	 
	if(@mail($to,$subject,$message,$headers))
	{
	  $text = "<span style='font-size: 35px; line-height: 40px; margin: 10px;'>Your Message was sent successfully !</span>";
	}
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />

    <title>American Bully</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/style.css" rel="stylesheet">
	<link rel="stylesheet" href="css/slide.css">
	<link href="css/image-effect.css" rel="stylesheet">
	
	<!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	
	<!-- jQuery -->
	<script src="js/jquery-1.11.3.min.js"></script>
	<script src="js/responsiveslides.min.js"></script>
	<script type="text/javascript" src="js/arrow37.js"></script>
	<script>
	$(function () {
	  // Slideshow 4
	  $("#slider4").responsiveSlides({
		auto: true,
		pager: false,
		nav: true,
		speed: 500,
		namespace: "callbacks",
		before: function () {
		  $('.events').append("<li>before event fired.</li>");
		},
		after: function () {
		  $('.events').append("<li>after event fired.</li>");
		}
	  });
	});
	</script>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<!-- /////////////////////////////////////////Navigation -->
	<nav class="navbar navbar-default navbar-fixed-top">
	    <div class="container">
	        <!-- Nav -->
	        <div class="navbar-header">
	            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#menu">
	                <span class="sr-only">Toggle navigation</span>
	                <span class="icon-bar"></span>
	                <span class="icon-bar"></span>
	                <span class="icon-bar"></span>
	            </button>
	            <a class="navbar-brand" href="#">American Bully</a>
	        </div>
	        <!-- Nav collapse -->
	        <div class="collapse navbar-collapse" id="menu">
	            <ul class="nav navbar-nav navbar-right">
	                <li><a href="index.html#intro">Home</a></li>
	                <li><a href="index.html#breed">Breed</a></li>
	                <li><a href="index.html#classes">Classes</a></li>
	                <li><a href="index.html#show">Dog Show</a></li>
					<li><a href="index.html#service">Service</a></li>
					<li><a href="index.html#contact-form">Contact</a></li>
	            </ul>
	        </div>
	        <!-- /.navbar-collapse -->
	    </div>
	    <!-- /.container -->
	</nav>
	<!-- Navigation -->

	<!-- /////////////////////////////////////////Header -->
	<header id="intro">
		<div class="row">
			<div class="col-lg-12">
				<div class="callbacks_container">
				  <ul class="rslides" id="slider4">
					<li>
					  <img src="images/banner1.jpg" alt="">
					  <div class="caption">
						  <h2>American Pit Bull Terrier Dog Breed Information</h2></br>
						  <p>Nulla eget mauris quis elit mollis ornare vitae ut odio. Cras tincidunt, augue vitae sollicitudin commodo,quam elit varius est, et ornare ante massa quis tellus. Mauris nec lacinia nisl. </p>
					  </div>
					</li>
					<li>
					  <img src="images/banner2.jpg" alt="">
					  <div class="caption">
						  <h2>Most Dangerous Dogs - Pit bulls</h2></br>
						  <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.</p>
					  </div>
					</li>
					<li>
					  <img src="images/banner3.jpg" alt="">
					  <div class="caption">
						  <h2>Myths and Facts About Pit Bulls</h2></br>
						  <p>At vero eos et accusam et justo duo dolores et ea rebum. Consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat.</p>
					  </div>
					</li>
				  </ul>
				</div>
			</div>
		</div>
    </header>
	<!-- Header -->

	
	<!-- /////////////////////////////////////////Content -->
	<div id="page-content" class="sub-page">
		<div class="container">
			<div class="message">
				<div class="wrap">
					<!--Warning-->
					<center><?php echo $text;?></center>
					<!---->
					<a href="index.html" type="button" class="btn btn-1">Back to HomePage</a>
				</div>
			</div>
		</div>
	</div>



	<!-- /////////////////////////////////////////Footer -->
	 <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <p class="copyright">Copyright &copy; Your Website<br/> Designed by Zerotheme - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
                </div>
                <div class="col-md-4">
                    <ul class="list-inline social-buttons">
                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                    </ul>
                </div>
                <div class="col-md-4">
                    <ul class="list-inline">
                        <li><a href="#">Privacy Policy</a></li>
                        <li><a href="#">Terms of Use</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </footer>
	<!-- Footer -->

<!-- Bootstrap Core JavaScript -->
	 <script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>