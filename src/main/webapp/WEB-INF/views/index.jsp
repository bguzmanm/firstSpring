<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menú</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>HOME</h1>
		<%@include file="menu.jsp" %>
		
		<table class="table">
			<thead class="table-dark">
				<tr>
					<th scope="col">#</th>
					<th scope="col">Nombre</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="e" items="${lista}">
					<tr>
						<td><c:out value="${e.getId()}"></c:out></td>
						<td><c:out value="${e.getNombre()}"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>