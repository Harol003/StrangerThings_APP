<?php
if(!isset($_GET["id"])) exit();
$id = $_GET["id"];
include_once "base_de_datos.php";
$sentencia = $base_de_datos->prepare("DELETE FROM info_actor2 WHERE id = ?;");
$resultado = $sentencia->execute([$id]);
if($resultado === TRUE) echo "Eliminado correctamente";
else echo "Algo salió mal";
?>

<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Eliminar Datos STAFF Actor StrangerThings2</title>
	<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<style>
	table, th, td {
	    border: 1px solid black;
	}
	body {
    font: 20px Montserrat, sans-serif;
    line-height: 1.8;
    color: #137ae2;
  }
  p {font-size: 16px;}
  .margin {margin-bottom: 45px;}
  .bg-1 { 
    background-color: #0e0f0f; /* Green */
    color: #000000;
  }
  .bg-2 { 
    background-color: #62519e; /* Dark Blue */
    color: #0c0b0b;
  }
  .bg-3 { 
    background-color: #ec0909; /* White */
    color: #ec0f0f;
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
      <a class="navbar-brand" href="index.html">Programacion II</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="index.html">Regresa al Home</a></li>
      </ul>
    </div>
  </div>
  </nav>
  <br><br>
	<img src="Images/stranger_banner.jpg" class="img-responsive margin" style="width:100%" alt="Image">
	<br><br>
  <!-- Footer -->
<footer class="container-fluid bg-4 text-center">
 <!-- <p>Bootstrap Theme Made By <a href="https://www.w3schools.com">www.w3schools.com</a></p> -->
  <p>Innova Colombia <a href="https://www.w3schools.com">Proyecto_: Stranger Things</a></p> 
  <p>Politecnico Internacional - Harol.Torres@pi.edu.co <a href="https://www.w3schools.com">Bogota D.C - 2022</a></p> 
</footer>
</body>
</html>