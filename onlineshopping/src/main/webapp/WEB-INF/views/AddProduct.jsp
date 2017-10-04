<%@include file="/WEB-INF/views/Header.jsp"%>
<%@include file="/WEB-INF/views/Navbar.jsp"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:url value="resources/images/bg-pdt.jpg" var="bg" ></c:url>
<div class="container-fluid"  style="background-image: url('${bg}');">
	<div class="row">

		<div class="col md-4 myform" style="margin: 20px auto;">
			<div class="myform_head">

				<h3>Add Product</h3>
			</div>

			<!-- Form register -->
			<c:url value="/admin/saveproduct" var="action"></c:url>
			<form:form action="${action}" method="post" name="form"
				modelAttribute="product" enctype="multipart/form-data">

				<form:hidden path="id" />
				<div class="form-group">
					<label>Product Name</label>
					<form:input path="productName" class="newtext form-control"
						placeholder="Product name" />
					<form:errors path="productName" cssStyle="color:red"></form:errors>
				</div>

				<div class="form-group">
					<label>Product Description</label>
					<form:input path="description" class="newtext form-control"
						placeholder="Product Description" />
					<form:errors path="description" cssStyle="color:red"></form:errors>
				</div>


				<div class="form-group">
					<label>Product Price</label>
					<form:input path="price" class="newtext form-control"
						placeholder="Product Price" />
					<form:errors path="price" cssStyle="color:red"></form:errors>
				</div>

				<div class="form-group">
					<label>Product Quantity</label>
					<form:input path="quantity" class="newtext form-control"
						placeholder="Product Quantity" />
					<form:errors path="quantity" cssStyle="color:red"></form:errors>
				</div>

				<%-- <div class="form-group">
					<label>Category Description</label> <form:input path="description"
					 class="newtext form-control" id="CategoryDesc"
						placeholder="Category Description" />
				</div> --%>
				<div class="form-group">
					<label>Select Category</label> 
					<form:select path="category" 
						class="newtext form-control" id="ProductCategory">
						<c:forEach items="${categories}" var="c">
						<form:option value="${c.categoryName }" label="${c.categoryName }" />
					</c:forEach>

					</form:select>
					
					<div class="form-group">
						<label>Upload Image</label> 
						<input type="file" name="image"	class="form-control-file" >
					</div>
					
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