<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap Login Form Template</title>

        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="reg/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="reg/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="reg/css/form-elements.css">
        <link rel="stylesheet" href="reg/css/style.css">

        <style>
            .form-bottom{
                position: relative;
            }
            #pw, #em, #ph{
                display: none;
                width: 260px;
                position: absolute;
                left: 380px;
                color: #fc8d8a;
                text-align: center;
            }
            #pw{
                bottom: 166px;
                line-height: 36px;
            }
            #em{
                bottom: 166px;
                line-height: 36px;
            }
            #ph{
                bottom: 100px;
                line-height: 36px;
            }
            #pw .angle, #em .angle, #ph .angle{
                display: inline-block;
                border-top: 8px solid transparent;
                border-bottom: 8px solid transparent;
                border-left: 12px solid transparent;
                border-right: 12px solid #9acfea;
            }
            #pw .content, #em .content, #ph .content{
                display: inline-block;
                width: 230px;
                height: 36px;
                border-radius: 6px;
                background: #9acfea;
            }
        </style>

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="reg/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="reg/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="reg/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="reg/ico/apple-touch-icon-57-precomposed.png">

    </head>

    <body>

        <!-- Top content -->
        <div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>欢迎来到</strong>宠物情缘</h1>
                            <div class="description">
                            	<p>
	                            	这是一个为宠物寻找爱情的网站
	                            	
                            	</p>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	<div class="form-top">
                        		<div class="form-top-left">
                        			<h3>注册你的账号</h3>
                            		<p>输入你的注册信息:</p>
                        		</div>
                        		<div class="form-top-right">
                        			<i class="fa fa-key"></i>
                        		</div>
                            </div>
                            <div class="form-bottom">
			                    <form role="form" action="/addUser" method="post" class="login-form" id="form">
			                    	<div class="form-group">
			                    		<label class="sr-only" for="form-username">Username</label>
			                        	<input type="text" name="u_name" placeholder="Username..." class="form-username form-control" id="form-username">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-password">Password</label>
			                        	<input type="password" name="u_password" placeholder="Password..." class="form-password form-control" id="form-password">
			                        </div>
									<div class="form-group">
			                        	<label class="sr-only" for="form-password">Password again</label>
			                        	<input type="password" name="form-password" placeholder="Password again..." class="form-password form-control" id="form-password-again">
			                        </div>
									<div class="form-group">
			                        	<label class="sr-only" for="form-password">Phone</label>
			                        	<input type="text" name="u_phone" placeholder="Phone..." class="form-password form-control" id="form-phone">
			                        </div>
			                        <button type="submit" class="btn">Sign up!</button>
			                    </form>
                                <div id="pw">
                                    <span class="angle"></span><span class="content">两次输入的密码不一致</span>
                                </div>
                                <div id="em">
                                    <span class="angle"></span><span class="content">邮箱格式不正确</span>
                                </div>
                                <div id="ph">
                                    <span class="angle"></span><span class="content">手机号格式不正确</span>
                                </div>
		                    </div>
                        </div>
                    </div>
                  
                </div>
            </div>
            
        </div>
  


        <!-- Javascript -->
        <script src="reg/js/jquery-1.11.1.min.js"></script>
        <script src="reg/bootstrap/js/bootstrap.min.js"></script>
        <script src="reg/js/jquery.backstretch.min.js"></script>
        <script src="reg/js/scripts.js"></script>
        
        <!--[if lt IE 10]>
            <script src="reg/js/placeholder.js"></script>
        <![endif]-->

        <script>
            // $(".login-form").onsubmit = function (ev) {
            //     $("#form-username").value = "王成龙";
            //     ev.preventDefault();
            // }
            function getDOMById(id) {
                return document.getElementById(id);
            }
            var form = document.getElementById("form");
            form.onsubmit = function (ev) {
                var username = getDOMById("form-username");
                var password = getDOMById("form-password");
                var password_again = getDOMById("form-password-again");
                var email = getDOMById("form-email");
                var phone = getDOMById("form-phone");
                //两次密码是否相等
                if (password.value != password_again.value) {
                    var pw = getDOMById("pw");
                    pw.style.display = "block";
                    password.onfocus = function () {
                        pw.style.display = "none";
                    }
                    password_again.onfocus = function () {
                        pw.style.display = "none";
                    }
                    ev.preventDefault();
                }
                //验证邮箱格式
                // if (email.value != "") {
                //     var reg = /^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
                //     if (!reg.test(email.value)) {
                //         var em = getDOMById("em");
                //         em.style.display = "block";
                //         email.onfocus = function () {
                //             em.style.display = "none";
                //         }
                //         ev.preventDefault();
                //     }
                // }
                //验证11位手机号格式
                if (phone.value != "") {
                    var part = /^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\d{8}$/;
                    if (!part.test(phone.value)) {
                        var ph = getDOMById("ph");
                        ph.style.display = "block";
                        phone.onfocus = function () {
                            ph.style.display = "none";
                        }
                        ev.preventDefault();
                    }
                }
            }
        </script>
    </body>

</html>