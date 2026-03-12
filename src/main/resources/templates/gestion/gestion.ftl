
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestión</title>
    <link rel="stylesheet" href="/public/css/gestion.css">
</head>
<body>
    <#include "/templates/cabecera.ftl">

    <div class="contenedor">
        
        <div class="cuadrado">
            <a href="/gestionTorneos">TORNEOS</a>
        </div>
        <div class="cuadrado">
            <a href="/gestionEquipos">EQUIPOS</a>
        </div>
        <div class="cuadrado">
            <a href="/gestionJugadores">JUGADORES</a>
        </div>

    </div>
    <br>
    <br>
<#include "/templates/footer.ftl">
</body>
</html>
