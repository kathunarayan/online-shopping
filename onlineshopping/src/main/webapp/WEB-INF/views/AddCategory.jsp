<%@include file="/WEB-INF/views/Header.jsp"%>
<%@include file="/WEB-INF/views/Navbar.jsp"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<div class="container">
	<div class="row">

		<div class="col md-4 myform" style="margin: 20px auto;">
			<div class="myform_head">

				<h3>Add Category</h3>
			</div>

			<!-- Form register -->
			<form>
				<div class="form-group">
					<label for="CategoryName">Category Name</label> <input type="text"
						class="newtext form-control" id="CategoryName"
						placeholder="Category name">
				</div>

				<div class="form-group">
					<label for="CategoryDesc">Category Description</label> <input
						type="text" class="newtext form-control" id="CategoryDesc"
						placeholder="Category Description">
				</div>

				<div class="form-group">
					<label for="CategoryImage">Upload Image</label> <input type="file"
						class="form-control-file" id="CategoryImage">
				</div>

				<button type="submit" class=" btn-green btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
</div>

<%@include file="/WEB-INF/views/Footer.jsp"%>