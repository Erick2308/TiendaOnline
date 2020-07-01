<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/styles.css" type="text/css">
<script src="https://kit.fontawesome.com/e964045dad.js" crossorigin="anonymous"></script>
<title>Restaurant Online</title>
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

	<%--Inicio Deslizamiento de imagenes --%>
	<div id="carouselImg" class="carousel slide" data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#carouselImg" data-slide-to="0" class="active"></li>
			<li data-target="#carouselImg" data-slide-to="1"></li>
			<li data-target="#carouselImg" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner">
			<%--Primer Slide --%>
			<div class="carousel-item active">
				<img class="d-block" src="images/imgSlide1.jpg" alt="imgSlide1">
				<div class="carousel-caption d-none d-md-block">
					<div class="transparentSlide">
						<h1 class="h5 text-dark font-weight-bold">Bienvenido al <br> <strong>Restaurant Online</strong></h1>
						<p class="text-dark font-weight-bold">Nuestros platos son preparados con los mejores ingredientes</p>
						<p><a class="btn btn-lg btn-circle btn-outline-dark" href="reservacion.jsp">Reservación</a></p>
					</div>
				</div>
			</div>
			<%--Segundo Slide --%>
			<div class="carousel-item">
				<img class="d-block" src="images/imgSlide2.jpeg" alt="imgSlide2">
				<div class="carousel-caption d-none d-md-block">
					<div class="transparentSlide">
						<h1 class="h5 text-dark font-weight-bold">Nuestro Chef nos cuenta sus secretos</h1>
						<p class="text-dark font-weight-bold">Tecnicas de cocina, utensilios, clases podras encontrar en este blog</p>
						<p><a class="btn btn-lg btn-circle btn-outline-dark" href="blogChef.jsp">Blog del Chef</a></p>
					</div>
				</div>
			</div>
			<%--Tercer Slide --%>
			<div class="carousel-item">
				<img class="d-block" src="images/imgSlide3.jpg" alt="imgSlide3">
				<div class="carousel-caption d-none d-md-block">
					<div class="transparentSlide">
						<h1 class="h5 text-dark font-weight-bold">Menu Gourmet para toda la familia</h1>
						<p class="text-dark font-weight-bold">Contamos con diversos tipos de platos, entra y mira nuestro Menú</p>
						<p><a class="btn btn-lg btn-circle btn-outline-dark" href="menu.jsp">Menú</a></p>
					</div>
				</div>
			</div>
		</div>
		<a class="carousel-control-prev" href="#carouselImg" role="button" data-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a>
		<a class="carousel-control-next" href="#carouselImg" role="button" data-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span class="sr-only">Next</span>
		</a>
	</div>
	<%--Fin deslizamiento de imagenes --%>



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

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>