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
            <a href="crearJugador">CREAR</a>
        </div>
        <div class="cuadrado">
            <a href="editarJugador">EDITAR</a>
        </div>
        <div class="cuadrado">
            <a href="borrarJugador">BORRAR</a>
        </div>

    </div>

   <#include "/templates/footer.ftl">

</body>
</html>