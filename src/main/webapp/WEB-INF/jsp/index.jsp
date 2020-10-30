<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nombre</title>
</head>
<body>
Inserta el nombre del propietario de coches:
<form action="http://localhost:8080/coche" method="POST">
	<input type="text" name="nombre">
	<input type="submit" value="submit">
</form>
</body>
</html>