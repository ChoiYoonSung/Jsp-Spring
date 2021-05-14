<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@page import="com.servlet.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>List</title>
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


        <div class="header-section">
            <div class="container-fluid">
                <div class="row justify-content-between align-items-center">
                    <div class="header-logo col-auto">
                    	<h1><a href="list">MainPage</a></h1>
                    </div>
                </div>
            </div>
        </div><!-- Header Section End -->
        <div class="side-header show">
            <button class="side-header-close"><i class="zmdi zmdi-close"></i></button>
            <!-- Side Header Inner Start -->
            <div class="side-header-inner custom-scroll">

                <nav class="side-header-menu" id="side-header-menu">
                    <ul>
                        <li><a href="list"><i class="ti-home"></i> <span>List</span></a></li>
                        <li><a href="login"><i class="ti-user"></i> <span>Login</span></a></li>
                    </ul>
                </nav>

            </div><!-- Side Header Inner End -->
        </div><!-- Side Header End -->

        <!-- Content Body Start -->
		<!-- Content Body Start -->
		<div class="content-body">

			<!-- Page Headings Start -->
			<div class="row justify-content-between align-items-center mb-10">

				<!-- Page Heading Start -->
				<div class="col-12 col-lg-auto mb-20">
					<div class="page-heading">
						<h3>Update Profile</h3>
					</div>
				</div>
				<!-- Page Heading End -->

			</div>
			<!-- Page Headings End -->

			<div class="row mbn-50">

				<!--Author Top Start-->
				<div class="col-12 mb-50">
					<div class="author-top">
						<div class="inner">
							<div class="author-profile">
								<div class="image">
									<img src="assets/images/avatar/profile.jpg" class="d-none"
										alt="">
									<h2>Profile</h2>
								</div>
								<div class="info">
									<h5>${memId }</h5>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--Author Top End-->

				<!--Right Sidebar Start-->
				<div class="col-xlg-12 col-12 mb-50">
					<div class="row mbn-30">

						<!--Author Information Start-->
						<div class="col-xlg-12 col-lg-12 col-12 mb-30">
							<div class="box">
								<div class="box-head">
									<h3 class="title">Author Information</h3>
								</div>
								<div class="box-body">
									<div class="form">
										<form action="update" method="post">
											<div class="row row-10 mbn-20">
												<div class="col-sm-1.5 col-3 mb-20">
													<label for="id">User Id</label>
												</div>
												<div class="col-sm-4.5 col-9 mb-20">
													<input type="text" class="form-control" id="id" name="memId" value="${memId }" placeholder="Id" readonly="readonly">
												</div>
												<div class="col-sm-1.5 col-3 mb-20">
													<label for="password">User Password</label>
												</div>
												<div class="col-sm-4.5 col-9 mb-20">
													<input type="password" class="form-control" id="password" value="" required="required">
												</div>
												<div class="col-sm-1.5 col-3 mb-20">
													<label for="phoneNumber">User PhoneNumber</label>
												</div>
												<div class="col-sm-4.5 col-9 mb-20">
													<input type="text" class="form-control" id="phoneNumber" value="" placeholder="Phone Number" required="required">
												</div>
												<div class="col-sm-1.5 col-3 mb-20">
													<label for="mail">User PhoneNumber</label>
												</div>
												<div class="col-sm-4.5 col-9 mb-20">
													<input type="email" class="form-control" id="mail" value="" placeholder="E-Mail" required="required">
												</div>
												<div class="col-12 mt-10 mb-20">
													<input type="submit" class="button button-primary button-outline" value="Save Changes">
													<input type="reset" class="button button-danger button-outline" value="Reset Changes">
												</div>
											</div>
										</form>
									</div>
								</div>

							</div>
						</div>
						<!--Author Information End-->
					</div>
				</div>
				<!--Right Sidebar End-->

			</div>

		</div>
        <!-- Footer Section Start -->
        <div class="footer-section">
            <div class="container-fluid">

                <div class="footer-copyright text-center">
                    <p class="text-body-light">2021 &copy; copyright YoonSung Choi</a></p>
                </div>

            </div>
        </div><!-- Footer Section End -->

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

    <!-- Plugins & Activation JS For Only This Page -->
    <script src="assets/js/plugins/datatables/datatables.min.js"></script>
    <script src="assets/js/plugins/datatables/datatables.active.js"></script>

</body>

</html>