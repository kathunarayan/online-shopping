<%@include file="/WEB-INF/views/Header.jsp"%>
<%@include file="/WEB-INF/views/Navbar.jsp"%>
<div class="container">
	<div class="row">
		<div class="col md-10 myform" style="margin:20px auto;">
			<div class="myform_head">

				<h3>Order Confirmation</h3>
			</div>
			<c:url value="/cart/confirm" var="url"></c:url>
<form:form action="${url}" modelAttribute="order">
            <div class="row">

                       
                       <div class="txt-center">
                            <h4>Summary</h4>
                       </div>
                       ORDER ID: ${order.id }
                  
                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <%-- <address>
                                    <strong>Shipping Address</strong><br/>
                                    ${order.shippingaddress.streetname}
                                <br/>
                                    ${order.shippingaddress.city}, ${order.shippingaddress.state}
                                <br/>
                                     ${order.shippingaddress.country}, ${order.shippingaddress.zipcode}
                                </address> --%>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-6 text-right">
                                <p>Shipping Date:&nbsp&nbsp&nbsp <fmt:formatDate type="date" value="${now}" />&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</p>
                                <p>Delivery Date:&nbsp&nbsp&nbsp ${delivery }</p>
                            </div>
                        </div>

                       <div class="row">

						<address>
							<strong>Billing Address</strong><br />
							${order.cart.customer.billingAddress.street} <br />
							${order.cart.customer.billingAddress.city},
							${order.cart.customer.billingAddress.state} <br />
							${order.cart.customer.billingAddress.country},
							${order.cart.customer.billingAddress.zipcode}
						</address>

					</div>

					<div class="row">
						<table class="table table-hover">
							<thead>
								<tr>
									<td class="f">Product</td>
									<td class="f">Quantity</td>
									<td class="f" class="text-center">Price</td>
									<td class="f" class="text-center" style="text-align: center">Total</td>
								</tr>
							</thead>
							<tbody>
								<c:set var="grandTotal" value="0.0"></c:set>
								<c:forEach var="cartItem" items="${order.cart.cartitems}">
									<tr>
										<c:url value="/resources/images/${cartItem.products.id}.png"
											var="image"></c:url>
										<td class="col-md-8" class="f"><img src="${image}"
											height="50" width="50" />${cartItem.products.productName}</td>
										<td class="col-md-1" class="f" style="text-align: center">${cartItem.quantity}</td>
										<td class="col-md-1" class="f" style="text-align: center">${cartItem.products.price}</td>
										<td class="col-md-2" class="f" style="text-align: center">${cartItem.totalprice}</td>
										<c:set var="grandTotal"
											value="${grandtotal + cartItem.totalprice }"></c:set>
									</tr>
								</c:forEach>

								<tr>
									<td></td>

									<td colspan="2" class="text-center" class="f">Grand Total:
									</td>
									<td class="text-center text-danger" class="f">&#8377;
										${grandTotal}</td>
								</tr>

							</tbody>
						</table>
						<button type="submit" class="btn btn-success center-block">Order</button>
					</div>



			
		</div>

		</form:form>
	</div>
</div>"