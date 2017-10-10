<%@include file="/WEB-INF/views/Header.jsp"%>
<%@include file="/WEB-INF/views/Navbar.jsp"%>
<div class="container">
		<div class="row mybox">
		<c:if test="${count!=0}">
		<c:url value="/cart/removecart/${i.id}" var="clear"></c:url>
		<a href="${clear}" class="btn btn-danger pull-left"><span
			class="glyphicon glyphicon-remove-sign"></span>Clear Cart</a>
		<c:url value="/cart/shippingaddressform" var="order"></c:url>
		<a href="${order}" class="btn btn-success pull-right"><span
			class="glyphicon glyphicon-shopping-cart"></span>Check out</a>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ProductName</th>
					<th>Quantity</th>
					<th>Total price</th>
					<th>Remove</th>
				</tr>
			</thead>
			<c:set var="grandtotal" value="0"></c:set>
			<tbody>
				<c:forEach items="${i.cartitems}" var="c">
					<tr>
						<c:url value="/resources/images/${c.products.id}.png" var="image"></c:url>
						<td><img src="${image}" height="50" width="70" />
							${c.products.productName}</td>
						<td><c:url value="/cart/minus/${c.products.id}" var="minus"></c:url>
							<a href="${minus}"><span
								class="glyphicon glyphicon-minus-sign"> </span></a> <input
							type="text" value="${c.quantity}"
							style="width: 36px; text-align: center;"> <c:url
								value="/cart/plus/${c.products.id}" var="plus"></c:url> <a
							href="${plus}"><span class="glyphicon glyphicon-plus-sign">
							</span></a></td>
						<td>${c.totalprice}</td>
						<td><c:url value="/cart/removecartitem/${c.id}" var="remove"></c:url>
							<c:set var="grandtotal" value="${c.totalprice + grandtotal}"></c:set>
							<a href="${remove}" class="label label-danger pull-left"><span
								class="glyphicon glyphicon-remove"></span>Remove</a></td>
					</tr>
					<tr>
						<td colspan="3" class="text-right">
							<h4>Grandtotal: &#8377; ${grandtotal}</h4>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</c:if>
		<c:if test="${count==0}">
			<center>
			<h4>
				<font color="red">Your Cart is empty :(</font>
			</h4>
			<br>
			<c:url value="/all/products/getallproducts" var="h"></c:url>
			<a href="${h}" class="btn btn-success"> Add Products to Cart</a> 
			</center>
		</c:if>
		</div>
	</div>