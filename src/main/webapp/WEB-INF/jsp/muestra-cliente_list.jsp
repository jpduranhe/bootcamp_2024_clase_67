<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Producto</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<body>
<div class ="container">
		<div class="row">
			<div class="col-md-12"> 
				<table class="table">
				  <thead>
				    <tr>
				      <th scope="col">#</th>
				      <th scope="col">Nombre</th>
				      <th scope="col">Apellidos</th>
				      <th scope="col">Email</th>
				    </tr>
				  </thead>
				  <tbody>
				  <c:forEach var="cli" items="${list}"> 
				    <tr>
				      <th scope="row">
				      <a href="<c:url value = "/cliente/id/${cli.id}"/>">${cli.id}</a>				      
				      
				      </th>
				      <td>${cli.nombre}</td>
				      <td>${cli.apellidos}</td>
				      <td>${cli.email}</td>
				    </tr>
				    </c:forEach>
				  </tbody>
				</table>
			</div>
			
		</div>
	</div>	


</body>
</html>