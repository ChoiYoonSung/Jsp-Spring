<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="false" %>
<!DOCTYPE html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Login Page</title>
    <meta name="robots" content="noindex, follow" />
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Favicon -->
    <link rel="shortcut icon" type="image/x-icon" href="assets/images/favicon.ico">

    <!-- CSS
	============================================ -->

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="assets/css/vendor/bootstrap.min.css">

    <!-- Icon Font CSS -->
    <link rel="stylesheet" href="assets/css/vendor/material-design-iconic-font.min.css">
    <link rel="stylesheet" href="assets/css/vendor/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/vendor/themify-icons.css">
    <link rel="stylesheet" href="assets/css/vendor/cryptocurrency-icons.css">

    <!-- Plugins CSS -->
    <link rel="stylesheet" href="assets/css/plugins/plugins.css">

    <!-- Helper CSS -->
    <link rel="stylesheet" href="assets/css/helper.css">

    <!-- Main Style CSS -->
    <link rel="stylesheet" href="assets/css/style.css">

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
                                <h1>Sign in</h1>
                                <p>Login 연습 페이지 입니다.</p>
                            </div>

                            <div class="login-register-form">
                                <form action="login" method="post">
                                    <div class="row">
                                        <div class="col-12 mb-20"><input class="form-control" type="text" placeholder="User ID" name="memId"></div>
                                        <div class="col-12 mb-20"><input class="form-control" type="password" placeholder="Password" name="memPw"></div>
                                        <div class="col-12">
                                            <div class="justify-content-between">
                                                <div class="col-auto mb-15">아이디가 없으신가요? <a href="join">Join Now.</a></div>
                                                <div class="col-auto mb-15">리스트로 돌아가기 <a href="list">Go List.</a></div>
                                            </div>
                                        </div>
                                        <div class="col-12 mt-10"><button type="submit" class="button button-primary button-outline">sign in</button></div>
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
    <script src="assets/js/vendor/modernizr-3.6.0.min.js"></script>
    <script src="assets/js/vendor/jquery-3.3.1.min.js"></script>
    <script src="assets/js/vendor/popper.min.js"></script>
    <script src="assets/js/vendor/bootstrap.min.js"></script>
    <!--Plugins JS-->
    <script src="assets/js/plugins/perfect-scrollbar.min.js"></script>
    <script src="assets/js/plugins/tippy4.min.js.js"></script>
    <!--Main JS-->
    <script src="assets/js/main.js"></script>

</body>

</html>