<%@include file="/WEB-INF/views/Header.jsp"%>
<%@include file="/WEB-INF/views/Navbar.jsp"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<div class="container">
	<div class="row">

		<div class="col md-4 myform" style="margin: 20px auto;">
			<div class="myform_head">

				<h3>Add Product</h3>
			</div>

			<!-- Form register -->
			<form>
				<div class="form-group">
					<label for="ProductName">Product Name</label> <input type="text"
						class="newtext form-control" id="ProductName"
						placeholder="Product name">
				</div>

				<div class="form-group">
					<label for="ProductPrice">Product Price</label> <input
						type="number" class="newtext form-control" id="ProductPrice"
						placeholder="Product price">
				</div>
				<div class="form-group">
					<label for="ProductQuantity">Product Quantity</label> <input
						type="number" class="newtext form-control" id="ProductQuantity"
						placeholder="Product Quantity">
				</div>

				<div class="form-group">
					<label for="ProductDesc">Product Description</label> <input
						type="text" class="newtext form-control" id="ProductDesc"
						placeholder="Product Description">
				</div>
				<div class="form-group">
					<label for="ProductCategory">Select Category</label> <select
						class="newtext form-control" id="ProductCategory">
						<option>1</option>
						<option>2</option>

					</select>
				</div>
				
					<div class="form-group">
						<label for="ProductImage">Upload Image</label> <input
							type="file" class="form-control-file"
							id="ProductImage">
					</div>
				
				<button type="submit" class=" btn-green btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
</div>

<%@include file="/WEB-INF/views/Footer.jsp"%>