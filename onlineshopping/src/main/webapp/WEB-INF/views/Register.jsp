<%@include file="/WEB-INF/views/Header.jsp"%>
<%@include file="/WEB-INF/views/Navbar.jsp"%>




<div class="container">
	<div class="row">

		<div class="col md-4 myform" style="margin: 20px auto;">
			<div class="myform_head">

				<h3>Sign Up Here</h3>
			</div>

			<!-- Form register -->
			<form>
				<div class="form-group">
					<label for="exampleInputFname1">First Name</label> <input
						type="text" class="newtext form-control" id="exampleInputFname1"
						aria-describedby="emailHelp" placeholder="First name">
				</div>
				<div class="form-group">
					<label for="exampleInputLname1">Last Name</label> <input
						type="text" class="newtext form-control" id="exampleInputLname1"
						placeholder="Last Name">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Email address</label> <input
						type="email" class="newtext form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" placeholder="Enter email">
				</div>
				<div class="form-group">
					<label for="exampleInputPhone1">Mobile Number</label> <input
						type="number" class="newtext form-control" id="exampleInputPhone1"
						placeholder="Mobile number">
				</div>

				<div class="form-group">
					<label for="exampleInputUname1">User Name</label> <input
						type="text" class="newtext form-control" id="exampleInputUname1"
						aria-describedby="emailHelp" placeholder="User name">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Password</label> <input
						type="password" class="newtext form-control"
						id="exampleInputPassword1" placeholder="Password">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword2"> Confirm Password</label> <input
						type="password" class="newtext form-control"
						id="exampleInputPassword2" placeholder="Confirm Password">
				</div>
				<div class="form-check">
					<label class="form-check-label"> <input type="checkbox"
						class="form-check-input"> Lemme In!!
					</label>
				</div>
				<button type="submit" class=" btn-green btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
</div>

<%@include file="/WEB-INF/views/Footer.jsp"%>