<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<div class="logo">
	<c:url value="/resources/images/logo.jpg" var="logo" />
	<img src="${logo}" align="middle" />
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
				<c:url value="/" var="home"></c:url>
				<li class="active"><a href="${home}">Home</a></li>
				<c:if test="${pageContext.request.userPrincipal.name!=null }">
				<security:authorize access="hasRole('ROLE_ADMIN')">
				<c:url value="/admin/products/getcategoryform" var="cat"/>
				<li><a href="${cat}">Category</a></li>
				</security:authorize>
				</c:if>
				<c:url value="/all/products/getallproducts" var="pdtlist"></c:url>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Products <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<c:url value="/all/products/getallproducts" var="pdtlist"></c:url>
						<li><a href="${pdtlist}">View Products</a></li>
						<c:if test="${pageContext.request.userPrincipal.name!=null }">
							<security:authorize access="hasRole('ROLE_ADMIN')">
								<c:url value="/admin/products/getproductform" var="pdt"></c:url>
								<li><a href="${pdt}">Add Product</a></li>
							</security:authorize>
						</c:if>
					</ul></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<c:if test="${pageContext.request.userPrincipal.name==null }">
					<c:url value="/all/RegistrationForm" var="reg"></c:url>
					<li><a href="${reg}"><span
							class="glyphicon glyphicon-user"></span> Sign Up</a></li>

					<c:url value="/Login" var="log"></c:url>
					<li><a href="${log}"><span
							class="glyphicon glyphicon-log-in"></span> Sign In</a></li>
				</c:if>
				<c:url value="/cart/getcart" var="cart"></c:url>
				<c:if test="${pageContext.request.userPrincipal.name!=null }">
				<security:authorize access="hasRole('ROLE_USER')">
					<li><a href="${cart }"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
					</security:authorize>
				</c:if>
				<c:url value="/j_spring_security_logout" var="logoutUrl"></c:url>
				<c:if test="${pageContext.request.userPrincipal.name!=null }">
					<li><a href="${logoutUrl }"><span
							class="glyphicon glyphicon-log-out"></span> Logout</a></li>
				</c:if>
			</ul>
		</div>
	</div>
</nav>