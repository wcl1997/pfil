<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.libiao.pojo.Post" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>About</title>
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
	<style>
		a.fatie{
			display: block;
			/*border: 1px solid #900;*/
			margin-top: 8px;
			position: absolute;
			right: 370px;
			width: 138px;
			height: 54px;
			border-radius: 5px;
			box-shadow: 2px 2px 8px #1b6d85;
			font: 24px/1em 微软雅黑;
			line-height: 54px;
			letter-spacing: 6px;
			color: #9ea4f7;
			text-align: center;
			/*vertical-align: center;*/
		}
	</style>
</head>
<body> 
	<!-- banner -->
	<div class="w3ls-banner about-w3lsbanner">
		<div class="w3lsbanner-info">
			<!-- header -->
			<div class="header">
				<div class="container">   
					<div class="agile_header_grid"> 
						<div class="header-mdl agileits-logo"> 
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
					<div class="header-nav"><!-- header-two --> 	
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
									<li><a href="index" data-hover="主页">主页</a></li>
									<li><a href="about" class="active" data-hover="帖子">帖子</a></li>
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
		</div>	
	</div>	
	<!-- //banner -->
    <a href="/addPost" class="fatie">发帖</a>
	<!-- welcome -->	
	<div class="welcome">
		<c:forEach items="${posts }" var="post">
		<div class="container"> 
			<div class="col-md-6 w3ls_welcome_right"> 
				<div class="flexslider">
					<ul class="slides">
						<li>
							<a href="/detail/${post.PId}">
								<div class="agileits_w3layouts_welcome_grid">
									<img src="images/${post.PImg }" alt="" class="img-responsive">
								</div>
							</a>
							<br>
						</li>
					</ul>
				</div>
			</div>

		<div class="col-md-6 w3ls_welcome_left">
			<div class="w3ls_welcome_right1">
				<h3 class="agileits-title">${post.PTitle }</h3>
				<p>${post.PTime}
				<div class="w3l_more">
					<a href="/detail/${post.PId}" class="button button--nina" data-text="Learn more" >
						<span>L</span><span>e</span><span>a</span><span>n</span> <span>m</span><span>o</span><span>r</span><span>e</span>
					</a>
				</div>
			</div>
				<div class="clearfix"> </div>
			</div>
			<div class="clearfix"> </div>
		</div>
		</c:forEach>
	</div>
	<!-- //welcome -->
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
							<li><a href="index">Home</a> </li>
							<li><a href="about">About</a></li>
							<li><a href="gallery">Gallery</a></li>
							<li><a href="icons">Web Icons</a></li>
							<li><a href="codes">Short Codes</a></li>
							<li><a href="contact">Contact</a></li>
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
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/bootstrap.js"></script>
</body>
</html>