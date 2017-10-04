<%@include file="/WEB-INF/views/Header.jsp"%>
<%@include file="/WEB-INF/views/Navbar.jsp"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<c:url value="/resources/images/bg-reg.jpg" var="bg" ></c:url>
<div class="container-fluid"  style="background-image: url('${bg}');">
	<div class="row">

		<div class="col md-4 myform" style="margin: 20px auto;">
			<div class="myform_head">

				<h3>Sign Up Here!!</h3>
			</div>

			<!-- Form register -->
			<c:url value="/all/saveCustomer" var="action"></c:url>
			<form:form action="${action}" method="post" name="form"
				modelAttribute="customer">
				<%-- <div class="alert alert-warning" role="alert">
					<p>${duplicateuser}</p>
				</div> --%>

				<div class="form-group">
					<label>First Name</label>
					<form:input path="fname" class="newtext form-control"
						placeholder="First Name" />
					<form:errors path="fname" cssStyle="color:red"></form:errors>
				</div>

				<div class="form-group">
					<label>Last Name</label>
					<form:input path="lname" class="newtext form-control"
						placeholder="Last Name" />
					<form:errors path="lname" cssStyle="color:red"></form:errors>
				</div>

				<div class="form-group">
					<label>Email</label>
					<form:input path="email" class="newtext form-control"
						placeholder="Email" />
					<form:errors path="email" cssStyle="color:red"></form:errors>
					<p style="color: red">${duplicateEmail}</p>
				</div>

				<div class="form-group">
					<label>Phone</label>
					<form:input path="phone" class="newtext form-control"
						placeholder="Phone" />
					<form:errors path="phone" cssStyle="color:red"></form:errors>
				</div>

				<div class="form-group">
					<label>User Name</label>
					<form:input path="user.username" class="newtext form-control"
						placeholder="User Name" />
					<form:errors path="user.username" cssStyle="color:red"></form:errors>
					<p style="color: red">${duplicateuser}</p>
				</div>

				<div class="form-group">
					<label>Password</label>
					<form:input path="user.password" class="newtext form-control"
						placeholder="Password" id="pd1" type="password" />
					<form:errors path="user.password" cssStyle="color:red"></form:errors>
				</div>

				<div class="form-group">
					<label>Confirm Password</label> <input type="password"
						class="newtext form-control" placeholder="Password" id="pd2" />
				</div>


				<div class="form-group">
					<label>Door no</label>
					<form:input path="billingAddress.doorno"
						class="newtext form-control" placeholder="Door no" id="pd1" />
					<form:errors path="billingAddress.doorno" cssStyle="color:red"></form:errors>
				</div>
				<div class="form-group">
					<label>Street Name</label>
					<form:input path="billingAddress.street"
						class="newtext form-control" placeholder="Street Name" id="pd1" />
					<form:errors path="billingAddress.street" cssStyle="color:red"></form:errors>
				</div>
				<div class="form-group">
					<label>City</label>
					<form:input path="billingAddress.city" class="newtext form-control"
						placeholder="City" id="pd1" />
					<form:errors path="billingAddress.city" cssStyle="color:red"></form:errors>
				</div>
				<div class="form-group">
					<label>State</label>
					<form:input path="billingAddress.state"
						class="newtext form-control" placeholder="State" id="pd1" />
					<form:errors path="billingAddress.state" cssStyle="color:red"></form:errors>
				</div>
				<div class="form-group">
					<label>Country</label>
					<form:input path="billingAddress.country"
						class="newtext form-control" placeholder="Country" id="pd1" />
					<form:errors path="billingAddress.country" cssStyle="color:red"></form:errors>
				</div>
				<div class="form-group">
					<label>Zipcode</label>
					<form:input path="billingAddress.zipcode"
						class="newtext form-control" placeholder="Zipcode" id="pd1" />
					<form:errors path="billingAddress.zipcode" cssStyle="color:red"></form:errors>
				</div>


				<%-- <div class="form-group">
					<label>Category Description</label> <form:input path="description"
					 class="newtext form-control" id="CategoryDesc"
						placeholder="Category Description" />
				</div>
 --%>
				<!-- <div class="form-group">
					<label for="CategoryImage">Upload Image</label> <input type="file"
						class="form-control-file" id="CategoryImage">
				</div> -->

				<button type="submit" class=" btn-green btn btn-primary" onclick="return Validate()">Submit</button>
			</form:form>
		</div>
	</div>
</div>

<%@include file="/WEB-INF/views/Footer.jsp"%>