<%@include file="/WEB-INF/views/Header.jsp"%>
<%@include file="/WEB-INF/views/Navbar.jsp"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<div class="container">
	<div class="row">
		<div class="col mb-4" style="width:600px;margin:auto;">
			<!-- Form register -->
			<form>
				<p class="h3 text-center mb-4">Sign up</p>

				<div class="md-form">
					<i class="fa fa-user prefix grey-text"></i> 
					<input type="text" id="orangeForm-name form1" class="form-control"> 
					<label for="orangeForm-name form1">Your name</label>
				</div>
				<div class="md-form">
					<i class="fa fa-envelope prefix grey-text"></i> <input type="text"
						id="orangeForm-email" class="form-control"> <label
						for="orangeForm-email">Your email</label>
				</div>

				<div class="md-form">
					<i class="fa fa-lock prefix grey-text"></i> <input type="password"
						id="orangeForm-pass" class="form-control"> <label
						for="orangeForm-pass">Your password</label>
				</div>

			</form>
		</div>
	</div>
</div>