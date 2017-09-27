<%@include file="/WEB-INF/views/Header.jsp"%>
<%@include file="/WEB-INF/views/Navbar.jsp"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<div class="container">
	<div class="row">

		<div class="col md-4 myform" style="margin: 20px auto;">
			<div class="myform_head">

				<h3>Add Category</h3>
			</div>

			<!-- Form register -->
			<c:url value="/admin/savecategory" var="action"></c:url>
			<form:form action="${action}" method="post" name="form"
				modelAttribute="category">

			
				<div class="form-group">
					<label>Category Name</label>
					<form:input path="cat_name" class="newtext form-control"
						placeholder="Category name" />
						<form:errors path="cat_name" cssStyle="color:red"></form:errors>
				</div>

				<div class="form-group">
					<label>Category Description</label> <form:input path="description"
					 class="newtext form-control" id="CategoryDesc"
						placeholder="Category Description" />
				</div>

				<!-- <div class="form-group">
					<label for="CategoryImage">Upload Image</label> <input type="file"
						class="form-control-file" id="CategoryImage">
				</div> -->

				<button type="submit" class=" btn-green btn btn-primary">Submit</button>
			</form:form>
		</div>
	</div>
</div>

<%@include file="/WEB-INF/views/Footer.jsp"%>