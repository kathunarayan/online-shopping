<%@include file="/WEB-INF/views/Header.jsp"%>
<%@include file="/WEB-INF/views/Navbar.jsp"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<div class="container">
	<div class="row">

		<div class="col md-4 myform" style="margin: 20px auto;">
			<div class="myform_head">

				<h3>Sign In Here</h3>
			</div>

			<!-- Form login -->
			<form>
				

				<div class="form-group">
					<label for="LogInputUname1">User Name</label> <input
						type="text" class="newtext form-control" id="LogInputUname1"
						aria-describedby="emailHelp" placeholder="User name">
				</div>
				<div class="form-group">
					<label for="LogInputPassword1">Password</label> <input
						type="password" class="newtext form-control"
						id="LogInputPassword1" placeholder="Password">
				</div>
				
				<button type="submit" class=" btn-green btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
</div>

<%@include file="/WEB-INF/views/Footer.jsp"%>