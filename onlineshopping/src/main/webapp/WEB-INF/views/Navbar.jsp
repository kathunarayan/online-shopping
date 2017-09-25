<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>

<div class="logo">
		<img src="resources/images/logo.jpg"
			align="middle" />
	</div>

	<nav class="navbar navbar-inverse" data-spy="affix"
		data-offset-top="197">

	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>

		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<li class="active"><a href="/Home">Home</a></li>
				<li><a href="#">Men</a></li>
				<li><a href="#">Women</a></li>
				<li><a href="#">Kids</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
			<c:url value="/Register" var="reg" ></c:url>
				<li><a href="${reg}"><span class="glyphicon glyphicon-user"></span>
						Sign Up</a></li>
				<li><a href="/Login"><span class="glyphicon glyphicon-log-in"></span>
						Sign In</a></li>
			
			</ul>
		</div>
	</div>
	</nav>