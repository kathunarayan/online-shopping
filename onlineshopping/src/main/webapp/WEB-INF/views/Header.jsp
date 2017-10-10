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
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<jsp:useBean id="now" class="java.util.Date" />
<script type="text/javascript">
	document.getElementById('app').onclick = function() {
		myFunction()
	};
	function myFunction() {
		var x = document.getElementById('myDIV');
		x.style.display = 'block';
	}
	function formCC() {
		var cname = document.getElementById('cname');
		var cexp = document.getElementById('cexp');
		var cvc = document.getElementById('cvc');
		if (Credit(cname, " Enter a valid 16 digit number")) {
			if (isNumeric(cname, "Please enter only numbers")) {
				if (isAlphanumeric(cexp,
						"Please enter valid date of expiry in suggested format")) {
					if (Cvc(cvc, " Enter a valid 3 digit number")) {
						if (isNumeric(cvc, "Please enter only numbers")) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	function Credit(elem, helperMsg) {
		if (elem.value.length != 16) {
			alert(helperMsg);
			elem.focus(); // set the focus to this input
			return false;
		}
		return true;
	}
	function Cvc(elem, helperMsg) {
		if (elem.value.length != 3) {
			alert(helperMsg);
			elem.focus(); // set the focus to this input
			return false;
		}
		return true;
	}
	function isAlphabet(elem, helperMsg) {
		var alphaExp = /^[a-z A-Z]+$/;
		if (elem.value.match(alphaExp)) {
			return true;
		} else {
			alert(helperMsg);
			elem.focus();
			return false;
		}
	}
	function isAlphanumeric(elem, helperMsg) {
		var alphaExp = /^[0-9a-zA-Z\.\-]+$/;
		if (elem.value.match(alphaExp)) {
			return true;
		} else {
			alert(helperMsg);
			elem.focus();
			return false;
		}
	}
	function isNumeric(elem, helperMsg) {
		var numericExpression = /^[0-9]+$/;
		if (elem.value.match(numericExpression)) {
			return true;
		} else {
			alert(helperMsg);
			elem.focus();
			return false;
		}
	}
</script>


<style>

.blueButton {
	background-color: #0088BB;
	cursor: pointer;
	color: #fff;
	font-family: Arial;
	font-size: 15px;
	padding: 9px 23px;
	text-decoration: none;
}
.payment input[type=text] {
	width: 95%;
	padding: 12px 20px;
	margin: 8px 0;
	display: block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	resize: none;
	text-align: left;
}
.payment input[type=text]:focus {
	border: 1px solid #a8a8a8;
}
.payment input[type=submit], .payment input[type=button] {
	float: right;
	margin: -20px 20px 10px 0px;
}
.payment {
	border-radius: 5px;
	background-color: #f8f8f8;
	padding: 40px;
	width: 25%;
	margin: 0 auto;
	margin-top: 20px;
	box-shadow: 1px 1px 5px #888888;
}
/******************************************************************
Below is the form for the confirm order table 
******************************************************************/
/* CSS for Credit Card Payment form */
.credit-card-box .panel-title {
	display: inline;
	font-weight: bold;
}
.credit-card-box .form-control.error {
	border-color: red;
	outline: 0;
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 8px
		rgba(255, 0, 0, 0.6);
}
.credit-card-box label.error {
	font-weight: bold;
	color: red;
	padding: 2px 8px;
	margin-top: 2px;
}
.credit-card-box .payment-errors {
	font-weight: bold;
	color: red;
	padding: 2px 8px;
	margin-top: 2px;
}
.credit-card-box label {
	display: block;
}
/* The old "center div vertically" hack */
.credit-card-box .display-table {
	display: table;
}
.credit-card-box .display-tr {
	display: table-row;
}
.credit-card-box .display-td {
	display: table-cell;
	vertical-align: middle;
	width: 50%;
}
.credit-card-box .panel-heading img {
	min-width: 180px;
}
#myDIV {
	margin-top: 20px;
	display: none;
}
.mybox {
	margin: 50px;
}

.myform_head {
	background-color: #9d9d9d;
	color: #fff;
	border-color: #310b2b;
	padding: 1rem;
	border-color: #310b2b;
}

.myform {
	background-color: #fff;
	//width: 600px;
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

.btn {
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
#myDIV{
display:none;
.container{
min-height:500px;}

}
</style>
<script type="text/javascript">
	/*add new shipping address*/
	document.getElementById('app').onclick = function() {
		myFunction()
	};
	function myFunction() {
		var x = document.getElementById('myDIV');
		x.style.display = 'block';
	}

	/* for carousel */
	$('.carousel').carousel();

	/* for password match */
	function Validate() {
		var str1 = document.getElementById("pd1").value;
		var str2 = document.getElementById("pd2").value;
		if (str1 != str2) {
			alert("Passwords donot match");
			return false;
		}
		return true;
	}
</script>
</head>
<body>