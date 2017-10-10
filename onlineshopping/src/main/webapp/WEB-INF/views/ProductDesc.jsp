<%@include file="/WEB-INF/views/Header.jsp"%>
<%@include file="/WEB-INF/views/Navbar.jsp"%>
<div class="container">
	<div class="row">
	<div class="col-lg-12 mybox">
		<div class="col-lg-4">
			<c:url value="/resources/images/${product.id }.png" var="image"></c:url>
			<img src="${image}" height="300" width="250" />
		</div>
		<div class="col-lg-8">
			<div class="row">
			<h4>Product Name: ${product.productName}</h4>
			<h4>Category: ${product.category.categoryName}</h4>
			<h4>Product Price: Rs.${product.price}</h4>
			<h4>Product Description: ${product.description}</h4>
			</div>
			<div class="row">
				<c:if test="${product.quantity!=0 }">
					<c:url value="/cart/addtocart/${product.id}" var="shop"></c:url>
					<form action="${shop}">
						<!-- Enter Units<input type="text" name="units"><br> -->

						<input type="text" name="units" value="1"
							style="width: 36px; text-align: center;" hidden />

						<button type="submit" class="btn-green btn btn-primary">
							<span class="glyphicon glyphicon-shopping-cart"></span>AddToCart
						</button>
					</form>
				</c:if>
				<c:if test="${product.quantity ==0 }">
				<h4>OUT OF STOCK</h4></c:if>
			</div>
			<div class="row"></div>
		</div>
</div>
	</div>
</div>