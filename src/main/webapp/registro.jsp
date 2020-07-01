<%@page import="datos.DepartamentoDaoJDBC"%>
<%@page import="dominio.Departamento"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/styles.css" type="text/css">
<script src="https://kit.fontawesome.com/e964045dad.js" crossorigin="anonymous"></script>
<title>Registro - Tienda Online</title>
</head>
<body>

	<%--Inicio del encabezado // Barra de navegacion --%>
	<header class="fixed-top">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container">
				<%--Logotipo --%>
				<a class="navbar-brand" href="index.jsp">
					<img src="images/logoTienda.jpg" alt="logoTienda" />
				</a>
				<%--Collapsar opciones de navegacion en un Boton --%>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar-options" aria-controls="navbar-options" aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbar-options">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item-active"><a class="nav-link" href="index.jsp">Inicio</a></li>
						<li class="nav-item"><a class="nav-link" href="menu.jsp">Menú</a></li>
						<li class="nav-item"><a class="nav-link" href="nosotros.jsp">Nosotros</a></li>
						<li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#" id="dropdown-a" data-toggle="dropdown">Servicios</a>
							<div class="dropdown-menu" aria-labelledby="dropdown-a">
								<a class="dropdown-item " href="reservacion.jsp">Reservacion</a>
								<a class="dropdown-item " href="eventos.jsp">Eventos</a>
								<a class="dropdown-item " href="galeria.jsp">Galeria</a>
							</div></li>
						<li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#" id="dropdown-b" data-toggle="dropdown">Blog del Chef</a>
							<div class="dropdown-menu" aria-labelledby="dropdown-b">
								<a class="dropdown-item " href="blogRest.jsp">Blog del Restaurant</a>
								<a class="dropdown-item " href="blogChef.jsp">Blog Personal</a>
							</div></li>
						<li class="nav-item"><a class="nav-link" href="contactanos.jsp">Contactanos</a></li>
						<li class="nav-item dropleft"><a class="nav-link dropdown-toggle" href="#" id="dropdown-c" data-toggle="dropdown">
								<i class="fas fa-user"></i>
							</a>
							<div class="dropdown-menu" aria-labelledby="dropdown-c">
								<form class="px-1 py-3">
									<div class="form-group">
										<label for="email">Correo Electronico</label> <input type="email" class="form-control" id="email" placeholder="email@example.com">
									</div>
									<div class="form-group">
										<label for="pass">Password</label> <input type="password" class="form-control" id="pass" placeholder="Password">
									</div>
									<div class="form-check">
										<input type="checkbox" class="form-check-input" id="dropdownCheck"> <label class="form-check-label" for="dropdownCheck"> Recordarme </label>
									</div>
									<button type="submit" class="btn btn-primary">Entrar</button>
								</form>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="registro.jsp">Nuevo? Registrate Aquí</a>
								<a class="dropdown-item" href="#">Olvidaste tu Password?</a>
							</div></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<%--Fin del encabezado // Barra de Navegacion --%>

	<div id="bgImgRegistro">
		<h1 class="w-50 m-auto">Registro de Usuario - Tienda Online</h1> <br> <br>
		<form name="registro" action="registro" method="post" style="width: 33%;" class="m-auto">
			<div class="form-group row">
				<label for="nombres" class="col-sm-5 col-form-label font-weight-bold">Nombres:</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" id="nombres" name="nombres">
				</div>
			</div>
			<div class="form-group row">
				<label for="apPaterno" class="col-sm-5 col-form-label font-weight-bold">Apellido Paterno:</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" id="apPaterno" name="apPaterno">
				</div>
			</div>
			<div class="form-group row">
				<label for="apMaterno" class="col-sm-5 col-form-label font-weight-bold">Apellido Materno:</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" id="apMaterno" name="apMaterno">
				</div>
			</div>
			<div class="form-group row">
				<label for="dni" class="col-sm-5 col-form-label font-weight-bold">DNI:</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" id="dni" name="dni">
				</div>
			</div>
			<div class="form-group row">
				<label for="telfCell" class="col-sm-5 col-form-label font-weight-bold">Telefono Celular:</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" id="telfCell" name="telfCell">
				</div>
			</div>
			<div class="form-group row">
				<label for="telfFijo" class="col-sm-5 col-form-label font-weight-bold">Telefono Fijo:</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" id="telfFijo" name="telfFijo">
				</div>
			</div>
			<div class="form-group row">
				<label for="departamento" class="col-sm-5 col-form-label font-weight-bold">Departamento:</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" id="departamento" name="departamento">
				</div>
			</div>
			<div class="form-group row">
				<label for="distrito" class="col-sm-5 col-form-label font-weight-bold">Distrito:</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" id="distrito" name="distrito">
				</div>
			</div>
			<%--Agregar Lista de tabla Ciudad 
		<div class="form-group row">
			<label for="departamento" class="col-sm-4 col-form-label">Departamento:</label>
			<div class="col-sm-6">
				<select id="departamento" class="form-control" name="departamentos">
					<option selected>Elegir Departamento...</option>
					<% if(request.getAttribute("departamentos") != null){%>
						<c:forEach var ="d" items="${departamentos}">
					
					<option value="${d.idDepartamento}">${d.departamento}</option>
					</c:forEach>
					<% }%>
				</select>
			</div>
		</div> --%>

			<%--Agregar distrito segun ciudad 
		<div class="form-group row">
			<label for="distrito" class="col-sm-4 col-form-label">Distrito:</label>
			<div class="col-sm-6">
				<select id="distrito" class="form-control" name="distrito">
					<option selected>Elegir Distrito...</option>
				</select>
			</div>
		</div>--%>
			<div class="form-group row">
				<label for="direccion" class="col-sm-5 col-form-label font-weight-bold">Direccion:</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" id="direccion" name="direccion">
				</div>
			</div>
			<div class="form-group row">
				<label for="email" class="col-sm-5 col-form-label font-weight-bold">Email:</label>
				<div class="col-sm-6">
					<input type="email" class="form-control" id="email" name="email">
				</div>
			</div>
			<div class="form-group row">
				<label for="pass" class="col-sm-5 col-form-label font-weight-bold">Contraseña:</label>
				<div class="col-sm-6">
					<input type="password" class="form-control" id="pass" min="6" max="12" name="pass">
				</div>
			</div>
			<div class="form-group row">
				<label for="confirmPass" class="col-sm-5 col-form-label font-weight-bold">Repetir Contraseña:</label>
				<div class="col-sm-6">
					<input type="password" class="form-control" id="confirmPass" min="6" max="12" name="pass2">
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-3 m-auto">
					<button type="submit" class="btn btn-primary">Registrarse</button>
				</div>
				<div class="col-sm-3 m-auto">
					<button type="reset" class="btn btn-success">Limpiar</button>
				</div>
			</div>
		</form>
	</div>


	<%--Inicio Pie de Pagina --%>
	<footer class="footerWeb">
		<div class="container">
			<div class="row">
				<div class="col-lg-4 col-md-6 text-center transparentFoot">
					<h3>Horario de Atención</h3>
					<p class="text-monospace"><span>Lunes: </span>11am - 10PM</p>
					<p class="text-monospace"><span class="">Martes: </span>11am - 10PM</p>
					<p class="text-monospace"><span class="">Miercoles: </span>11am - 10PM</p>
					<p class="text-monospace"><span class="">Jueves: </span>11am - 10PM</p>
					<p class="text-monospace"><span class="">Viernes: </span>11am - 12PM</p>
					<p class="text-monospace"><span class="">Sábado: </span>11am - 12PM</p>
					<p class="text-monospace"><span class="">Domingo: </span>11am - 10PM</p>
				</div>
				<div class="col-lg-4 col-md-6 text-center transparentFoot">
					<h3>Información de Contacto</h3>
					<p class="lead">Sede Lima: Av. Alguna Calle 555, Surquillo</p>
					<p class="lead">Sede Arequipa: Av. Muy Lejano 777, Arequipa</p>
					<p class="lead">Sede Piura: Calle Por Ahí 333, Piura</p>
					<p class="lead"><a href="https://wa.link/l0kck9">+51961872040</a></p>
					<p><a href="#">A19201032@idat.edu.pe</a></p>
				</div>
				<div class="col-lg-4 col-md-6 text-center transparentFoot">
					<h3>Siguenos en nuestras RRSS</h3>
					<ul class="list-inline f-social">
						<li class="list-inline-item"><a href="https://www.facebook.com/erick.israel203/">
								<i class="fab fa-facebook fa-5x"></i>
							</a></li>
						<li class="list-inline-item"><a href="https://twitter.com/ErickM238">
								<i class="fab fa-twitter fa-5x"></i>
							</a></li>
						<li class="list-inline-item"><a href="https://www.linkedin.com/in/erick-meza-90980018b/">
								<i class="fab fa-linkedin fa-5x"></i>
							</a></li>
						<li class="list-inline-item"><a href="https://www.instagram.com/erickisrael203/">
								<i class="fab fa-instagram fa-5x"></i>
							</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="bg-dark">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<p class="text-center text-light">Derechos Reservados. &copy; 2020 <a href="#">Restaurant Online</a> <br> <span>Creado por: <strong>Erick Meza</strong></span> <br> <span>Diseño
								por: <strong>Delia Figueroa</strong>
						</span></p>
					</div>
				</div>
			</div>
		</div>
	</footer>
	<%-- Fin Pie de Pagina --%>

	</script>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>