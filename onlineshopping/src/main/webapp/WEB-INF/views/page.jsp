<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>
<script>
	window.menu = '${title}';
</script>
<!-- Bootstrap Core CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">


<!-- Custom CSS -->
<link href="${css}/mystyle.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div class="wrapper">

		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>


		<!-- Page Content -->

		<div class="content">
			<!-- loading the home content -->
			<c:if test="${userClicksHome == true}">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- loading only when user clicks about -->
			<c:if test="${userClicksAbout == true}">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- loading only when user clicks contact -->
			<c:if test="${userClicksContact == true}">
				<%@include file="contact.jsp"%>
			</c:if>

			<!-- loading only when user clicks contact -->
			<c:if
				test="${userClicksAllProducts == true or userClicksCategoryProducts == true}">
				<%@include file="listProducts.jsp"%>
			</c:if>

		</div>
		<!-- footer comes here -->
		<%@include file="./shared/footer.jsp"%>

		<!-- jQuery -->
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js">
			
		</script>


		<!-- Bootstrap Core JavaScript -->
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
			
		</script>

		<!-- Self coded JavaScript -->
		<script src=" ${js}/myapp.js">
			
		</script>
	</div>
</body>

</html>