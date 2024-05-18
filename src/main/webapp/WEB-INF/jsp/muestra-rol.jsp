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
				<div class="card" style="width: 18rem;">
				  <div class="card-header">
				    Datos Rol <small>${rl.id}</small>
				    ${rl.nombre}
				  </div>
				  <ul class="list-group list-group-flush">
				  <c:forEach var="usu" items="${rl.usuarios}">
				    <li class="list-group-item">${usu.cliente.nombre}</li>
				  </c:forEach>
				  </ul>
				</div>
			</div>
		</div>
	</div>	


</body>
</html>