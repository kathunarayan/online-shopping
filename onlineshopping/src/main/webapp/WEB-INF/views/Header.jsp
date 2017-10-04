<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fashion - An Ecommerce platform</title>
<!-- Fonts -->
<link href="https://fonts.googleapis.com/css?family=Raleway"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Latest compiled and minified CSS -->

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<style>
.myform_head {
	background-color: #9d9d9d;
	color: #fff; border-color : #310b2b;
	padding: 1rem;
	border-color: #310b2b;
}

.myform {
	width: 600px;
	important margin: 20px auto;
	padding-bottom: 10px;
	important -webkit-box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .16), 0 2px 10px
		0 rgba(0, 0, 0, .12);
	box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .16), 0 2px 10px 0
		rgba(0, 0, 0, .12);
}

.btn-green:hover {
	background-color: #76FF03;
	border-color: #310b2b
}

.btn-green {
	background-color: #64DD17;
	border-color: #310b2b;
	padding: .85rem 2.13rem;
	border-radius: 2px;
	border: 0;
	box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .16), 0 2px 10px 0
		rgba(0, 0, 0, .12);
}

form {
	margin: 60px;
}

.newtext {
	border: none;
	border-bottom: 1px solid #9e9e9e;
	border-radius: 0;
	outline: none;
	height: 3rem;
	box-shadow: none;
}

.navbar {
	border-radius: 0px;
}

.logo {
	width: 500px;
	margin-left: auto;
	margin-right: auto;
	padding: auto;
	margin-left: auto;
}

.logo img {
	margin: 0px;
}

.navbar-inverse {
	background-color: #5b2652;
	border-color: #310b2b;
}

.navbar-inverse .navbar-nav>.active>a, .navbar-inverse .navbar-nav>.active>a:focus,
	.navbar-inverse .navbar-nav>.active>a:hover {
	color: #fff;
	background-color: #310b2b;
}

.navbar {
	margin-bottom: 0px;
}

#footer {
	margin-top: 50px;
	padding-top: 50px;
	padding-bottom: 50px;
	color: #fff;
	background-color: #310b2b;
	color: #fff;
}

#footer ul {
	list-style-type: none;
	color: #DCC6E0;
}

body {
	font-family: 'Raleway', sans-serif;
}

.container-fluid {
	padding-right: 0px;
	padding-left: 0px;
}

.midBoxes img, h3 {
	text-align: center;
}

.affix {
	top: 0;
	width: 100%;
}

.affix+.container-fluid {
	padding-top: 70px;
}
</style>


<script>
	$('.carousel').carousel();
</script>
</head>
<body>