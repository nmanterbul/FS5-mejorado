<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet"  type="text/css" href="/css/gestion.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>

    <#include "/templates/cabecera.ftl">

    <div class="contenedor">

        <div class="cuadrado">
            <a href="crearEquipo">CREAR</a>
        </div>
        <div class="cuadrado">
            <a href="editarEquipo">EDITAR</a>
        </div>
        <div class="cuadrado">
            <a href="borrarEquipo">BORRAR</a>
        </div>

    </div>

   <#include "/templates/footer.ftl">

</body>
</html>