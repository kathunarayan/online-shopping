<%@include file="/WEB-INF/views/Header.jsp"%>
<%@include file="/WEB-INF/views/Navbar.jsp"%>
<div class="container">
	<center><h2>List of Products</h2></center><br>
	<table class="table table-striped">
		<thead>
			<tr>
				<td>Product</td>
				<td>ProductName</td>
				<td>Category</td>
				<td>Price</td>
				<td>Information</td>
				<td>Delete</td>
				<td>Update</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${product}" var="p"> 
				<tr>
					<c:url value="/resources/images/${p.id}.png" var="image"></c:url>
					<td><img src="${image}" height="50" width="50" /></td>
					<c:url value="/all/products/viewproduct/${p.id}" var="view"></c:url>
					<td><a href="${view}">${p.productName}</a></td>
					<td>${p.category}</td>
					<td>${p.price}</td>
					<td><a href="${view}"><span class="glyphicon glyphicon-info-sign"></span></a></td>
					<security:authorize access="hasRole('ROLE_ADMIN')">
					<c:url value="/admin/products/deleteproduct/${p.id}" var="delete"></c:url>
					<td><a href="${delete}"><span class="glyphicon glyphicon-trash"></span></a></td>
					<c:url value="/admin/products/geteditproduct/${p.id}" var="edit"></c:url>
					<td><a href="${edit}"><span class="glyphicon glyphicon-pencil"></span></a></td>
					</security:authorize>
				</tr>
			</c:forEach> 
		</tbody>
	</table>
	</div>