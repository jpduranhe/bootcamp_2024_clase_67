<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
				    Datos Usuario <small>${usu.id}</small>
				    
				    <h1>${usu.usuario}</h1>
				    <h1>${usu.clave}</h1>
				    <h1>${usu.activo}</h1>
				    <h1>${usu.rol.nombre}</h1>
				  </div>
				  <ul class="list-group list-group-flush">
				    <li class="list-group-item">${usu.cliente.nombre}</li>
				    <li class="list-group-item">${usu.cliente.apellidos}</li>
				    <li class="list-group-item">${usu.cliente.email}</li>
				  </ul>
				</div>
			</div>
		</div>
	</div>	


</body>
</html>