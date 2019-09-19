<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>主页</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">   
<link href="css/font-awesome.css" rel="stylesheet"> <!-- font-awesome icons -->
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" property="" />
<!-- //Custom Theme files -->  
<!-- web-fonts -->
<link href="http://fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i" rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700,800" rel="stylesheet">
<!-- //web-fonts -->
</head>
<body> 
	<!-- banner -->
	<div class="w3ls-banner jarallax">
		<div class="w3lsbanner-info">
			<!-- header -->
			<div class="header">
				<div class="container">   
					<div class="agile_header_grid"> 
						<div class="header-mdl agileits-logo"><!-- header-two --> 
							<h1><a href="index">Best Pets</a></h1>
						</div>
						<div class="agileits_w3layouts_sign_in">
							<%

								String userName = (String)request.getSession().getAttribute("userName");
								if (userName == null){
									out.println("<ul>\n" +
											"\t\t\t\t\t\t\t\t<li><a href=\"/login\" data-toggle=\"modal\" class=\"play-icon\">Login</a></li>\n" +
											"\t\t\t\t\t\t\t\t<li><a href=\"/register\" data-toggle=\"modal\" class=\"play-icon\">Register</a></li>\n" +
											"\t\t\t\t\t\t\t</ul>");
								}else {
									out.println("<ul>\n" +
											"\t\t\t\t\t\t\t\t<li><span>用户：" + userName + "</span></li>\n" +
											"<li><a href=\"/loginOut\">退出</a></li>" +
											"\t\t\t\t\t\t\t</ul>");
								}
							%>
						</div>
						<div class="clearfix"> </div>
					</div> 
					<div class="header-nav"><!-- header-three --> 	
						<nav class="navbar navbar-default">
							<div class="navbar-header">
								<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
									<span class="sr-only">Toggle navigation</span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
								</button> 
							</div>
							<!-- top-nav -->
							<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
								<ul class="nav navbar-nav cl-effect-16">
									<li><a href="index" class="active" data-hover="主页">主页</a></li>
									<li><a href="about" data-hover="帖子">帖子</a></li>
									<li><a href="gallery" data-hover="展示">展示</a></li>
									<li><a href="contact" data-hover="交流">交流</a></li>
								</ul>  
								<div class="clearfix"> </div>	
							</div>
						</nav>    
					</div>	
				</div>	
			</div>	
			<!-- //header --> 
			<!-- banner-text -->
			<div class="banner-text agileinfo"> 
				<div class="container">
					<div class="agile_banner_info">
						<div class="agile_banner_info1">
							<h6>Quis nostrum exercitationem </h6>
							<div id="typed-strings" class="agileits_w3layouts_strings">
								<p>Welcome to<i> Best Pets</i></p>
								<p><i>Pulvinar</i> Vitae Site</p>
								<p>Curabi temlaci <i>Pharetra</i></p>
							</div>
							<span id="typed" style="white-space:pre;"></span>
						</div>
					</div> 
					<div class="agile_social_icons_banner">
						<ul class="agileits_social_list">
							<li><a href="#" class="w3_agile_facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
							<li><a href="#" class="agile_twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
							<li><a href="#" class="w3_agile_dribble"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
							<li><a href="#" class="w3_agile_vimeo"><i class="fa fa-vimeo" aria-hidden="true"></i></a></li>
						</ul>
					</div> 
				</div>
			</div>
			<!-- //banner-text -->  
		</div>	
	</div>	
	<!-- //banner -->
	<!-- banner-bottom -->
	<div class="banner-bottom">
		<div class="col-md-4 bnr-agileitsgrids">
			<div class="agileinfo_banner_bottom_pos">
				<div class="w3_agileits_banner_bottom_pos_grid">
					<div class="col-xs-4 wthree_banner_bottom_grid_left">
						<div class="agile_banner_bottom_grid_left_grid hvr-radial-out">
							<i class="fa fa-clone" aria-hidden="true"></i>
						</div>
					</div>
					<div class="col-xs-8 wthree_banner_bottom_grid_right">	
						<h4>Free Consultation</h4>
						<p>Morbi viverra lacus commodo felis semper, eu iaculis lectus feugiat.</p>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<div class="col-md-4 bnr-agileitsgrids w3grid1">
			<div class="agileinfo_banner_bottom_pos">
				<div class="w3_agileits_banner_bottom_pos_grid">
					<div class="col-xs-4 wthree_banner_bottom_grid_left">
						<div class="agile_banner_bottom_grid_left_grid hvr-radial-out">
							<i class="fa fa-heart-o" aria-hidden="true"></i>
						</div>
					</div>
					<div class="col-xs-8 wthree_banner_bottom_grid_right">	
						<h4>Certified Products</h4>
						<p>Morbi viverra lacus commodo felis semper, eu iaculis lectus feugiat.</p>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<div class="col-md-4 bnr-agileitsgrids w3grid2">
			<div class="agileinfo_banner_bottom_pos">
				<div class="w3_agileits_banner_bottom_pos_grid">
					<div class="col-xs-4 wthree_banner_bottom_grid_left">
						<div class="agile_banner_bottom_grid_left_grid hvr-radial-out">
							<i class="fa fa-comment-o" aria-hidden="true"></i>
						</div>
					</div>
					<div class="col-xs-8 wthree_banner_bottom_grid_right">	
						<h4>Free Helpline</h4>
						<p>Morbi viverra lacus commodo felis semper, eu iaculis lectus feugiat.</p>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<div class="clearfix"> </div>
	</div>
	<!-- //banner-bottom -->
	<!-- welcome -->	
	<div class="welcome">
		<div class="container"> 
			<div class="col-md-6 w3ls_welcome_right"> 
				<div class="flexslider">
					<ul class="slides">
						<li>	
							<div class="agileits_w3layouts_welcome_grid">
								<img src="images/g1.jpg" alt=" " class="img-responsive" />
							</div>
						</li>
						<li>	
							<div class="agileits_w3layouts_welcome_grid">
								<img src="images/g2.jpg" alt=" " class="img-responsive" />
							</div>
						</li>
						<li>	
							<div class="agileits_w3layouts_welcome_grid">
								<img src="images/g3.jpg" alt=" " class="img-responsive" />
							</div>
						</li>
					</ul>
				</div> 
			</div>
			<div class="col-md-6 w3ls_welcome_left"> 
				<div class="w3ls_welcome_right1">
					<h3 class="agileits-title">About Us</h3>
					<h6>Lorem ipsum dolor <span> Consectetur </span> sit amet adipisicing elit. </h6>
					<p>Quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur.</p>
					<div class="w3l_more">
						<a href="#" class="button button--nina" data-text="Learn more" data-toggle="modal" data-target="#myModal">
							<span>L</span><span>e</span><span>a</span><span>n</span> <span>m</span><span>o</span><span>r</span><span>e</span>
						</a>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	<!-- //welcome -->	
	<!-- services --> 
	<div class="services jarallax">
		<div class="container">   
			<h3 class="agileits-title w3title1">Our Services</h3>
			<div class="services-w3ls-row">
				<div class="col-md-3 col-sm-3 col-xs-6 services-grid agileits-w3layouts">
					<span class="glyphicon glyphicon-home effect-1" aria-hidden="true"></span>
					<h5>Lorem ipsum</h5>
					<p>Itaque earum rerum hic a sapiente delectus in auctor sapien.</p>
				</div>
				<div class="col-md-3 col-sm-3 col-xs-6 services-grid agileits-w3layouts">
					<span class="glyphicon glyphicon-list-alt effect-1" aria-hidden="true"></span>
					<h5>Ut non lacus</h5>
					<p>Itaque earum rerum hic a sapiente delectus in auctor sapien.</p>
				</div>
				<div class="col-md-3 col-sm-3 col-xs-6 services-grid agileits-w3layouts">
					<span class="glyphicon glyphicon-tree-deciduous effect-1" aria-hidden="true"></span>
					<h5>Maec rutrum</h5>
					<p>Itaque earum rerum hic a sapiente delectus in auctor sapien.</p>
				</div>
				<div class="col-md-3 col-sm-3 col-xs-6 services-grid">
					<span class="glyphicon glyphicon-globe effect-1" aria-hidden="true"></span>
					<h5>Phase gravida</h5>
					<p>Itaque earum rerum hic a sapiente delectus in auctor sapien.</p>
				</div> 
				<div class="clearfix"> </div>
			</div>  
		</div> 
	</div>
	<!-- //services -->
	<!-- blog-bottom -->
	<div class="blog-bottom">
		<div class="container">
			<div class="col-sm-5 w3_agile_blog_bottom_left">
				<img src="images/s1.jpg" alt=" " class="img-responsive" />
			</div>
			<div class="col-sm-7 w3_agile_blog_bottom_right">
				<h5>Best Pets</h5>
				<h3>24/7 Customer Service Support</h3>
				<p>Pellentesque accumsan cursus dui, sodales blandit urna sodales vitae. 
					Maecenas placerat eget mi vitae euismod. Duis aliquam efficitur mi, 
					et eleifend velit.</p>
				<div class="w3l_more">
					<a href="#" class="button button--nina" data-text="Learn more" data-toggle="modal" data-target="#myModal">
						<span>L</span><span>e</span><span>a</span><span>n</span> <span>m</span><span>o</span><span>r</span><span>e</span>
					</a>
				</div> 
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	<!-- //blog-bottom -->
	<!-- news letter -->
	<div class="subscribe jarallax">
		<div class="sub-agileinfo">
			<div class="container">
				<h3 class="agileits-title w3title1">Get our free newsletter</h3>
				<p>Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est consectetur adipisci velit sed quia non numquam eius.</p>
				<form>
					<input type="email" name="email" placeholder="Email Address" class="user" required="">
					<input type="submit" value="Subscribe">
				</form>
				<p class="spam">We never share your information or use it to spam you</p>
			</div> 
		</div>
	</div>
	<!-- //news letter -->
	<!-- footer -->
	<div class="footer">
		<div class="footer-top">
			<div class="container">
				<div class="footer-grids">
					<div class="col-md-3 col-sm-6 footer-logo">
						<div class="agileits-logo"> 
							<h2><a href="index">Best Pets</a></h2>
						</div>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eget egestas erat. In hac habitasse platea dictumst.</p>
					</div>
					<div class="col-md-3 col-sm-6 footer-grid">
						<h3>Navigation</h3>
						<ul>
							<li><a href="index">主页</a> </li>
							<li><a href="about">帖子</a></li>
							<li><a href="gallery">展示</a></li>
							<li><a href="contact">交流</a></li>
						</ul>
					</div>
					<div class="col-md-3 col-sm-6 footer-list">
						<h3>Latest Posts</h3>
						<ul>
							<li><i class="fa fa-arrow-right" aria-hidden="true"></i> Vestibulum ante ipsum</li>
							<li><i class="fa fa-arrow-right" aria-hidden="true"></i> Phasellus at eros</li>
							<li><i class="fa fa-arrow-right" aria-hidden="true"></i> Mauris eleifend aliquet</li>
							<li><i class="fa fa-arrow-right" aria-hidden="true"></i> Aliquam vitae tristique</li>
							<li><i class="fa fa-arrow-right" aria-hidden="true"></i> Pellentesque lobortis</li>
							<li><i class="fa fa-arrow-right" aria-hidden="true"></i> Class aptent taciti</li>
						</ul>
					</div>
					<div class="col-md-3 col-sm-6 footer-grid">
						<h3>Twitter Posts</h3>
						<ul class="w3agile_footer_grid_list">
							<li>Ut aut reiciendis voluptatibus <a href="#">http://example.com</a> alias, ut aut.
								<span><i class="fa fa-twitter" aria-hidden="true"></i> 02 days ago</span></li>
							<li>Itaque earum rerum hic tenetur a sapiente <a href="#">http://example.com</a> ut aut.
							<span><i class="fa fa-twitter" aria-hidden="true"></i> 03 days ago</span></li>
						</ul>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<div class="footer-bottom">
			<div class="container">
				<p>Copyright &copy; 2017.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
			</div>
		</div>
	</div>
	<!-- //footer -->
	<!-- modal-about -->
	<div class="modal bnr-modal fade" id="myModal" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
				</div> 
				<div class="modal-body modal-spa">
					<img src="images/g2.jpg" class="img-responsive" alt=""/>
					<h4>Consectetur adipiscing elit</h4>
					<p>Donec fringilla lacus eu pretium rutrum. Cras aliquet congue ullamcorper. Etiam mattis eros eu ullamcorper volutpat. Proin ut dui a urna efficitur varius. uisque molestie cursus mi et congue consectetur adipiscing elit cras rutrum iaculis enim, Lorem ipsum dolor sit amet, non convallis felis mattis at. Maecenas sodales tortor ac ligula ultrices dictum et quis urna. Etiam pulvinar metus neque, eget porttitor massa vulputate in.<br> Fusce lacus purus, pulvinar ut lacinia id, sagittis eu mi. Vestibulum eleifend massa sem, eget dapibus turpis efficitur at. Aliquam viverra quis leo et efficitur. Nullam arcu risus, scelerisque quis interdum eget, fermentum viverra turpis. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut At vero eos </p>
				</div> 
			</div>
		</div>
	</div>
	<!-- //modal-about -->  
	<!-- modal sign in  -->
	<div class="modal bnr-modal about-modal w3-agileits fade" id="myModal2" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
				</div> 
				<div class="modal-body login-page "><!-- login-page -->      
					<div class="sap_tabs">
						<div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
							<ul class="resp-tabs-list">
								<li class="resp-tab-item" aria-controls="tab_item-0"><span>Login</span></li>
								<li class="resp-tab-item" aria-controls="tab_item-1"><span>Register</span></li> 
							</ul>	 
							<div class="clearfix"> </div>	
							<div class="resp-tabs-container">
								<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
									<div class="agileits-login">
										<form action="#" method="post">
											<input type="email" class="email" name="Email" placeholder="Email" required=""/>
											<input type="password" class="password" name="Password" placeholder="Password" required=""/>
											<div class="wthree-text"> 
												<ul> 
													<li>
														<label class="anim">
															<input type="checkbox" class="checkbox">
															<span> Remember me ?</span> 
														</label> 
													</li>
													<li> <a href="#">Forgot password?</a> </li>
												</ul>
												<div class="clearfix"> </div>
											</div>  
											<div class="w3ls-submit"> 
												<input type="submit" value="LOGIN">  	
											</div>	
										</form>
									</div> 
								</div>
								<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
									<div class="login-top sign-top">
										<div class="agileits-login">
											<form action="#" method="post">
												<input type="text" name="Username" placeholder="Username" required="">
												<input type="email" class="email" name="Email" placeholder="Email" required=""/>
												<input type="password" class="password" name="Password" placeholder="Password" required=""/>	
												<label class="anim">
													<input type="checkbox" class="checkbox">
													<span> I accept the terms of use</span> 
												</label> 
												<div class="w3ls-submit"> 
													<input class="register" type="submit" value="REGISTER">  
												</div>
											</form> 
										</div>  
									</div>
								</div>
							</div>	
						</div>
						<div class="clearfix"> </div>
					</div>   
				</div> <!-- //login-page -->
			</div>
		</div>
	</div>
	<!-- //modal sign in -->  
	<!-- js --> 
	<script src="js/jquery-2.2.3.min.js"></script>  
	<!-- //js -->  
	<!-- jarallax -->  
	<script src="js/SmoothScroll.min.js"></script> 
	<script src="js/jarallax.js"></script> 
	<script type="text/javascript">
		/* init Jarallax */
		$('.jarallax').jarallax({
			speed: 0.5,
			imgWidth: 1366,
			imgHeight: 768
		})
	</script>  
	<!-- //jarallax -->
	<!-- ResponsiveTabs js -->
	<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
	<script type="text/javascript">
		$(document).ready(function () {
			$('#horizontalTab').easyResponsiveTabs({
				type: 'default', //Types: default, vertical, accordion           
				width: 'auto', //auto or any width like 600px
				fit: true   // 100% fit in a container
			});
		});
	</script>
	<!-- //ResponsiveTabs js -->  
	<!-- banner-type-text -->
	<script src="js/typed.js" type="text/javascript"></script>
    <script>
		$(function(){

			$("#typed").typed({
				// strings: ["Typed.js is a <strong>jQuery</strong> plugin.", "It <em>types</em> out sentences.", "And then deletes them.", "Try it out!"],
				stringsElement: $('#typed-strings'),
				typeSpeed: 30,
				backDelay:700,
				loop: true,
				contentType: 'html', // or text
				// defaults to false for infinite loop
				loopCount: false,
				callback: function(){ foo(); },
				resetCallback: function() { newTyped(); }
			});

			$(".reset").click(function(){
				$("#typed").typed('reset');
			});

		}); 
		function newTyped(){ /* A new typed object */ }

		function foo(){ console.log("Callback"); }
    </script>
	<!-- //banner-type-text -->
	<!-- flexSlider -->
	<script defer src="js/jquery.flexslider.js"></script>
	<script type="text/javascript">
		$(window).load(function(){
		  $('.flexslider').flexslider({
			animation: "slide",
			start: function(slider){
			  $('body').removeClass('loading');
			}
		  });
		});
	</script>
	<!-- //flexSlider --> 
	<!-- start-smooth-scrolling -->
	<script type="text/javascript" src="js/move-top.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>	
	<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
			
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
	</script>
	<!-- //end-smooth-scrolling -->	
	<!-- smooth-scrolling-of-move-up -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			};
			*/
			
			$().UItoTop({ easingType: 'easeOutQuart' });
			
		});
	</script>
	<!-- //smooth-scrolling-of-move-up --> 
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/bootstrap.js"></script>
</body>
</html>