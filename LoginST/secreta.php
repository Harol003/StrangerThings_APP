<!DOCTYPE html>
<html lang="en">
<head>
  <!-- Theme Made By www.w3schools.com - No Copyright -->
  <title>Innova Colombia: Proyecto STRANGER THINGS</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
  body {
    font: 20px Montserrat, sans-serif;
    line-height: 1.8;
    color: #f5f6f7;
  }
  p {font-size: 16px;}
  .margin {margin-bottom: 45px;}
  .bg-1 { 
    background-color: #0e0f0f; /* Green */
    color: #ffffff;
  }
  .bg-2 { 
    background-color: #62519e; /* Dark Blue */
    color: #ffffff;
  }
  .bg-3 { 
    background-color: #ffffff; /* White */
    color: #555555;
  }
  .bg-4 { 
    background-color: #2f2f2f; /* Black Gray */
    color: #fff;
  }
  .container-fluid {
    padding-top: 70px;
    padding-bottom: 70px;
  }
  .navbar {
    padding-top: 15px;
    padding-bottom: 15px;
    border: 0;
    border-radius: 0;
    margin-bottom: 0;
    font-size: 12px;
    letter-spacing: 5px;
  }
  .navbar-nav  li a:hover {
    color: #1abc9c !important;
  }
  </style>
</head>
<body>



<!-- Navbar -->
<nav class="navbar navbar-default">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Programacion II</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <!-- <li><a href="Formulario.html">Login</a></li>  -->
       <!-- <li><a href="listarPersonas.php">Gestiona el elenco</a></li>  -->
      </ul>
    </div>
  </div>
</nav>

<?php
# Si no entiendes el código, primero mira a login.php
# Iniciar sesión para usar $_SESSION
session_start();
# Y ahora leer si NO hay algo llamado usuario en la sesión,
# usando empty (vacío, ¿está vacío?)
# Recomiendo: https://parzibyte.me/blog/2018/08/09/isset-vs-empty-en-php/
if (empty($_SESSION["usuario"])) {
    # Lo redireccionamos al formulario de inicio de sesión
    header("Location: formulario.html");
    # Y salimos del script
    exit();
}
# No hace falta un else, pues si el usuario no se loguea, todo lo de abajo no se ejecuta
echo "Soy un mensaje secreto";
?>
<!-- Por cierto, también se puede usar HTML como en todos los scripts de PHP-->
<p>
    Bienvenido al sistema STRANGER THINGS
</p>
<!-- Y aprovechando, le indicamos al usuario un enlace para salir-->
<a href="logout.php">Cerrar sesión</a>

<!-- Third Container (Grid) -->
<div class="container-fluid bg-3 text-center">    
  <h3 class="margin">Stranger Things</h3><br>
  <div class="row">
    <div class="col-sm-4">
      <p>La historia arranca durante la década de los 80, en el pueblo ficticio de Hawkins, Indiana, cuando un niño llamado Will Byers desaparece misteriosamente, hecho que destapa los extraños sucesos que tienen lugar en la zona, producto de una serie de experimentos que realiza el gobierno en un laboratorio científico cercano. Además, en la ciudad aparecen fuerzas sobrenaturales inquietantes, así como una niña muy extraña. Ella, junto con los amigos de Will, se encargará de buscarlo, sin imaginar lo que tendrán que enfrentar para encontrarlo. Inadvertidamente, crearon un portal a una dimensión alternativa llamada «Upside Down» («El otro lado»). La influencia del «otro lado» comienza a afectar a los desconocidos residentes de Hawkins de manera calamitosa.</p>
      <img src="Images/pic02.jpg" class="img-responsive margin" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-4"> 
      <p>La primera temporada comienza en noviembre de 1983, cuando Will Byers es secuestrado por una criatura del «otro lado» (demogorgon). Su madre, Joyce, y el jefe de policía del pueblo, Jim Hopper, buscan a Will. Al mismo tiempo, una joven psicoquinética llamada «Once» escapa del laboratorio y ayuda a los amigos de Will que son Mike, Dustin y Lucas, en sus propios esfuerzos por encontrar a Will.</p>
      <img src="Images/pic03.jpg" class="img-responsive margin" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-4"> 
      <p>La segunda temporada se establece un año más tarde, comenzando en octubre de 1984. Will ha sido rescatado, pero pocos conocen los detalles de los eventos. Cuando se descubre que Will todavía está siendo influenciado por entidades del otro lado, sus amigos y familiares descubren que existe una amenaza mayor para su universo desde el Otro Lado</p>
      <img src="Images/pic04.jpg" class="img-responsive margin" style="width:100%" alt="Image">
    </div>
  </div>
</div>

<!-- Footer -->
<footer class="container-fluid bg-4 text-center">
 <!-- <p>Bootstrap Theme Made By <a href="https://www.w3schools.com">www.w3schools.com</a></p> -->
  <p>Innova Colombia <a href="https://www.w3schools.com">Proyecto_: Stranger Things</a></p> 
  <p>Politecnico Internacional - Harol.Torres@pi.edu.co <a href="https://www.w3schools.com">Bogota D.C - 2022</a></p> 
</footer>
</body>
</html>