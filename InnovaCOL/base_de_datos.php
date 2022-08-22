<?php
/*
	CRUD con MySQL y PHP
	@date 2020-10-10
*/
$contraseña = "Colombia2020.";
$usuario = "root";
$nombre_base_de_datos = "StrangerThings2";
try{
	$base_de_datos = new PDO('mysql:host=localhost;dbname=' . $nombre_base_de_datos, $usuario, $contraseña);
}catch(Exception $e){
	echo "Ocurrió algo con la base de datos: " . $e->getMessage();
}
?>