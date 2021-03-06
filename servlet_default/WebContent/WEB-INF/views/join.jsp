<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Regist page</title>
    <meta name="robots" content="noindex, follow" />
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Favicon -->
    <link rel="shortcut icon" type="image/x-icon" href="<%=request.getContextPath() %>/assets/images/favicon.ico">

    <!-- CSS
	============================================ -->

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="<%=request.getContextPath() %>/assets/css/vendor/bootstrap.min.css">

    <!-- Icon Font CSS -->
    <link rel="stylesheet" href="<%=request.getContextPath() %>/assets/css/vendor/material-design-iconic-font.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/assets/css/vendor/font-awesome.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/assets/css/vendor/themify-icons.css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/assets/css/vendor/cryptocurrency-icons.css">

    <!-- Plugins CSS -->
    <link rel="stylesheet" href="<%=request.getContextPath() %>/assets/css/plugins/plugins.css">

    <!-- Helper CSS -->
    <link rel="stylesheet" href="<%=request.getContextPath() %>/assets/css/helper.css">

    <!-- Main Style CSS -->
    <link rel="stylesheet" href="<%=request.getContextPath() %>/assets/css/style.css">

</head>

<body class="skin-dark">

    <div class="main-wrapper">

        <!-- Content Body Start -->
        <div class="content-body m-0 p-0">

            <div class="login-register-wrap">
                <div class="row">

                    <div class="d-flex align-self-center justify-content-center order-2 order-lg-1 col-lg-5 col-12">
                        <div class="login-register-form-wrap">

                            <div class="content">
                                <h1>Regist</h1>
                                <p>Regist ?????? ??????????????????.</p>
                            </div>

                            <div class="login-register-form">
                                <form action="join" method="post">
                                    <div class="row">

                                        <div class="col-12 mb-20"><input class="form-control" type="text" placeholder="User ID" name="memId"></div>
                                        <div class="col-12 mb-20"><input class="form-control" id="pwd" type="password" placeholder="Password" name="memPw" value=""></div>
                                        <div class="col-12 mb-20"><input class="form-control" id="pwdChk" type="password" placeholder="Retype Password" value="">
                                        	<div class="col-12 xs-10" id="pwdChkMsg" style="display: none;"></div>
                                        </div>
                                        <div class="col-12 mb-20"><input class="form-control" type="text" placeholder="Tel" name="memPh"></div>
                                        <div class="col-12 mb-20"><input class="form-control" type="text" placeholder="Email" name="memMail"></div>
                                        
                                        <div class="col-12">
                                            <div class="justify-content-between">
                                                <div class="col-12 mb-15">?????? ???????????? ????????????????<a href="login">Login Now.</a></div>
                                                <div class="col-12 mb-15">???????????? ???????????? <a href="list">Go List.</a></div>
                                            </div>
                                        </div>
                                        <div class="col-12 mt-10"><button type="submit" class="button button-primary button-outline">sign up</button></div>
                                    </div>
                                </form>

                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div><!-- Content Body End -->

    </div>


    <!-- JS
============================================ -->

    <!-- Global Vendor, plugins & Activation JS -->
    <script src="<%=request.getContextPath() %>/assets/js/vendor/modernizr-3.6.0.min.js"></script>
    <script src="<%=request.getContextPath() %>/assets/js/vendor/jquery-3.3.1.min.js"></script>
    <script src="<%=request.getContextPath() %>/assets/js/vendor/popper.min.js"></script>
    <script src="<%=request.getContextPath() %>/assets/js/vendor/bootstrap.min.js"></script>
    <!--Plugins JS-->
    <script src="<%=request.getContextPath() %>/assets/js/plugins/perfect-scrollbar.min.js"></script>
    <script src="<%=request.getContextPath() %>/assets/js/plugins/tippy4.min.js.js"></script>
    <!--Main JS-->
    <script src="<%=request.getContextPath() %>/assets/js/main.js"></script>

	<script type="text/javascript">
    	$(document).ready(function(){
			$('#pwdChkMsg').hide();
    		  $("#pwdChk").keyup(function(){
		    	var pwdChk = $('#pwdChk').val();
		    	var pwd = $('#pwd').val();
		    	
		    	if(pwdChk == pwd){
		    		$('#pwdChkMsg').show();
		    		$('#pwdChkMsg').css("color","green");
		    		$('#pwdChkMsg').html("??????????????? ????????????.");
		    	}else{
		    		$('#pwdChkMsg').show();
		    		$('#pwdChkMsg').css("color","red");
		    		$('#pwdChkMsg').html("??????????????? ????????????..");
		    	}
    		  });
    		});
    </script>
</body>

</html>