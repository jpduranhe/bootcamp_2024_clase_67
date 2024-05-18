<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario Cliente</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
	<div class ="container">
		<div class="row">
			<div class="col-md-12">
				<h1>Formulario de Cliente</h1>
				<form action="#" method="post">
			     	<input type="hidden" name="id" value="0">
				  <div class="mb-3">
				    <label for="nombre" class="form-label">Nombre</label>
				    <input type="text" name="nombre" class="form-control" id="nombre">
				  </div>
				  <div class="mb-3">
				    <label for="apellidos" class="form-label">Apellidos</label>
				    <input type="text" name="apellidos" class="form-control" id="apellidos">
				  </div>
				  <div class="mb-3">
				    <label for="email" class="form-label">Email</label>
				    <input type="email" name="email" class="form-control" id="email">
				  </div>
				  <button type="submit" class="btn btn-primary">Ingresar</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>